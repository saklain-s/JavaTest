package com.Trees;

public class AVL {
    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.height = 0; // Leaf node starts with height 0
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public int height() {
        return height(root);
    }


    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        } else {
            return node; // Duplicate, skip
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        // Left heavy
        if (balance > 1) {
            if (height(node.left.left) >= height(node.left.right)) {
                return rightRotate(node); // Left-Left case
            } else {
                node.left = leftRotate(node.left); // Left-Right case
                return rightRotate(node);
            }
        }

        // Right heavy
        if (balance < -1) {
            if (height(node.right.right) >= height(node.right.left)) {
                return leftRotate(node); // Right-Right case
            } else {
                node.right = rightRotate(node.right); // Right-Left case
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;

        return p;
    }

    public void populate(int[] nums) {
        for (int value : nums) {
            this.insert(value);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        int balanceFactor = Math.abs(height(node.left) - height(node.right));
        return balanceFactor <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }
}