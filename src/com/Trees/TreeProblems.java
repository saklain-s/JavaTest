package com.Trees;


import java.util.*;

public class TreeProblems {

    // Shared TreeNode class
    public static class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    // 1. Q102: Binary Tree Level Order Traversal
    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(currentLevel);
        }

        return result;
    }

    // 2. Q637: Average of Levels in Binary Tree
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(sum / levelSize);
        }

        return result;
    }

    // 3. Level Order Successor
    public TreeNode levelOrderSuccessor(TreeNode root, int key) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

            if (node.val == key) {
                return queue.peek(); // next node in level order
            }
        }

        return null;
    }

    // 103. Zigzag Level Order Traversal
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode;
                if (!reverse) {
                    currentNode = queue.pollFirst();
                    currentLevel.addLast(currentNode.val);
                    if (currentNode.left != null) queue.addLast(currentNode.left);
                    if (currentNode.right != null) queue.addLast(currentNode.right);
                } else {
                    currentNode = queue.pollLast();
                    currentLevel.addLast(currentNode.val);
                    // Insert right first, then left (so left comes out first when reversed)
                    if (currentNode.right != null) queue.addFirst(currentNode.right);
                    if (currentNode.left != null) queue.addFirst(currentNode.left);
                }
            }

            result.add(currentLevel);
            reverse = !reverse; // Flip direction after each LEVEL, not each NODE
        }

        return result;
    }

    // Q:107: Binary Tree Level Order Traversal
    public List<List<Integer>> levelOrderTraversalWithReversePrinting(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(0,currentLevel);
        }

        return result;
    }
// Q:116 populating next right pointers in each node
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMost = root;
        while (leftMost.left != null) { // bcoz nature of the tree, every node has 2 children
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    // 199. Binary Tree Right Side View
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (i == levelSize -1){
                    result.add(currentNode.val);}
                if (currentNode.left != null){
                    queue.offer(currentNode.left);}
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);}
            }
        }
        return result;
    }

    // Q:993 Cousins in Binary Tree
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                (level(root,xx,0)== level(root, yy , 0)) && (isSibling(root, xx, yy))
                );
    }

    TreeNode findNode(TreeNode node, int x){
        if (node == null){
            return null;
        }
        if (node.val == x){
            return node;
        }
        TreeNode n = findNode(node.left,x);
        if ( n != null){
            return n;
        }
        return findNode(node.right,x);
    }

    boolean isSibling(TreeNode node,TreeNode x, TreeNode y){
        if (node == null){
            return false;
        }
        return (
                (node.left == x && node.right == y) ||
                        (node.left == y && node.right == x)||
                isSibling(node.left, x, y) ||
                isSibling(node.right,x,y)
                );

    }

    int level(TreeNode node, TreeNode x, int lev){
        if(node == null){
            return  -1;
        }
        if (node == x){
            return lev;
        }
        int l = level(node.left, x, lev +1);
        if (l != 0){
            return l;
        }
        return level(node.right, x, lev+1);
    }

    // Q:101. Symmetric Tree
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if (left == null && right == null){
                continue;
            }
            if (left == null || right == null){
                return false;
            }
            if (left.val != right.val){
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);

        }
        return true;
    }
    // Main for testing
    public static void main(String[] args) {
        TreeProblems solver = new TreeProblems();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Level Order: " + solver.levelOrderTraversal(root));
        System.out.println("Average of Levels: " + solver.averageOfLevels(root));
        System.out.println("Level Order Successor of 5: " + (solver.levelOrderSuccessor(root, 5) != null ? solver.levelOrderSuccessor(root, 5).val : "null"));
        System.out.println("Zigzag Level Order: " + solver.zigzagLevelOrder(root));
    }
}
// section 9 continue

