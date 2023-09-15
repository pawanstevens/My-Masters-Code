import java.util.Scanner;
class Edition12C4E2GreatCircleDistance 
{
	public static void main(String[] args) 
	{
		System.out.println("This program is about calculating the distance between two points on the surface of sphere \n");
		double x1,x2,y1,y2,distance;
		Scanner input = new Scanner(System.in);
		System.out.println("The latitude and longitude degrees in the formula which we are using is for north and west. Use negative to indicate south and east degrees \n");
		System.out.print("Enter point 1 latitude and longitude value in numbers and in degrees, with space and without parenthesis : ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		System.out.println("");
		System.out.print("Enter point 2 latitude and longitude value in numbers and in degrees, with space and without parenthesis : ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		System.out.println("");
		distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		x1 = Math.toDegrees(x1);
		x2 = Math.toDegrees(x2);
		y1 = Math.toDegrees(y1);
		y2 = Math.toDegrees(y2);
		System.out.println("The distance between the points " + x1 + "," + y1 + " and " + x2 + "," + y2 + " is : " + distance+"Km");
	}
}