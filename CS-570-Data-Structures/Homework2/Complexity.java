/* Name - Pawan Kumar
 * CS-570(B)
   Homework 2 
 */


public class Complexity 
{ 
	
	
	//Implementing a method that has time complexity O(n^2).
	// n is the input
	public static void method1(int n)
	{
		int counter = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.println("Operation1:  " + counter);
				counter++ ;
			}
		}
	
	}
	
	
	
	//Implementing a method that has time complexity O(n^3).
	// n is the input
	public static void method2(int n)
	{
		int counter = 0;
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int p = 0; p < n; p++)
				{
				 System.out.println("Operation2:  " + counter);
				 counter++ ;
			}
		}
	}	
		
	}
	
	
	
	//Implementing a method that has time complexity O(logn).
	// n is the input
	public static void method3(int n)
	{
		int counter = 0;
		
		for (int i = 1; i < n; i = i * 2)
		{
            System.out.println("Operation3:  " + counter);
            counter++;
	    }
	}
	
	 
	
	//Implementing a method that has time complexity O(nlogn).
	// n is the input
	 public static void method4(int n)
	 {
		int counter = 0 ;
		
		for (int i = 0; i < n; i++)
		{
		   for (int j = n; j > 0; j /= 2)
			
		   {
			   System.out.println("Operation4:  " + counter);
	           counter ++;
		   }
		 
	    }
		
	 }
	 
	 
	 
	 // Implementing a method that has time complexity O(loglogn).
	// n is the input
	 public static void method5(int n)
	 {
		 int counter = 0;
		 
		 for(int i = 2; i < n; i = i * i)
		 {
				System.out.println("Operation5:  " + counter);
				counter++;
		 }
		 
	 }
	 
	 
	 //Implementing a method that has time complexity O(2^n)
	 // n is the input 
	 private static int counter1;
	 public static int method6(int n)
	 {
		 counter1 ++;
		 System.out.println("Operation6:  "+ counter1);
		 if (n > 1)
		 {
			 return method6(n-1) * method6(n-1);
			 
		 }
		 else
		 {
			 return n;
		 }
		 
	 }
	 
	 
}
