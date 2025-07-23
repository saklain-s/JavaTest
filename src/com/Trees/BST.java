package com.Trees;

class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
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
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            this.insert(num);
        }
    }
    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        int mid = ( start + end) /2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        preOrder(root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }
    public void postOrder(){
        preOrder(root);
    }
    private void postOrder(Node node){
        if (node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");

    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums={5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
    }
}
// 2:30:18
