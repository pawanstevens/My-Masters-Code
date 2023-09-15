import java.util.Scanner;
class Edition12C3E3CramersRule
{
	public static void main(String[] args) 
	{
		System.out.println("In this Program we will solve 2*2 linear equations using cramer's rule\n");
		double a,b,c,d,e,f,x,y;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number values of a,b,c,d,e,f separated by space and without parenthesis : ");
		a = input.nextDouble();
	    b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		System.out.println("With your values the equation looks like this:-");
		System.out.println(a +"x " + "+ " + b+"y " + "= " + e);
		System.out.println(c +"x " + "+ " + d+"y " + "= " + f );
		if (a*d - b*c == 0)
		{
			System.out.println("The equation with the given values " + a + "," + b + "," + c + "," + d + "," + e + "," + f + " has no solution");
		}
		else
		{
			x = (e*d - b*f)/(a*d - b*c);
			y = (a*f - e*c)/(a*d - b*c);
			System.out.println("The solution of x and y in the linear equation with the given values " + a + "," + b + "," + c + "," + d + "," + e + "," + f + " is " + " x = " + x + " and " + " y = " + y );

		}
    
	}
}
