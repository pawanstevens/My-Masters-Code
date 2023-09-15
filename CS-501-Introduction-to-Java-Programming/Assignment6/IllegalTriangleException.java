
public class IllegalTriangleException extends Exception
{
	private static final long serialVersionUID = 1L;

	public IllegalTriangleException(double side1, double side2, double side3) 
	{
		super("Invalid Input " + "\nThe sum of any two sides of a triangle must be greater than the other side" +
	          "\nPlease Try Again");
	}
}