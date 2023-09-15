import java.util.InputMismatchException;
import java.util.Scanner;
public class E12C10E13Rectangle 
{
  public static void main (String[] args)
  {
	  System.out.println("In this program we will define MyRectangle2D class,from which you will be able "
	  		            + "to perform 4 tests on two rectangles");
	  System.out.println("The four tests are:-"+
	  		          "\n1.Inclusion -    Whether one rectangle entirely within the other "+
			         "\n2.Overlap -      Whether two rectangles are overlapping,having some points in common and some points not"
	  		          + "\n3.Abutment -     When two rectangles have only boundary points in common"
			          +"\n4.Distinctions - No points in common");
	  Scanner input = new Scanner(System.in);
	  double x , y, width, height;
	  int repeat = 5;
	  int repeats = 1;
	  MyRectangle2D base = new MyRectangle2D();
	  MyRectangle2D test = new MyRectangle2D();
	  while (repeat != 0)
	  {
		  repeats = 1;
		  try
		  {
			  
		    System.out.println("\nEnter Values for Base Rectangle");
			System.out.print("Enter number values for center point of Base rectangle separated by a space (x,y): ");
			x = input.nextDouble();
			y = input.nextDouble();
			System.out.print("Enter number values for width for Base rectangle: ");
			width = input.nextDouble();
			System.out.print("Enter number values for height for Base rectangle: ");
			height = input.nextDouble();
			base = new MyRectangle2D(x,y,width,height);
			System.out.println("The Area of the base rectangle  is : " + base.getArea());
			System.out.println("The Perimeter of the base rectangle  is : " + base.getPerimeter());
		  }
		  catch(InputMismatchException ex)
			{
				input.next();				
				System.out.println("Invalid Input: Please enter a number value " + 
				"\nPlease Try Again");
				repeats = 0;
			}
			
			catch(Exception ex)
			{
			
				System.out.println(ex.getMessage());
				System.out.println("Please Try Again");
				repeats = 0;
			}
		  
	     while(repeats == 1)
	     {
	    	 try
	    	 {
	    		
	    	    System.out.println("\nEnter values for Test rectangle");
	    	    System.out.print("Enter number values for center point of Test rectangle separated by a space (x,y): ");
				x = input.nextDouble();
				y = input.nextDouble();
				System.out.print("Enter number values for width for Test rectangle: ");
				width = input.nextDouble();
				System.out.print("Enter number values for height for Test rectangle: ");
				height = input.nextDouble();
				test = new MyRectangle2D(x,y,width,height);
				System.out.println("The Area of the Test rectangle  is : " + test.getArea());
				System.out.println("The Perimeter of the Test rectangle  is : " + test.getPerimeter());
				System.out.println("\nNow we will perform the four tests: \n");
				if(base.contains(test))
				{
					System.out.println("1.INCLUSION -(TRUE) Base Rectangle contains Test Rectangle");
				}
				else if(test.contains(base))
				{
					System.out.println("1.INCLUSION -(TRUE) Test Rectangle contains Base Rectangle");
				}
				else
				{
					System.out.println("1.INCLUSION -(FALSE) None Rectangle contains the other");
				}
				
				if(base.overlaps(test))
				{
					System.out.println("2.OVERLAP -(TRUE) Base Rectangle and Test Rectangle overlaps");
				}
				else
				{
					System.out.println("2.OVERLAP -(FALSE) Base Rectangle and Test Rectangle do NOT overlap");
				}
				
				if(base.abutment(test))
				{
					System.out.println("3.ABUTMENT -(TRUE) Base Rectangle and Test Rectangle HAVE ONLY Boundary points in common ");
				}
				else
				{
					System.out.println("3.ABUTMENT -(FALSE) Base Rectangle and Test Rectangle NOT HAVE ONLY Boundary points in common");
				}
				
				if((!(base.contains(test))) && (!(base.overlaps(test))) && (!(base.abutment(test))))
				{
					System.out.println("4.DISTINCT -(TRUE) Base Rectangle and Test Rectangle are Distinct");
				}
				else
				{
					System.out.println("4.DISTINCT -(FALSE) Base Rectangle and Test Rectangle are NOT Distinct");
				}
				System.out.println("\nEnter '0' to exit the whole program"
						   + "\nEnter '1' to test another test rectangle with the same base rectangle"
						   + "\nEnter '2' to test with two new Rectangles");
			repeats = input.nextInt();
			if(repeats == 0)
			{
			  repeat = 0;
			  
			}
				
	    	 }
				catch(InputMismatchException ex)
					{
						input.next();
						System.out.println("Invalid Input: Please enter a number value " + 
						"\nPlease Try Again");
					
					}
					
					catch(Exception ex)
					{
						
						System.out.println(ex.getMessage());
						System.out.println("Please Try Again");
						
					}
				
				
				
	    	 }
	    	 
	  
  }

}
}
