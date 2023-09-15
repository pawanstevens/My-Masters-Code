/*  JAVA FINAL PROJECT


Subject :- CS-501, Introduction to Java Programming
Professor :- Dr. M Peter Jurkat  

Group name - CS-501 Group Project
Group members :-
Inchara Nagaraju (CWID- 10477847)
Pawan Kumar      (CWID- 10474820)   */



import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class ConnectFour

{
	
public static void main(String[] args)

{
	
System.out.println("This program is all about Connect Four game. It is a two player game." +
                    "\nWhoever drops Four consecutive disc in either horizontally,vertically or diagonally wins the game."
		             +"\nRemember, Player who choose Red disc will start" +
		            "\nALL THE BEST FOR THE GAME!!!! \n");	

Scanner input = new Scanner(System.in);

int repeat = 1;

while(repeat == 1)
{
	try
	{
	char[][] gameConnectFour = new char[6][7];

	displayingTheBoard(gameConnectFour);

while (true)

{


	positionOfTheDisc('R', gameConnectFour);


	displayingTheBoard(gameConnectFour);


if (isWin(gameConnectFour))

{

System.out.println("\nCongratulations!!! Red player won the game!!!");

break;

}


else if (isDraw(gameConnectFour))

{

System.out.println("Nobody Won.");

break;

}


positionOfTheDisc('Y', gameConnectFour);

displayingTheBoard(gameConnectFour);

if (isWin(gameConnectFour))

{

System.out.println("\nCongratulations!!! Yellow player won the game!!!");

break;

}


else if (isDraw(gameConnectFour))

{

System.out.println("No winner.");

break;
}
}
	}
	catch(InputMismatchException e)
	{
		
		System.out.println("Invalid Input: Please enter only integer values from 0 to 6");
		
		
	}
	catch(ArrayIndexOutOfBoundsException e) 
	{
        System.out.println("\nThe number you have entered is invalid");
        System.out.println("Please enter an integer number between 0 and 6");
  
        
}
	System.out.print("\nEnter 1 to play again or 0 to exit: ");
	repeat = input.nextInt();
}


}




//Method that places the disk in entered position

public static boolean enteredPositionOfTheDisk(char[][] board, int column, char player)

{

for (int i = 0; i < board.length; i++)

{

if (board[i][column] == '\u0000')

{

board[i][column] = player;


return true;

}

}


return false;

}

// Method for displaying the connect four board to user


public static void displayingTheBoard(char[][] board)

{

for (int i = board.length - 1; i >= 0; i--)

{

System.out.print("|");

for (int j = 0; j < board[i].length; j++)

System.out.print(board[i][j] != '\u0000' ? board[i][j] + "|"

: " |");

System.out.println();

}

System.out.println("---------------");
System.out.println(" 0 1 2 3 4 5 6");
}

// Method for specifying whether player won the game

public static boolean isWin(char[][] board)

{

return isStraightFour(board);

}

//Method that check whether the game is a draw

public static boolean isDraw(char[][] board)

{

for (int i = 0; i < board.length; i++)

for (int j = 0; j < board[i].length; j++)

if (board[i][j] == '\u0000')
{

return false;
}

return true;

}

//This method checks for consecutive four occurrence

public static boolean isStraightFour(char[][] values)

{

int rows = values.length;

int columns = values[0].length;


for (int i = 0; i < rows; i++)

{

if (isConnectFour(values[i]))

return true;

}


for (int j = 0; j < columns; j++)

{

char[] column = new char[rows];


for (int i = 0; i < rows; i++)

column[i] = values[i][j];

if (isConnectFour(column))

return true;

}


for (int i = 0; i < rows - 3; i++)

{

int numberOfElementsInDiagonal = Math.min(rows - i,

columns);

char[] diagonal = new char[numberOfElementsInDiagonal];

for (int k = 0; k < numberOfElementsInDiagonal; k++)

diagonal[k] = values[k + i][k];

if (isConnectFour(diagonal))

return true;

}


for (int j = 1; j < columns - 3; j++)

{

int numberOfElementsInDiagonal = Math.min(columns - j,

rows);

char[] diagonal = new char[numberOfElementsInDiagonal];

for (int k = 0; k < numberOfElementsInDiagonal; k++)

diagonal[k] = values[k][k + j];

if (isConnectFour(diagonal))

return true;

}


for (int j = 3; j < columns; j++)

{

int numberOfElementsInDiagonal = Math.min(j + 1, rows);

char[] diagonal = new char[numberOfElementsInDiagonal];

for (int k = 0; k < numberOfElementsInDiagonal; k++)

diagonal[k] = values[k][j - k];

if (isConnectFour(diagonal))

return true;

}


for (int i = 1; i < rows - 3; i++)

{

int numberOfElementsInDiagonal = Math.min(rows - i,

columns);

char[] diagonal = new char[numberOfElementsInDiagonal];

for (int k = 0; k < numberOfElementsInDiagonal; k++)

diagonal[k] = values[k + i][columns - k - 1];

if (isConnectFour(diagonal))

return true;

}

return false;

}

//User defined method that checks whether there are four consecutive drops

public static boolean isConnectFour(char[] enteredvalues)

{

for (int i = 0; i < enteredvalues.length - 3; i++)

{

boolean isEqual = true;

for (int j = i; j < i + 3; j++)

{

if (enteredvalues[j] == '\u0000' || enteredvalues[j] != enteredvalues[j + 1])

{

isEqual = false;

break;

}

}

if (isEqual)

return true;

}

return false;

}

//Method that drops the disk at specified position and checks whether that position is empty or full

public static void positionOfTheDisc(char player, char[][] board)

{

	

Scanner input = new Scanner(System.in);

boolean success = false;

do

{

	System.out.print("Select a number to put " + (player == 'R' ? "RED" : "YELLOW")

	+ " disc at any column between (0-6): ");

	int column = input.nextInt();

	if (enteredPositionOfTheDisk(board, column, player))

	{

	success = true;

	}

	else

	System.out.println("\nThe column is full. Please try a different column");

	} 

	while (!success);
	

	}

}