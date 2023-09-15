
import java.io.*;
import javax.swing.JFileChooser;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
 import java.util.Scanner;
public class E12C12E13CountCharactersWordsLines
{
  	public static void main(String[] args) throws IOException,InputMismatchException,NullPointerException 
  	{
  		JOptionPane.showMessageDialog(null,"This Program is all about counting following things" +"\nNumber of lines in a file" +"\nNumber of Words in a file" +
  	                                    "\nNumber of Characters in a file\n"
  				                          + "\nNOTE1 : IF YOU TRY NOW TO CLICK ON CLOSE AND WANT TO EXIT, YOU CANNOT DO THAT NOW"
  	                                    + "\nNOTE2: IN THE NEXT OPTION YOU WILL BE ASKED TO CHOOSE A FILE OR ENTER THE FILE NAME");
  		int repeat = 1;
  		int numOfCharacters = 0;
  		int numOfLines = 0;
  		int numOfWords = 0;
  		int option=JOptionPane.YES_OPTION;
  		while (option==JOptionPane.YES_OPTION)
  		{
  			Scanner x = new Scanner(System.in);
  		try {
  			Scanner fileScanner = null;
  		    File selectedFile = null;
  		    JFileChooser chooser = new JFileChooser();
  		    // choose file 
  		    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
  		        {
  		        selectedFile = chooser.getSelectedFile();
  		        fileScanner = new Scanner(selectedFile);   
  				}
  		  while (fileScanner.hasNextLine())
  		  {
  			  numOfLines++;
  			  String line = fileScanner.nextLine();
  	          Scanner lineScanner = new Scanner(line);
  	          while(lineScanner.hasNext()) 
  	        {
  	          numOfWords++;
  	          String word = lineScanner.next();
  	          numOfCharacters += word.length();
  	        } 

  	      lineScanner.close();
  	      }
  		   JOptionPane.showMessageDialog(null,"\nNumber of lines, words, and characters in the file you selected are mentioned below" + 
  	                                   "\nNumber of lines    :  " + numOfLines +"\nNumber of words      :  " + numOfWords +"\nNumber of characters :  " 
  	                                     + numOfCharacters  );
  		 option=JOptionPane.showConfirmDialog(null,"Do you want to continue");
  		}
  		catch(Exception e)
        {
           String outputStr = " Invalid Input: " + 
           e.getMessage() + "\nDo you want to continue? ";
           option = JOptionPane.showConfirmDialog(null, outputStr);
        }
  		
  		
  		
  		
  		
       }
  		
  	}
  	
}