
public class Rectangle {
	double width = 1.0;
	double height = 1.0;
	String Error = "";
	
	Rectangle()
	{
		width = 1.0;
		height = 1.0;
		
	}
	
	Rectangle(double userwidth,double userheight) throws Exception
	{
		setWidth(userwidth);
		setHeight(userheight);
	}
	public void setWidth(double newwidth) throws Exception
	{
		if(!isvalidWidth(newwidth))
		{
			throw new Exception(Error);
		}
		width = newwidth;
	}
	public void setHeight(double newheight) throws Exception
	{
		if(!isValidheight(newheight))
		{
			throw new Exception(Error);
		}
		height = newheight;
	}
	public boolean isvalidWidth(double xwidth)
	{
		if(xwidth<0)
		{
			Error = "Invalid input : Please enter a positive number for width";
			return false;
		}
		else if(xwidth == 0)
		{
			Error = "Invalid input : Please enter a number value for width which is not zero";
			return false;
		}
		else
		{
			return true;
		}
	}
		
		public boolean isValidheight(double xheight)
		{
			if(xheight<0)
			{
				Error = "Invalid input : Please enter a positive number for height";
				return false;
			}
			else if(xheight == 0)
			{
				Error = "Invalid input : Please enter a number value for height which is not zero";
				return false;
			}
			else
			{
				return true;
			}
	}
	
	double getArea()
	{
		return width*height;
	}
	
	double getPerimeter()
	{
		return 2*(width + height);
	}
	String getErrorMessage()
	{
		return Error;
	}

}
