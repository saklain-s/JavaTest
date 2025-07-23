package com.Trees;

import java.util.Scanner;
import com.Trees.BinaryTree;
public class Main {


    public static void main(String[] args) {
        // for binary trees
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);   // Input via console
        System.out.println("\nTree Structure:");
        tree.prettyDisplay();


        // for AVL tree
//        AVL tree = new AVL();
//        int[] values = {30, 10, 20, 40, 50, 25};
//        tree.populate(values);
//        tree.display();
//        System.out.println("Is tree balanced? " + tree.balanced());


//        // for segment tree
//        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
//        SegmentTree tree = new SegmentTree(arr);
//        //tree.display();
//        System.out.println(tree.query(1, 6));

    }


}
