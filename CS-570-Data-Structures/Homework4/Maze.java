/** Name - Pawan Kumar
 *  CS 570-B
 *  Homework 4
 */


/**
 * Class that solves maze problems with backtracking.
 * @author Koffman and Wolfgang
 **/
import java.util.Stack;
import java.util.*;

import java.util.ArrayList;
public class Maze implements GridColors {

    /** The maze */
    private TwoDimGrid maze;

    public Maze(TwoDimGrid m) {
        maze = m;
    }

    /** Wrapper method. */
    public boolean findMazePath() {
        return findMazePath(0, 0); 
    }

    /**
     * Attempts to find a path through point (x, y).
     * @pre Possible path cells are in BACKGROUND color;
     *      barrier cells are in ABNORMAL color.
     * @post If a path is found, all cells on it are set to the
     *       PATH color; all cells that were visited but are
     *       not on the path are in the TEMPORARY color.
     * @param x The x-coordinate of current point
     * @param y The y-coordinate of current point
     * @return If a path through (x, y) is found, true;
     *         otherwise, false
     */

    
    // Implementing a recursive algorithm that will returns true if a path is found. 
     
    public boolean findMazePath(int x, int y)
     {
         // COMPLETE HERE FOR PROBLEM 1
       	
       int numberOfRows = maze.getNRows();
       int numberOfColumns = maze.getNCols();
       	
       if(x < 0 || y < 0 || x >= numberOfColumns || y >= numberOfRows || maze.getColor(x, y) != NON_BACKGROUND) 
       {
            	return false;
       }
       	 
       if(x == --numberOfColumns && y == --numberOfRows)   
       {
        		maze.recolor(x, y, PATH);
        		return true;
       }
       	 
       maze.recolor(x, y, PATH);
       	 
       if (findMazePath(x - 1, y) || findMazePath(x, y - 1) ||  findMazePath(x + 1, y) || findMazePath(x, y + 1)) 
       	 {
    	   maze.recolor(x, y, PATH);
            	return true;
         }
       	 
       else 
       	 {
    	      maze.recolor(x, y, TEMPORARY);
    		  return false;
    		}
       }
       
      
       // Implementation of a Helper Method
        /* here:-
         * – (x,y) are the coordinates currently being visited
         * – result is the list of successful paths recorded up to now
           – trace is the trace of the current path being explored 
         */
    
       public void findMazePathStackBased(int x, int y, 
       		ArrayList<ArrayList<PairInt>> result, Stack<PairInt> trace)
       {
       	int numberOfRows = maze.getNRows();
       	int numberOfColumns = maze.getNCols();
       	
       	if (x < 0 || y < 0 || x >= numberOfColumns || y >= numberOfRows )
       	{
       		return;
       	}
       	
       	else if(x == (numberOfColumns - 1) && y == (numberOfRows - 1))
       	{
       		trace.push(new PairInt(x, y)); 
            ArrayList<PairInt> value = new ArrayList<>(trace); 
            result.add(value);
            trace.pop(); 
            maze.recolor(x, y, NON_BACKGROUND); 
            return;
        }
       	
       	else if(!maze.getColor(x, y).equals(NON_BACKGROUND))
       	{
       		return;
       	}
       	
       	else
       	{
       		trace.push(new PairInt(x, y));
       		maze.recolor(x, y, PATH);
            findMazePathStackBased(x - 1, y, result, trace);
            findMazePathStackBased(x, y - 1, result, trace);
            findMazePathStackBased(x + 1, y, result, trace);
            findMazePathStackBased(x, y + 1, result, trace);
            maze.recolor(x, y, NON_BACKGROUND);
            trace.pop();
            return;
       	}
       	
       	
       }

       
       //  METHOD FOR PROBLEM 2 
       // Implementing a recursive algorithm so that a list of all the solutions to the maze is returned.
       
       public ArrayList<ArrayList<PairInt>> findAllMazePaths(int x, int y) 
       {
       	
       	ArrayList<ArrayList<PairInt>> result = new ArrayList<>();
       	Stack<PairInt> trace = new Stack<>();
       	findMazePathStackBased(0, 0, result, trace);
        if(result.size() == 0)
        {
    		
    		ArrayList<PairInt> val = new ArrayList<PairInt>();
    		
    		result.add(val);
    	
    	}
       	return result;
       }
       
       
       
       // METHOD FOR PROBLEM 3
       // Implementation of an algorithm so that it returns the shortest path in the lis of the paths
       public ArrayList<PairInt> findMazePathMin(int x, int y) throws Exception
       {
       
      	   int indexValue = 0, minimum;
           int[] array;
           
           ArrayList<ArrayList<PairInt>> possibleMazePaths = findAllMazePaths(x, y);
           array = new int[possibleMazePaths.size()];
          
           int i = 0;
           while(i<possibleMazePaths.size())
           {
           	 array[i] = possibleMazePaths.get(i).size();
           	 i++;
           }
           
           minimum = array[0];
           
           int j = 1;
           while(j < array.length)
           {
           	if (array[j] < minimum)
               {
                   minimum = array[j];
                   indexValue = j;
               }
           	
           	j++;
           }
          
           return possibleMazePaths.get(indexValue);
       }
    
      
       /*<exercise chapter="5" section="6" type="programming" number="2">*/
       public void resetTemp() {
           maze.recolor(TEMPORARY, BACKGROUND);
       }
       
       /*</exercise>*/

       /*<exercise chapter="5" section="6" type="programming" number="3">*/
       public void restore() 
       {
           resetTemp();
           maze.recolor(PATH, BACKGROUND);
           maze.recolor(NON_BACKGROUND, BACKGROUND);
       }
       /*</exercise>*/

   }
/*</listing>*/