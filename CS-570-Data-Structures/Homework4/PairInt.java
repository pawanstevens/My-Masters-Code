/* Name:- Pawan Kumar
   CS 570-B
   Homework 4
*/

public class PairInt
{
	private int x;
	private int y;

	public PairInt(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	// get methods
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	// set methods
	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	public boolean equals(Object p) 
	{
		if (p == null)
		{
			return false;
		}
		
		else
	    
		{
		PairInt value = (PairInt) p;
		return (this.x == value.x && this.y == value.y);
    	}
	}
	
	 public String toString() 
	 {
		 return "[" +  this.x +  ","  + this.y +  "]" + " ";
	 }
	 
	
	public PairInt copy() 
	{	
		PairInt val = new PairInt(this.x, this.y);
		return val;
	}
}