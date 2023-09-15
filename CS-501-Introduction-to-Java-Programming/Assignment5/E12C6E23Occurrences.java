import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

 

public class E12C6E23Occurrences {

       public static void main(String[] args) throws IOException {

              System.out.println("This program is about finding the number of occurences of the character in a string"+
                                  "\nFor example, if entered string is 'Pawan22', entered caharter is 'a', then the number of occurences will be 2");

 

              Scanner input = new Scanner(System.in);

              int repeat = 1;

              int count = 0;

              boolean exitFlag = true;

              while (repeat == 1) {

                     if (exitFlag == false) {

                           System.out.println("Please enter 1 to enter a new string or 0 to exit the program");

                           try {

                                  repeat = Integer.parseInt(input.next());

                                  if (repeat == 1) {

                                         exitFlag = true;

                                  } else if (repeat == 0) {

                                         System.out.println("Program Exited!!!!!!!!!!!!!!!!!");

                                         break;

                                  }

                           } catch (NumberFormatException e) 
                           {
                               System.out.println("Invalid input: Please start again from first");
                                  repeat = 1;

                                  exitFlag = true;

                           }

                     }

                     System.out.println("\nPlease enter a string (which can only have letters and numbers) : ");

                     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                     String letter = br.readLine();

 

                     String regex = "^[a-zA-Z0-9]+$";

                     Pattern isValid = Pattern.compile(regex);

                     Matcher matcher = isValid.matcher(letter);

                     if (!matcher.matches()) {

                           System.out.println("Invalid input");

                           System.out.println("Please enter 1 to repeat entering string and 0 to exit the program");

                           try {

                                  repeat = Integer.parseInt(input.next());

                                  if (repeat == 0) {

                                         System.out.println("Program Exited!!!!!!!!!!!!!!!!!");

                                         break;

                                  }

                           } catch (NumberFormatException e) 
                           
                           {
                        	   
                        	   System.out.println("Invalid input: Please start again from first");
                        	   
                                  repeat = 1;

                                  exitFlag = true;

                           }

                     } else if (matcher.matches()) {

                           repeat = 2;

                     }

                     while (repeat == 2) {

                           System.out.println("Number of Occurences of the input character in string is : " + callsearch(letter));

                           System.out.println("\nPlease enter 2 to repeat searching the same string with new caharcter or 0 to go back ");

                           try {

                                  repeat = Integer.parseInt(input.next());

                                  if (repeat == 0) {

                                         repeat = 1;

                                         exitFlag = false;

                                  }

                           } catch (NumberFormatException e) 
                           
                           {
                        	   System.out.println("Invalid input: Please start again from first");
                                  repeat = 1;

                                  exitFlag = true;

                           }

 

                     }

 

              }

 

       }

 

       private static int callsearch(String letter) {

              Scanner input1 = new Scanner(System.in);
              System.out.println("Now you will be asked to enter character, please enter only one character"
            		  +"\nIf entered more than one only first entered character will be taken as valid input");

              System.out.println("\nPlease enter a Character (only one) : ");

              char character = input1.next().charAt(0);

              int charCount = count(letter, character);

              return charCount;

       }

 

       public static int count(String str, char a) {

              int cont = 0;

              for (int i = 0; i < str.length(); i++) {

 

                     if (str.charAt(i) == a) {

                           cont++;

                     }

 

              }

              return cont;

       }

}