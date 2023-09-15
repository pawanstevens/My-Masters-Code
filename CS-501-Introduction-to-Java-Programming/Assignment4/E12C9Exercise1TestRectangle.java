import java.util.InputMismatchException;
import java.util.Scanner;
public class E12C9Exercise1TestRectangle {
	public static void main (String[] args)
	{
		System.out.println("This program is all about forming Rectangle class and testing it with values.");
		System.out.println("First we will test with two default value sets and then ask user to enter values. \n");
		Scanner input = new Scanner(System.in);
		int repeat = 1;
		try {
			Rectangle r1 = new Rectangle(4, 40);
			System.out.println("For Rectangle 1");
			System.out.println("Width : " + r1.width);
			System.out.println("Height is : " + r1.height);
			System.out.println("Area of Rectangle 1 is : " + r1.getArea());
			System.out.println("Perimeter of Rectangle 1 is : " + r1.getPerimeter() + "\n");
			
			Rectangle r2 = new Rectangle(3.5, 35.9);
			System.out.println("For Rectangle 2");
			System.out.println("Width : " + r2.width);
			System.out.println("Height is : " + r2.height);
			System.out.println("Area of Rectangle 1 is : " + r2.getArea());
			System.out.println("Perimeter of Rectangle 1 is : " + r2.getPerimeter());
		}
		catch(Exception e)
		{
		}
			 while(repeat == 1)
			{
			 try 
			{
				
			System.out.println("\nPlease enter values of your choice to create your own rectangle");
			System.out.print("Please enter a positive number value of the width  : ");
			double width = input.nextDouble();
			System.out.print("Please enter a positive number value of the height : ");
			double height = input.nextDouble();
			Rectangle r3 = new Rectangle(width,height);
			System.out.println("Width entered by you is   : " + r3.width);
			System.out.println("Height entered by you is  : " + r3.height);
			System.out.println("Area of Rectangle is      : " + r3.getArea());
			System.out.println("Perimeter of Rectangle is : " + r3.getPerimeter() + "\n");
			System.out.print("Please enter 1 to repeat or enter 0 to quit : ");

			repeat = input.nextInt();
			}
			 catch(InputMismatchException e)
			 {
				
			input.next();
			System.out.println("Invalid input: Please enter a positive number value and try again from start by entering width value ");
				
	           }
			
	       catch (Exception e) 
		{   	
		   System.out.println(e.getMessage());
           System.out.println("Try Again from start");
		}
	    }
        input.close();
	}
	}
