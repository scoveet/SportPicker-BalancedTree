import jsjf.*;
import java.util.*;
import java.io.*;

/**
 * The DecisionTree class uses the LinkedBinaryTree class to implement 
 * a binary decision tree. Tree elements are read from a given file and  
 * then the decision tree can be evaluated based on user input using the
 * evaluate method. 
 * 
 * @author Yixin Wang
 * @version T00735859
 */
public class DecisionTree
{
	private LinkedBinaryTree<String> tree;

	/**
	 * Builds the decision tree based on the contents of the given file
	 *
	 * @param filename the name of the input file
	 * @throws FileNotFoundException if the input file is not found
	 */
	public DecisionTree(String filename) throws FileNotFoundException
	{
		//constructors that reads the string elemented from the given file to tree nodes
		File inputFile = new File(filename);
		Scanner scan = new Scanner(inputFile);
		int numberNodes = scan.nextInt();
		scan.nextLine();
		int root = 0, left, right;
//nodes are scanned and stored in the new object of LinkedBinaryTree<String>
		List<LinkedBinaryTree<String>> nodes = new java.util.ArrayList<LinkedBinaryTree<String>>();
		
		for (int i = 0; i < numberNodes; i++)
			nodes.add(i, new LinkedBinaryTree<String>(scan.nextLine()));//reads the string elements, create a new node for every new line 

		while (scan.hasNext())//continue until a leaf is found(no more next)
		{
			root = scan.nextInt();//tree scanned from bottom up. Root -> left -> right
			left = scan.nextInt();
			right = scan.nextInt();
			scan.nextLine();

			nodes.set(root, new LinkedBinaryTree<String>((nodes.get(root)).getRootElement(), 
					nodes.get(left), nodes.get(right))); //set the elements from root, left, and right into the current set of root, left, and right nodes
		}
		
		tree = nodes.get(root);// the last root set as treee root
		scan.close();//close the scanner to prevent memory leak
	}

	/**
	 *  Follows the decision tree based on user responses.
	 */
	public void evaluate()
	{
		LinkedBinaryTree<String> current = tree;
		Scanner scan = new Scanner(System.in);

		while (current.size() > 1)
		{
			System.out.println(current.getRootElement());
			if (scan.nextLine().equalsIgnoreCase("N"))//if no, left
				current = current.getLeft();
			else
				current = current.getRight();//else, yes
		}

		System.out.println(current.getRootElement());//print the leaf
		scan.close();//close the scan to prevent memory leak
	}
	
}