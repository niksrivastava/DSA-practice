package com.nikhil.Trees;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scanner);
        // tree.display();
        // System.out.println();
        // tree.prettyDisplay();

        // BST tree = new BST();
        // tree.populate(new int[] {5, 2, 7, 6, 1, 9, 4, 10, 3});
        // tree.display();

        AVL tree = new AVL();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println("Height: " + tree.height());
        System.out.println("Balanced: " + tree.balanced());

    }
}
