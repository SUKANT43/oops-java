package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    Node root;

    Node buildTree(Scanner sc){
        System.out.print("Enter node value (-1 for null): ");
        int val=sc.nextInt();
        if (val==-1){
            return null;
        }
        Node node=new Node(val);
        System.out.println("Enter left child of "+val);
        node.left=buildTree(sc);//-1 means null this will give this line answer as null moves to the next line
        System.out.println("Enter right child of "+val);
        node.right=buildTree(sc);
        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Scanner sc=new Scanner(System.in);
        tree.buildTree(sc);
    }
}

//1-->2-->null-->3