import java.util.Scanner;
import java.util.InputMismatchException;
public class E12C11E1Triangle 
{
	public static void main (String[] args ) throws Exception
	{
		System.out.println("In this program, we have designed a Triangle class that extends GeometricObject " +
	                        "\nYou can test the triangle class, by putting your values for sides of the triangle" +
				              "\nYou can also put color name, and whether the triangle is filled or not" +
	                           "\nIn the output you will get area, perimeter,color,and whether triangle is filled or not");
		Scanner input = new Scanner(System.in);
		double side1,side2,side3;
		boolean fill;
		String color;
		int repeat = 1;
		int x;
		while(repeat ==1)
		{
			try
			{
				System.out.print("\nPlease enter a positive inetger for length of Side1: ");
				side1 = input.nextDouble();
				System.out.print("Please enter a positive inetger for length of Side2: ");
				side2 = input.nextDouble();
				System.out.print("Please enter a positive inetger for length of Side3: ");
				side3 = input.nextDouble();
				System.out.print("Please enter a colour name: ");
				color = input.next();
				System.out.print("Please enter '1' to set triangle as filled and '0' to not fill: ");
				x = input.nextInt();
				fill = (x == 1);
				Triangle tr = new Triangle(side1,side2,side3,color,fill);
				System.out.println("\nThe triangle, " + tr.toString());
				System.out.println("The color is : " + tr.getColor());
				System.out.println("The perimeter of the triangle is : " + tr.getPerimeter());
				System.out.println("The area of the triangle is : " + tr.getArea());
				System.out.println("Is triangle filled    = " + tr.isFilled());
				System.out.print("Please enter '1' to test another Triangle and '0' to exit: ");
				repeat = input.nextInt();
				
			}
			catch(IllegalTriangleException e)
			{
				
				System.out.println( e );
			
			}
			catch(InputMismatchException ex)
			{
				input.next();
				System.out.println("Invalid Input: Please enter a integer value " + 
				"\nPlease Try Again");
			}
			catch(Exception er)
			{
				
				System.out.println(er.getMessage());
				
			}
			
			
		
	}
          input.close();
	}
}
