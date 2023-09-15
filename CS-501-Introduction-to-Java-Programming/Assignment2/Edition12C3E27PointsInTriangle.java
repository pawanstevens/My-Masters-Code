import java.util.Scanner;
class Edition12C3E27PointsInTriangle 
{
	public static void main(String[] args) 
	{
		System.out.println("In this program we will find out whether a point is inside the triangle or not\n");
		double x,y,x1=0,y1=100,x2=0,y2=0,x3=200,y3=0,denominator,a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number values of X and Y co-ordinate of a point separated by a space and without parentheses : ");
		x = input.nextDouble();
		y = input.nextDouble();
		denominator = ((y2 - y3) * (x1 - x3) + (x3 - x2) * (y1 - y3));
		a = (((y2 -y3) * (x - x3) + (x3 - x2) * (y - y3))/ denominator);
		b = (((y3 - y1) * (x - x3) + (x1 - x3) * (y - y3))/ denominator);
		c = 1 - a - b;
		if (0 <= a && 0 <= b && 0 <= c)
		{
			if(a<=1 && b<=1 && c<=1)
			{	
			   System.out.println("The given point whose x-coordinate is "+ x + " and y-coordinate is " + y + " is inside the triangle");
			}
			else
			{	
				System.out.println("The given point whose x-coordinate is "+ x + " and y-coordinate is " + y + " is not inside the triangle");
			}
		}
		else
		{	
			System.out.println("The given point whose x-coordinate is "+ x + " and y-coordinate is " + y + " is not inside the triangle");
		}
		
	}
}
