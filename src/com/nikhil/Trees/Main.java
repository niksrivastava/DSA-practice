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

        BST tree = new BST();
        tree.populate(new int[] {5, 2, 7, 6, 1, 9, 4, 10, 3});
        tree.display();
    }
}
