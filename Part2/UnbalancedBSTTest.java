//Yixin Wang
//T00735859
import jsjf.*;

//This is to test the linked binary search tree but with the brute force method of balancing. Two degenerate trees are used for testing
public class UnbalancedBSTTest {
    public static void main (String[] args) {
        System.out.println("Testing the LinkedBinarySearchTree class");
        System.out.println("Creating a LinkedBinarySearchTree of integers");
        LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<Integer>();
        LinkedBinarySearchTree<Integer> tree2 = new LinkedBinarySearchTree<Integer>();

        //adding element in ascending order such that creates degenerate tree
        tree.addElement(0);
        tree.addElement(5);
        tree.addElement(10);
        tree.addElement(15);
        tree.addElement(20);
        tree.addElement(25);
        tree.addElement(30);

        System.out.println("Degenertae tree one is: \n" + tree.toStringPreOrder());
        System.out.println("The height of the degenerate tree is: \n" + tree.getHeight());//show the height such that it is a degenerate tree
        System.out.println("The root of the degenerate tree is: \n" + tree.getRootElement()+"\n");//as well as root

        System.out.println("Tree one is undergoing balancing");
        tree.balanceTree();//balance the tree
        System.out.println("The balanced tree is: \n" + tree.toStringPreOrder());//show the balanced tree
        System.out.println("The height of the balanced tree is: \n" + tree.getHeight());//show the height such that it is a degenerate tree
        System.out.println("The root of the balanced tree is: \n" + tree.getRootElement()+"\n");//as well as root

        tree2.addElement(7);
        tree2.addElement(6);
        tree2.addElement(5);
        tree2.addElement(4);
        tree2.addElement(3);
        tree2.addElement(2);
        tree2.addElement(1);
        tree.addElement(0);
        tree.addElement(5);

        System.out.println("Note: Degenerate Tree two has repeated elements and evevn number of nodes to the edge cases");
        System.out.println("Degenertae tree two is: \n" + tree2.toStringPreOrder());//show the preorder traversal and the height
        System.out.println("The height of the degenerate tree two is: \n" + tree2.getHeight());//show the height such that it is a degenerate tree
        System.out.println("The root of the degenerate tree two is: \n" + tree2.getRootElement()+"\n");//as well as root

        System.out.println("Tree two is undergoing balancing");
        tree2.balanceTree();//balance the tree
        System.out.println("The balanced tree two is: \n" + tree2.toStringPreOrder());//show the preorder traversal and the height
        System.out.println("The height of the balanced tree two is: \n" + tree2.getHeight());//show the height such that it is a degenerate tree
        System.out.println("The root of the balanced tree two is: \n" + tree2.getRootElement()+"\n");//as well as root


    }
}

