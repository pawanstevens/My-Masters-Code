/**
 * @author Pawan Kumar
 * @Class - CS 570(B)
 * @Homework 6
 */
import java.util.Map;
import java.util.ArrayList;
import java.io.*;
import java.util.HashMap;

public class Anagrams 
{
  //Initializing first 26 prime numbers to an array
  final Integer[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
  Map<Character,Integer> letterTable;
  Map<Long,ArrayList<String>> anagramTable;
	
  /**
   * Constructor for the class Anagrams
   */
  public Anagrams()
  {
      this.anagramTable = new HashMap<Long, ArrayList<String>>();
      buildLetterTable();
  }
  
  /**
   * This method builds the hash table letterTable
   */
  private void buildLetterTable()
  {
	  this.letterTable = new HashMap<Character, Integer>();
	  String vars = "abcdefghijklmnopqrstuvwxyz";
	  int i = 0;
	  while(i < vars.length())
	  {
		  this.letterTable.put(vars.charAt(i), primes[i]);
		  i++;
	  }
  }
  
  /**
   * This method computes the hash code of the string s passed as argument
   * And  add this word to the hash table anagramTable.
   * @param s
   * @throws Exception
   */
  private void addWord(String s)throws Exception
  {
	  
	  long vars = myHashCode(s);
	  if(anagramTable.get(vars) == null)
	  {
		 ArrayList<String> temp = new ArrayList<String>();
		 temp.add(s);
		 anagramTable.put(vars, temp);
		} 
		else 
		{
			anagramTable.get(vars).add(s);
		}
	  
  }
  
  
  /**
   * This method, given a string s, compute its hash code.
   * @param s
   * @return long
   */
  private Long myHashCode(String s)
  {
	  long cd = 1l;
	  int i = 0;
	  while(i < s.length())
	  {
		  cd = cd * (long)letterTable.get(s.charAt(i));
		  i++ ;
	  }
	  
	  return cd;
  }

  /**
   * This method receives the name of a text file containing words, one per line,
   * and builds the hash table anagramTable.
   * @param s
   * @throws Exception 
   */
  private void processFile(String s) throws IOException
  {
	  FileInputStream fstream = new FileInputStream(s);
	  BufferedReader br = new BufferedReader ( new InputStreamReader(fstream));
	  String strLine ;
	  while (( strLine = br. readLine ()) != null ) 
	  {
		  try
		  {
			this.addWord (strLine);
		  }
		  catch (Exception e)
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  }
	  
	  br.close ();
  }
  
  /**
   * This method returns the entries in the anagramTable that have the largest number of anagrams.
   * @return a list
   */
  private ArrayList<Map.Entry<Long,ArrayList<String>>> getMaxEntries()
  {
	 ArrayList<Map.Entry<Long, ArrayList<String>>> listEntries = new ArrayList<Map.Entry<Long, ArrayList<String>>>();
	 int maximum = 0;
	 for (Map.Entry<Long,ArrayList<String>> temp : anagramTable.entrySet())
	 {
		 int size = temp.getValue().size();
		 if(size < maximum)
		 {
			 continue;
		 }
		 
		 else if(size == maximum)
		 {
			 listEntries.add(temp);
		 }
		 
		 else
		 {
			 listEntries.clear();
			 listEntries.add(temp);
			 maximum = size;
		 }
	  }
	 
	  return listEntries;
  }
  
  /**
   * main method
   */
  public static void main (String[] args)
  {
	  Anagrams a = new Anagrams ();
	  final long startTime = System.nanoTime ();
	  try 
	  {
		  a.processFile( "words_alpha.txt" );
      }
	  catch(IOException e1) 
	  {
		  e1.printStackTrace ();
      }
	  
	  ArrayList < Map.Entry < Long , ArrayList < String >>> maxEntries = a.getMaxEntries();
	  final long estimatedTime = System.nanoTime() - startTime;
	  final double seconds = (( double ) estimatedTime / 1000000000 );
	  int lengthOfMaxAnagrams = maxEntries.get(0).getValue().size();
	  System.out.println ("Elapsed Time: "+ seconds );
	  System.out.println("Key of max anagrams: " + maxEntries.get(0).getKey());
      System.out.println("List of max anagrams: " + maxEntries.get(0).getValue());
      System.out.println("Length of list of max anagrams: " + lengthOfMaxAnagrams);
	 

	}


}
