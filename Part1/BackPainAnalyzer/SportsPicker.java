import java.io.*;

/**
 * BackPainAnaylyzer demonstrates the use of a binary decision tree to 
 * diagnose back pain.
 */
public class SportsPicker
{
	/**
	 *  Asks questions of the user to diagnose a medical problem.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("So, you want to pick a sport.");

		DecisionTree expert = new DecisionTree("sportspicker.txt");
		expert.evaluate();
		
	}
}