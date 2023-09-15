import java.util.Scanner;
class Edition12C2E19AreaOfTriangle
{
	public static void main(String[] args) 
	{
		System.out.println("This program will find out the area of a triangle with the help of 3 points entered by user");
		double x1,y1,x2,y2,x3,y3,s,side1,side2,side3,area;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter number values of X and Y co-ordinate of first point separated by a space and without parentheses : ");
		x1= input.nextDouble();
		y1= input.nextDouble();
        System.out.print("Enter number values of X and Y co-ordinate of second point separated by a space and without parentheses : ");
		x2= input.nextDouble();
		y2 = input.nextDouble();
		System.out.print("Enter number values of X and Y co-ordinate of third point separated by a space and without parentheses : ");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		side1 = Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)), 0.5);
		side2= Math.pow(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)), 0.5);
		side3 = Math.pow(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)), 0.5);
		s = (side1 + side2 + side3)/2;
		area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5);

        System.out.println("The area of the triangle for given points "+ x1 + "," + y1 + " and " + x2 + "," + y2 + " and " + x3 + "," + y3 + " is  " + area);
	}
}
