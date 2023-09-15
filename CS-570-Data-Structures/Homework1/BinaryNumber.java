/* NAME-Pawan Kumar
 * CS570-B
 * Homework 1(Binary Number)
 */

public class BinaryNumber 
{
	private int data[];             // Initialization of Variable
	private boolean overflow;      // Initialization of Variable

    
	//Constructor for creating a Binary Number
	public BinaryNumber(int length)
	{
		if(length == 0 || length < 0)
		{
			System.out.println("The length should be positive and greater than 0 ");
		}
		else 
	  
	    {
		try
		{		
	    data = new int[length];
		for (int i= 0; i< length ; i++)
		{
			data[i] = 0;
		}
	    }	
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	}
    
    
	//Constructor for creating a BinaryNumber given a string
	public BinaryNumber(String str)
	{
		try {
		int strLength = str.length();
		if(strLength == 0)
		{
			System.out.println("Length of the string cannot be zero");
			return ;
		}
		
		data = new int[strLength];
		
		for(int i = 0; i<strLength; i++)
		{
			if(Character.getNumericValue(str.charAt(i))==1 || Character.getNumericValue(str.charAt(i))==0)
			{
				data[i] = Character.getNumericValue(str.charAt(i));
			}
			
			else
			{
				throw new NumberFormatException();
			}
		}	
		}
		
	    catch(NumberFormatException e)
		{
		  System.out.println("INVALID INPUT: BINARY STRING SHOULD ONLY CONTAIN '1' AND '0' as values.");
		}
	}
	
	
	
	//Operation for determining the length of a Binary Number
	public int getLength()
	{	
		return data.length;
	}
	
	
	
	//operation for obtaining a digit of a binary number given an index
	public int getDigit(int index)
	{
    	try
		{
			return data[index];
		}
		
		catch(Exception e)
		{
			System.out.println("INVALID INPUT: INDEX IS OUT OF BOUNDS "
					          + "\nAS INDEX IS OUT OF BOUNDS, VALUE RETURNED IS '-1'"
					          + "\nPLEASE ENTER A CORRECT INDEX VALUE ");
		}
		return -1;  // Return -1, when Index is out of Bounds
	}
	
	
	
	//Operation for shifting all digits in a binary number any number of places to the right
	public void shiftR(int amount)
	{
	 try 
	    {
	    if (amount < 0 || amount == 0)
		{
			 throw new Exception();
		}
		
		int[] numberShift = new int[data.length + amount];
		
		for(int i = 0; i< amount; i++)
		{
			numberShift[i] = 0;
		}
		
		
		for(int i = 0; i< data.length; i++)
		{
			numberShift[i + amount] = data[i];
		}
		
		data = numberShift;
				 
		}
		
	    catch(Exception e)
		{
		 System.out.println("INVALID INPUT: Please Enter a integer value greater than zero "
		 		+ "to shift the binary number by that value");
		}   
		}
	
	
	
	//Operation for adding two binary numbers of same length
	public void add(BinaryNumber aBinaryNumber)
	{
		try {
			int aLength = aBinaryNumber.getLength();
			if(data.length == aLength)
			{
				int[] sumValue = new int[aLength];
				int carry = 0;
				for(int i=0; i<aLength; i++)
				{
					if(carry + data[i] + aBinaryNumber.getDigit(i) == 0)
                      {
						sumValue[i] = 0;
						carry = 0; 
	
                      }
					else if(carry + data[i] + aBinaryNumber.getDigit(i) == 1)
					{
						sumValue[i] = 1;
						carry = 0;
					}
					
					else if(carry + data[i] + aBinaryNumber.getDigit(i) == 2)
					{
						sumValue[i] = 0;
						carry = 1;
					}
					else if(carry + data[i] + aBinaryNumber.getDigit(i) == 3)
					{
						sumValue[i] = 1;
						carry = 1;
					}
				}
				data = sumValue;
				if(carry == 1)
				{
					overflow = true;
				}
			}
			
			else
			{
				throw new Exception();
			}
			
     		}
		catch(Exception e)
		{
			System.out.println("INVALID INPUT:The length of two Binary numbers are not equal"
					            + "\nThe length of two binary numbers should be equal");
		}
		}
	
	
	//Operation for transforming a binary number to a String.
	public String toString()
	{
		String binaryStr = "";
		if(overflow == true)
		{
		      binaryStr = "Overflow";
		}
		else
		{
			for (int i = 0; i < data.length; i++)
			{
				binaryStr = binaryStr + data[i];
			}
		}
		
		return binaryStr;
		}
		
	
	
	//Operation for transforming a binary number to its decimal notation
	public int toDecimal()
	{
		int decimalNumber = 0;
		for (int i = 0; i< data.length ; i++)
		{
			decimalNumber = (int)(decimalNumber + data[i] * Math.pow(2, i));
		}
		return decimalNumber;
	}
	
	
	
	//Operation clearOverflow() that clears the overflow flag.
	public void clearOverflow()
	{
		overflow = false;
		
	}
	
}
