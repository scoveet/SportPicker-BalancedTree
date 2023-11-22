import java.io.*;

/**
 * BackPainAnaylyzer demonstrates the use of a binary decision tree to 
 * diagnose back pain.n
 
 */
public class BackPainAnalyzer
{
	/**
	 *  Asks questions of the user to diagnose a medical problem.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("So, you're having back pain.");

		DecisionTree expert = new DecisionTree("input.txt");
		expert.evaluate();
		/*File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);*/ //just to check if the input.txt file is accessible with the current folder path
	}
}