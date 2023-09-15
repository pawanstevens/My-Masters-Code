import java.util.Scanner;
public class Edition12C2E15DistanceBtwPoints
{
	public static void main(String[] args) 
	{
		System.out.println("This Program is about finding the distance between two points");
		double x1,y1,x2,y2,total;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number values of X and Y co-ordinate of first point separated by a space and without parentheses : ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter number values of X and Y co-ordinate of second point separated by a space and without parentheses : " );
		x2= input.nextDouble();
		y2=input.nextDouble();
        total = Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)), 0.5);
		System.out.println("The distance between points " + x1 + "," + y1 + " and " + x2 + "," + y2 + " is  " + total);




	}
}

