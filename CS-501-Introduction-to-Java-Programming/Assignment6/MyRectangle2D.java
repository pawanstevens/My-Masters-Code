
public class MyRectangle2D 
{
	private double x,y;
	private double width;
	private double height;
	String Error = "";
	
	public MyRectangle2D()
	{
		x=0;
		y=0;
		width = 1;
		height = 1;
	}
	
	
	MyRectangle2D(double a, double b ,double userwidth,double userheight) throws Exception
	{
		setX(a);
		setY(b);
		y = b;
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
			
			Error = "Invalid Input : Please enter a positive number for width";
			return false;
		}
		else if(xwidth == 0)
		{
			Error = "Invalid Input : Please enter a number value for width which is not zero";
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
				Error = "Invalid Input : Please enter a positive number for height";
				return false;
			}
			else if(xheight == 0)
			{
				Error = "Invalid Input : Please enter a number value for height which is not zero";
				return false;
			}
			else
			{
				return true;
			}
	}
		public boolean contains(double a, double b)
		{
			if ( (a < x+(width/2)) && (a > x-(width/2)) && (b < y+(height/2)) && (b > y-(height/2)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean contains(MyRectangle2D r)
		{
			if ( (r.x+r.width/2 < x+(width/2)) && (r.x-r.width/2 > x-(width/2)) && (r.y+r.height/2 < y+(height/2)) && (r.y-r.height/2 > y-(height/2)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean abutment (MyRectangle2D r)
		{
		
			if(r.getX()+r.getWidth()/2  == this.x-width/2 || this.x+width/2 == r.getX()-r.getWidth()/2 ||r.getY()+r.getHeight()/2  == this.y-height/2 || this.y+height/2 == r.getY()-r.getHeight()/2 )
			{
				return true;
			}
			else 
			{
			
		    return false;
			}
		}
		
		public boolean overlaps(MyRectangle2D r) 
		{
			if(((!contains(r) &&((x + width / 2 > r.getX() - r.getWidth()) ||(y + height / 2 > r.getY() - r.getHeight())) 
					&& (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) && (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2))) || (contains(r)))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			
		private double getDistance(double p1, double p2) 
		{
				return Math.sqrt(Math.pow(p2 - p1, 2));
		}
		public void setX(double a)
		{
			x = a;
		}
		
		public void setY(double b)
		{
			y = b;
		}
		
		public double getX()
		{
			return x;
		}
		
		public double getY()
		{
			return y;
		}
		
		public double getWidth()
		{
			return width;
		}
		
		public double getHeight()
		{
			return height;
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



