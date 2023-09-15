public class Triangle extends GeometricObject 
{
	private double side1;
	private double side2;
	private double side3;
	private String errMessage = " ";
	
  public Triangle()
  {
	  side1=1.0;
	  side2=1.0;
	  side3=1.0;
  }
  public Triangle (double a,double b,double c,String color, boolean filled)throws IllegalTriangleException,Exception
  {
	  // First checking validity of each side
	  setS1(a); 
	  setS2(b);
	  setS3(c);
	  // Now, checking validity of triangle
	  if(!isValidTriangle(a,b,c))
	  {
		  throw new IllegalTriangleException(a,b,c);
	  }
	  else
	  {
		    this.side1 = a;
			this.side2 = b;
			this.side3 = c;
			setColor(color);
			setFilled(filled);
	  }
  } 
 public void setS1(double s1) throws Exception
	{
		if(!isvalidSide(s1))
		{
			throw new Exception(errMessage);
		}
		side1 = s1;
	  }
 public void setS2(double s2) throws Exception
	{
		if(!isvalidSide(s2))
		{
			throw new Exception(errMessage);
		}
		side2 = s2;
	  }
 public void setS3(double s3) throws Exception
	{
		if(!isvalidSide(s3))
		{
			throw new Exception(errMessage);
		}
		side3 = s3;
	  }
 public boolean isvalidSide(double s)
	{
		if((s<0) || (s == 0))
		{
			errMessage = "Invalid Input : Please enter a positive integer number which is greater than '0' for SIDE LENGTHS";
			return false;
		}
		else
		{
			return true;
		}
	}
 public boolean isValidTriangle(double a1, double a2, double a3)
	{
		if(a1+a2 > a3 && a2+a3 > a1 && a1+a3 > a2)
		{	
			return true;
		}
		else
		{
			errMessage = "Invalid Input: Sum of any two sides must be greater than the third\n"
					      + "Please Try Again";
			
			return false;
		}
	}
 
		
 public double getSide1() 
  { 
	return side1; 
  }
 public double getSide2()
 {
   return side2; 
 }
 public double getSide3() 
 { 
	return side3; 
 }
 public String getErrorMessage() 
 { 
	return errMessage; 
 }
 public double getPerimeter() 
 {
	 return side1 + side2 + side3;
 }
  	
 public double getArea()
 {
	 double s = ((side1 + side2 + side3) / 2);
     return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
 }
 public String toString() 
 {
	return "Side1 = " + side1 + ", Side2 = " + side2 + ", Side3 = " + side3;
 }
 
}