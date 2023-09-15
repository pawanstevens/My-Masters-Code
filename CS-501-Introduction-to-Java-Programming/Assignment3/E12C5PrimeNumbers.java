import java.util.Scanner;
public class E12C5PrimeNumbers {
	public static void main(String[] args)
	{
	  System.out.println("This program is all about printing prime numbers, checking whether the number is prime or not and showing numbers prime factors \n");	
	  int totalPrime = countingPrimes();
	  int [] array = new int[totalPrime];
	  int [] list = primeStorage(2, 1000, array);
	  displayCounts(list);
	    int repeat = 1;
	    while(repeat == 1)
	    {
	    	System.out.println("\n");
	        System.out.print("Enter a integer number which is (1 < number <1000) to see if it is prime or not:  ");  
	        Scanner input = new Scanner(System.in);
	        int userInput = input.nextInt();
	        boolean flag = (linearSearch(list, userInput));
	         if(flag)
	        {
	        	System.out.println("The number entered by you which is " + userInput + " is a Prime number.");
	        }
	        else
	        {
	        	System.out.println("The number entered by you which is " + userInput + " is not a prime number. ");
	        	System.out.println("As the number is not prime, program will show you its prime factors. ");
	        	primeFactors(userInput);
	        }
	        System.out.print("Do you wish to repeat the program if yes enter 1, if you want to exit enter 0 :  ");
	        repeat = input.nextInt();
	    } 
	}
	
	// Displaying Prime factors
	public static void primeFactors(int value)
	{
		int i=2;
		System.out.print("The prime factors of " + value + " in ascending order are : ");
    while(value/i != 1)
	{
		if(value%i == 0)
		{
			System.out.print( i + ",");
		     value = value/i;
			
		}
		else
		i++;
		}
    System.out.println(value);
	}
	
	 // Checking whether the number is prime or not
	public static boolean isPrime(int number)
	  {
		  for(int i=2; i<=number/2; i++)
		  {
			  if(number%i == 0)
				  return false;
		  }
		
	  return true;
	}
	
	// Counting prime numbers between 2 and 1000
	public static int countingPrimes()
	{
		int increment = 0,number = 2;
		 while(number<1000)
		 {
			 if(isPrime(number))
				 increment++ ;
			 number++ ;
	     }
		 
		 return increment;

	}
	
	// Storing prime numbers between 2 and 1000 in an array
	public static int[] primeStorage(int a, int b, int [] array)
	{
		int[] primes = new int[array.length];
		int i = 0;
		while(i<array.length)
		{
			while(a<=b)
			{
				if(isPrime(a))
				{
					primes[i++] = a;
					
				}
				a++ ;
			}
			
		}
		
		return primes;
		
	}
	
	// Displaying prime numbers
   public static void displayCounts(int[] primes)
   {
	   System.out.println("The first 50 prime numbers are: ");
	   for (int i = 0; i < 50; i++)
	   {
		 if (i % 10 == 0) 
		 {
			 
		   System.out.print("\n");
		 }
		    System.out.print(primes[i] + "\t");
	   }
   }
   
   // Doing linear search
   public static boolean linearSearch(int[] list, int key)
   {
	   boolean flag = false;
	   for(int i = 0; i < list.length; i++)
	   {
		   if(key == list[i])
		   {   
			   flag = true;
		   }
		   
	   }
	   
	   return flag;
	   
	   
   }
}

