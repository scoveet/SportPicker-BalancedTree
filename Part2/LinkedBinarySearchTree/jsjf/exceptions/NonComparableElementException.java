package jsjf.exceptions;

/**
 * NonComparableElementException  represents the situation in which an attempt 
 * is made to add an element that is not comparable to an ordered collection
 *
 * //Yixin Wang
//T00735859
 */
public class NonComparableElementException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 * 
	 * @param collection  the exception message to deliver
	 */
	public NonComparableElementException (String collection)
	{
		super ("The " + collection + " requires Comparable elements.");
	}
}
