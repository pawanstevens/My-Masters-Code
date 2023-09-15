import java.util.InputMismatchException;
import java.util.Scanner;
public class E12C9Exercise11_12TestLinearEquation {
	public static void main (String[] args)
	{
	 System.out.println("This program is all about Linear Equations and Finding whether two line is intersecting or not\n");
	 Scanner input = new Scanner(System.in);
	 double a,b,c,d,e,f;
	 double x1,y1,x2,y2,x3,y3,x4,y4;
	 int repeat = 1;
	 while (repeat == 1)
	 {
		 try {
			    			 
	 System.out.println("First we will calculate value of x and y from a 2x2 linear equation");
	 System.out.println("Please enter 6 number values, one by one ");
	 System.out.print("Please enter first number value  :  ");
	 a = input.nextDouble();
	 System.out.print("Please enter second number value :  ");
	 b = input.nextDouble();
	 System.out.print("Please enter third number value  :  ");
	 c = input.nextDouble();
	 System.out.print("Please enter fourth number value :  ");
	 d = input.nextDouble();
	 System.out.print("Please enter fifth number value  :  ");
	 e = input.nextDouble();
	 System.out.print("Please enter sixth number value  :  ");
	 f = input.nextDouble();
	 
		 LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);
		 System.out.println("With your values the linear equation looks like this:-");
			System.out.println(l1.getA() +"x " + "+ " + l1.getB()+"y " + "= " + l1.getE());
			System.out.println(l1.getC() +"x " + "+ " + l1.getD()+"y " + "= " + l1.getF());
		 if(l1.isSolvable())
		 {
			 System.out.println("The solution of x and y in the linear equation with the given values " + l1.getA() + "," + l1.getB() + "," 
		                         + l1.getC() + "," + l1.getD() + "," + l1.getE() + "," + l1.getF() + " is" + 
					             " x = " + l1.getX() + " and " + "y = " + l1.getY() );
		 }
	 
		 System.out.println("\nNow we will find the point where two lines intersect");
		 System.out.println("Enter values for line 1 (first end point) ");
		 System.out.print("Enter number value for x1 : ");
		 x1 = input.nextDouble();
		 System.out.print("Enter number value for y1 : ");
		 y1 = input.nextDouble();
		 System.out.println("Enter number value for line 1 (second end point) ");
		 System.out.print("Enter number value for x2 : ");
		 x2 = input.nextDouble();
		 System.out.print("Enter number value for y2 : ");
		 y2 = input.nextDouble();
		 System.out.println("Enter number value for line 2 (first end point)");
		 System.out.print("Enter number value for x3 : ");
		 x3 = input.nextDouble();
		 System.out.print("Enter number value for y3 : ");
		 y3 = input.nextDouble();
		 System.out.println("Enter number value for line 2 (second end point)");
		 System.out.print("Enter number value for x4 : ");
		 x4 = input.nextDouble();
		 System.out.print("Enter number value for y4 : ");
		 y4 = input.nextDouble();
		 LinearEquation l2 = new LinearEquation(x1,y1,x2,y2,x3,y3,x4,y4);
		 if(l2.isIntersect())
		 {
			 System.out.println("Two lines are intersecting at  : " + l2.getpointX() + "," + l2.getpointY());
		 }
		 else
		 {
			System.out.println("Try with different values to get intersecting point");
		 }

	 System.out.print("\nPlease enter 1 if you want to repeat whole program or enter 0 to exit : ");
	 repeat = input.nextInt();
	 }
	 catch(InputMismatchException ex)
	 {
		 input.next();
		 System.out.println("\nInvalid input: Please enter a number value ");
		 System.out.println("Sorry! You have to Start again from first, so 'PLEASE TRY TO GIVE CORRECT INPUT' \n");
	
		 
	 }

	 catch(Exception ex)
	 {
         System.out.println("Try Again");
	 }
	}
	 input.close();
	}
	}

