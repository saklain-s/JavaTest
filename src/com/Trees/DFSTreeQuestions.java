package com.Trees;

import java.lang.runtime.TemplateRuntime;
import java.util.*;

public class DFSTreeQuestions {

     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {
         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
  }
    int diameter = 0;
    // Q:543 Diameter of binary tree
    public int diameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter - 1;
    }
    int height(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter,dia);
        return Math.max(leftHeight,rightHeight)+1;
    }

    // Q: 226. Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    // Q: 104 maximum depth of binary tree
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int  left = maxDepth(root.left);
        int  right = maxDepth(root.right);

        return Math.max(left,right)+1;
    }

    //Q: 114 Flatten Binary Tree to Linked List
    public void flatten(TreeNode root) {

        TreeNode current = root;
        while (current != null){
            if (current.left != null){
                TreeNode temp = current.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    // Q: 98 validate binary search tree
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);

    }
    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }
        if(low != null && node.val <= low){
            return false;
        }
        if (high != null && node.val >= high){
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val,high);

        return leftTree && rightTree;
    }

    // Q: 236 236. Lowest Common Ancestor of a Binary Tree
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }

        if (root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);

        if (left != null && right != null){
            return root;
        }

        return left == null ? right : left;

    }

    public int kthSmallest(TreeNode root, int k) {
        return helper(root,k).val;

    }
int count = 0;
    // Q:230. Kth Smallest Element in a BST
    public TreeNode helper(TreeNode root, int k){
        if (root == null){
            return null;
        }
        TreeNode left = helper(root.left,k);

        if (left != null){
            return left;
        }
        count++;

        if (count == k){
            return root;
        }

        return helper(root.right,k);
    }

    // Q: 105. Construct Binary Tree from Preorder and Inorder Traversal
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0){
            return null;
        }
        int r = preorder[0];
        int index = 0;

        for (int i = 0; i <inorder.length ; i++) {
            if (inorder[i] == r){
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1),Arrays.copyOfRange(inorder, 0, index ));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length),Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return node;
    }

    // Q: 297. Serialize and Deserialize Binary Tree

    // Encodes a tree to a single string.

    public List<String> serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    void helper(TreeNode node, List<String> list){
        if (node == null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right,list);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> data) {
        Collections.reverse(data);
        TreeNode node = helper2(data);
        return node;
    }
    TreeNode helper2(List<String> list){
        String val = list.remove(list.size() -1);
        if (val.charAt(0) == 'n'){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(list);
        node.right= helper2(list);

        return node;
    }

    /*
      public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    // Helper function for serialization using pre-order traversal.
    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            // Append 'n' for null nodes, followed by a delimiter.
            sb.append("n").append(",");
        } else {
            // Append the node's value and the delimiter.
            sb.append(node.val).append(",");
            // Recursively build the string for left and right children.
            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // If the data is empty or represents a null tree, return null.
        if (data == null || data.isEmpty()) {
            return null;
        }

        // Use a queue to process nodes in FIFO order.
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }

    // Helper function for deserialization to reconstruct the tree.
    private TreeNode buildTree(Queue<String> nodes) {
        // Get the next node value from the queue.
        String val = nodes.poll();

        // If the value is 'n', it's a null node.
        if (val.equals("n")) {
            return null;
        }

        // Create the node with the parsed integer value.
        TreeNode node = new TreeNode(Integer.parseInt(val));

        // Recursively build the left and right subtrees.
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);

        return node;
    }
     */

    // Q: 112 Path Sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null){
            return  true;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }

    // Q: 129. Sum Root to Leaf Numbers
    public int sumNumbers(TreeNode root) {
        return helper3(root, 0);
    }

    int helper3(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }
        return helper3(node.left, sum) + helper3(node.right, sum);
    }

    int ans = Integer.MAX_VALUE;
    // Q: Binary Tree Maximum Path Sum
    public int maxPathSum(TreeNode root) {
        helper4(root);
        return ans;
    }
    int helper4(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = helper4(node.left);
        int right = helper4(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left + right +node.val;

        ans  = Math.max(ans, pathSum);

        return Math.max(left, right)+node.val;
    }

    // Q:findPath
    boolean findPath(TreeNode node, int[] arr){
        if (node == null){
            return arr.length == 0;
        }
        return helper5(node, arr, 0);
    }
    boolean helper5(TreeNode node, int[] arr, int index){
        if (node == null){
            return false;
        }
        if (index >= arr.length || node.val != arr[index]){
            return false;
        }
        if (node.left == null && node.right == null && index == arr.length-1){
            return true;
        }
        return helper5(node.left, arr, index +1) || helper5(node.right, arr,index+1);
    }

    int countPaths(TreeNode node, int sum){
        List<Integer> path = new LinkedList<>();
        return helper6(node, sum, path);
    }
    int helper6(TreeNode node, int sum, List<Integer> path){
        if (node == null){
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;
        // how many paths I can make
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()){
            s += itr.previous();

            if (s == sum){
                count++;
            }
        }
        count += helper6(node.left, s, path)+ helper6(node.right, s, path);
        // backtrack
        path.remove(path.size() -1);
        return count;
    }

    // put in a list
    List<List<Integer>> findPaths(TreeNode node, int sum){
        List<List<Integer>> paths = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        return paths;
    }
   void helper7(TreeNode node, int sum, List<Integer> path, List<List<Integer>> paths){
        if (node == null){
            return;
        }

        path.add(node.val);

        if (node.val == sum && node.left == null && node.right == null){
            paths.add(new ArrayList<>(path));
        }
        else {
            helper7(node.left, sum-node.val, path, paths);
            helper7(node.right, sum-node.val, path, paths);

        }
        // backtrack
        path.remove(path.size()-1);
    }

    // dfs using stack
    void dfsStack(TreeNode node){
        if (node == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()){
            TreeNode removed = stack.pop();
            System.out.print(removed.val);
            if (removed.right != null){
                stack.push(removed.right);
            }
            if (removed.left != null){
                stack.push(removed.left);
            }
        }
    }

}
