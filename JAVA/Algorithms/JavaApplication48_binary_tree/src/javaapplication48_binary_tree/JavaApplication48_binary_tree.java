/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48_binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication48_binary_tree {

    public static void preorderIter (treeNode root) { //In PreOrder traversal,each node is processed before either of its sub-trees.
        //In simpler words,Visit each node before its children.
/*Steps for PreOrder traversal are:
Visit the node.
Traverse the left subtree in PreOrder.
Traverse the right subtree in PreOrder.*/
        if (root == null){
            return;
        }
        Stack <treeNode> stack = new Stack<treeNode>();
        stack.push(root);
        
        while (!stack.isEmpty()){
            treeNode n = stack.pop();
            System.out.printf("%d ", n.data);
            
            if (n.right != null){
                stack.push(n.right);
            }
            if (n.left != null){
                stack.push(n.left);
            }
        }
    }
    
    public static void preorderRecursion (treeNode root) {
        if (root != null){
            System.out.printf("%d ", root.data);
            preorderRecursion(root.left);
            preorderRecursion(root.right);
        }
    }
    
    public static void inorderIter(treeNode root){
        // Each node is processed between subtrees.In simpler words,Visit left subtree, node and then right subtree.
/*Steps for InOrder traversal are:
Traverse the left subtree in InOrder.
Visit the node.
Traverse the right subtree in InOrder.*/
        
        Stack<treeNode> stack = new Stack();
        treeNode currentNode = root;
        
        if(root == null){
            return;
        }
      
        while(!stack.isEmpty() || currentNode != null){
            if (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            else{
                treeNode n = stack.pop();
                System.out.printf("%d ", n.data);
                currentNode = n.right;
            }
        }
    }
    public static void inorderRecursion(treeNode root){
        if(root != null){
            inorderRecursion (root.left);
            System.out.printf("%d ", root.data);
            inorderRecursion (root.right);
        }   
    }
    
    public static void postorderIter(treeNode root){
        // In PostOrder traversal, each node is processed after subtrees traversal.
        // In simpler words,Visit left subtree,  right subtree and then node.
/* Steps for PostOrder traversal are:
Traverse the left subtree in PostOrder.
Traverse the right subtree in PostOrder.
Visit the node.*/

        if(root == null) return;
        Stack <treeNode> stack = new Stack();
        treeNode current = root;
        
        while (true) {
            if(current != null){
                if(current.right != null){
                    stack.push(current.right);
                }
                stack.push(current);
                current = current.left;
                continue;
            }
            if (stack.isEmpty()) return;
            
            current = stack.pop();            
            if (current.right != null && !stack.isEmpty() && current.right==stack.peek()){
                stack.pop();
                stack.push(current);
                current = current.right;
            }
            else {
                System.out.printf("%d ", current.data);
                current = null;
            }                       
        }        
    }
    
    public static void postorderRecursion(treeNode root){
        if (root != null){
            postorderRecursion(root.left);
            postorderRecursion(root.right);
            System.out.printf("%d ", root.data);
        }
    }
    
    public static void BFD_levelorder (treeNode current){
        Queue<treeNode> list = new LinkedList();
        list.add(current);
        
        while(!list.isEmpty()){
            current = list.poll();
            System.out.printf("%d ", current.data);
            if(current.left != null){
                list.add(current.left);
            }
            if(current.right != null){
                list.add(current.right);
            }
        }
    }
    public static void reverse_levelorder(treeNode current){
        Queue <treeNode> list = new LinkedList();
        Stack <treeNode> stack = new Stack();
        list.add(current);
        
        while(!list.isEmpty()){
            current = list.poll();            
            if(current.right != null){
               list.add(current.right); 
            }
            if(current.left != null){
               list.add(current.left); 
            }
            stack.push(current);            
        }
        while(!stack.isEmpty()){
            current = stack.pop();
            System.out.printf("%d ", current.data);        
        }
    }    
    
    public static void spiral_levelorder(treeNode current){
        Stack <treeNode> stack = new Stack();
        stack.push(current);
        boolean directionFlag = false;
        
        while(!stack.isEmpty()){
            Stack <treeNode> tempStack = new Stack();
            while (!stack.isEmpty()){
                current = stack.pop();
                System.out.printf("%d ", current.data);
                
                if(!directionFlag){
                    if(current.left != null){
                        tempStack.push(current.left);
                    }
                    if(current.right != null){
                        tempStack.push(current.right);
                    }
                }
                else{
                    if(current.right != null){
                        tempStack.push(current.right);
                    }
                    if(current.left != null){
                        tempStack.push(current.left);
                    }
                }
            }
            directionFlag = !directionFlag;
            stack = tempStack;
        }
    }
    
    public static void printLeafNode (treeNode current){
        if (current == null){
            return;
        }
        if(current.left==null && current.right==null){
            System.out.printf("%d ", current.data);
        }
        printLeafNode(current.left);
        printLeafNode(current.right);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        treeNode rootNode = new treeNode(40);
        treeNode node20   = new treeNode(20);
        treeNode node60   = new treeNode(60);
        treeNode node10   = new treeNode(10);
        treeNode node30   = new treeNode(30);
        treeNode node50   = new treeNode(50);
        treeNode node70   = new treeNode(70);
        
        rootNode.left = node20;
        rootNode.right = node60;
        node20.left = node10;
        node20.right = node30;
        node60.left = node50;
        node60.right = node70;
        
        System.out.println("    root  /   left    /    right  ");
        preorderIter (rootNode);
        System.out.println();
        preorderRecursion (rootNode);
        System.out.println("\n    left  /   root    /    right  ");
        inorderIter (rootNode);
        System.out.println();
        inorderRecursion (rootNode);
        System.out.println("\n    left  /   right    /    root  ");
        postorderIter (rootNode);
        System.out.println();
        postorderRecursion (rootNode);
        System.out.println("\n    root  /   left    /    right   ------  BUT level desc as Breadth First Search  ");
        BFD_levelorder (rootNode);
        System.out.println("\n          reverse level order   ");    
        reverse_levelorder(rootNode);
        System.out.println("\n Spiral Level Order toward down as BFD");
        spiral_levelorder(rootNode);
        System.out.println("\n Leaf Nodes or Nodes in the end");
        printLeafNode(rootNode);

        
    }
    
}
