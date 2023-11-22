//Yixin Wang
//T00735859

import jsjf.*;
//testing the LinkedBinarySearchTree class with balanced tree. Testing add element(), to string(), findMin(), findMax()
public class BalancedBSTTest {
    public static void main(String[] args) {
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<Integer>();

        System.out.println("Adding elements 50,40,60,30,45,55,65,50,30 to the tree:");
        tree.addElement(50);
        tree.addElement(40);
        tree.addElement(60);
        tree.addElement(30);
        tree.addElement(45);
        tree.addElement(55);
        tree.addElement(65);
        tree.addElement(50);//repeated element(same as root)
        tree.addElement(30);//repeated element(left subtree)

        System.out.println("Binary Search Tree:");
        System.out.println(tree.toStringPreOrder());//preorder traversal of the tree, just to better visualize it
        System.out.print("min element:");
        System.out.println(tree.findMin());//find the minimum element
        System.out.print("max element:");
        System.out.println(tree.findMax());//find the maximum element
        System.out.println("height of the tree:");
        System.out.println(tree.getHeight());//find the height of the tree
        System.out.println("number of nodes:");
        System.out.println(tree.size());//find the number of nodes in the tree
        System.out.println("Remvoing element 65:");
        tree.removeElement(65);//remove element 65
        System.out.println(tree.toStringPreOrder());//print out tree after removal
        System.out.println("Remvoing all element that is 30:");
        tree.removeAllOccurrences(30);//remove all occurrences of 30
        System.out.println(tree.toStringPreOrder());//print out tree after removal
        System.out.println("min element:");
        System.out.println(tree.findMin());//find the minimum element now
        System.out.println("max element:");
        System.out.println(tree.findMax());//find the maximum element now
        System.out.println("height of the tree:");
        System.out.println(tree.getHeight());//find the height of the tree now
        System.out.println("number of nodes:");
        System.out.println(tree.size());//find the number of nodes in the tree now

        

    
    }
}
