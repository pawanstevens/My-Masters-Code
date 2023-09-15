import java.util.InputMismatchException;
public class LinearEquation {
	private double a,b,c,d,e,f;
	private double x;
	private double y;
	private double x1,y1,x2,y2,x3,y3,x4,y4;
	private double xp, yp;
	
	LinearEquation(double aa, double bb, double cc, double dd, double ee, double ff)throws Exception
	{
        setA(aa);
        setB(bb);
        setC(cc);
        setD(dd);
        setE(ee);
        setF(ff); 
	}
	LinearEquation(double xo1, double yo1, double xo2, double yo2, double xo3, double yo3, double xo4, double yo4)throws Exception
	{
		setX1(xo1);
		setY1(yo1);
		setX2(xo2);
		setY2(yo2);
		setX3(xo3);
		setY3(yo3);
		setX4(xo4);
		setY4(yo4);
	}
	public void setX1(double xo1)throws Exception
	{
		x1 = xo1;
	}
	public void setY1(double yo1)throws Exception
	{
		y1 = yo1;
	}
	public void setX2(double xo2)throws Exception
	{
		x2 = xo2;
	}
	public void setY2(double yo2)throws Exception
	{
		y2 = yo2;
	}
	public void setX3(double xo3)throws Exception
	{
		x3 = xo3;
	}
	public void setY3(double yo3)throws Exception
	{
		y3 = yo3;
	}
	public void setX4(double xo4)throws Exception
	{
		x4 = xo4;
	}
	public void setY4(double yo4)throws Exception
	{
		y4 = yo4;
	}
	public double getX1()
	{
		return x1;
	}
	public double getY1()
	{
		return y1;
	}
	public double getX2()
	{
		return x2;
	}
	public double getY2()
	{
		return y2;
	}
	public double getX3()
	{
		return x3;
	}
	public double getY3()
	{
		return y3;
	}
	public double getX4()
	{
		return x4;
	}
	public double getY4()
	{
		return y4;
	}
	
	
	public void setA(double aa)throws Exception
	{
		a = aa;
	}
	public void setB(double bb)throws Exception
	{
		b = bb;
	}
	public void setC(double cc)throws Exception
	{
		c = cc;
	}
	public void setD(double dd)throws Exception
	{
		d = dd;
	}
	public void setE(double ee)throws Exception
	{
		e = ee;
	}
	public void setF(double ff)throws Exception
	{
		f = ff;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	public double getD()
	{
		return d;
	}
	
	public double getE()
	{
		return e;
	}
	
	public double getF()
	{
		return f;
	}

	public boolean isSolvable()
	{
		if(a*d - b*c == 0)
		{
			System.out.println("\nThe equation has no solution");
			return false;
		}
		
		return true;
	}
	
	public double getX()
	{
		x = (e*d - b*f)/(a*d - b*c);
		return x;
	}
	
	public double getY()
	{
		y = (a*f - e*c)/(a*d - b*c);
		return y;
	}
	public boolean isIntersect()
	{
		if((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4) == 0)
		{
			System.out.println("\nThe two lines are parallel");		
			return false;
		}
		else
			return true;
	}
	public double getpointX()
	{
	 xp = ((x3-x4)*(x1*y2-y1*x2)-(x1-x2)*(x3*y4-y3*x4))/((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4));
	 return xp;
	}
	public double getpointY()
	{
	 yp = ((y3-y4)*(x1*y2-y1*x2)-(y1-y2)*(x3*y4-y3*x4))/((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4));
	 return yp;
	}
}

