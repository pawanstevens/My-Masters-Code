public class E12C7SmallestElement
{
	public static void main (String[] args)
	{
		System.out.println("This program will find the smallest element,index of the smallest element and will sort an array of 10 numbers given by user");
		int repeat = 1;
		while(repeat == 1)
		{
			double [] list = new double[10];
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.print("Enter ten numbers separated by single space :  ");
			for(int i = 0; i < list.length ; i++)
			{
				list[i] = input.nextDouble(); 
			}
			System.out.print("The smallest element in the array of ten numbers given by you is :  " + min(list) + "\n");
			System.out.print("The index of the smallest element in the array of ten numbers given by  you is :  " + indexOfSmallestElement(list) + "\n");
			selectionSort(list);
			System.out.print("The sorted array in ascending order is :  ");
			for(double element : list)
			{
				System.out.print(element + ", ");
			}
			System.out.println();
			System.out.print("If you want to repeat program enter 1 for yes and 0 for no: ");
			repeat = input.nextInt();
			
		}
	}
			
			// finding smallest element
			
			public static double min(double[] array)
			{
			  double min = array[0];
			  for (int i = 1; i< array.length ; i++)
			 {
				if(array[i] < min)
				{
					min = array[i];
				}
			}
			  return min;
			} 
			
			// finding index of smallest element
			
			public static int indexOfSmallestElement(double[] array)
			{
				double min = array[0];
				int indexOfMin = 0;
				for (int i = 1; i< array.length; i++ )
				{
					if(array[i] < min)
					{
						min = array[i];
						indexOfMin = i;
					}
				}
				return indexOfMin;
			}
			
			//sort an array by finding the largest number and swapping it with the last
			
			public static void selectionSort(double[] array)
			{
				for (int i = array.length - 1; i >= 0; i--)
				{
					double currentMax = array[i];
					int currentMaxIndex = i;
					
					for(int j = i - 1; j >= 0 ; j--)
					{
						if(currentMax < array[j])
						{
							currentMax = array[j];
							currentMaxIndex = j;
							
						}
					}
					
					if(currentMaxIndex != i)
					{
						array[currentMaxIndex] = array[i];
						array[i] = currentMax;
					
						
						}
					}
				}
			
			}
			
			
	