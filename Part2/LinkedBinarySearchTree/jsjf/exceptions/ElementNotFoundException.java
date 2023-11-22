package jsjf.exceptions;

/**
 * ElementNotFoundException represents the situation in which a target element 
 * is not present in a collection
 *
//Yixin Wang
//T00735859
 */
public class ElementNotFoundException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 */
	public ElementNotFoundException (String collection)
	{
		super ("The target element is not in this " + collection);
	}
}
