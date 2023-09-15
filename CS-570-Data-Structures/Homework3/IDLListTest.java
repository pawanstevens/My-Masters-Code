/* Name - Pawan Kumar
 * CS 570-B
 * Homework 3
 */

public class IDLListTest {

	public static void main(String[] args) {
		
		IDLList<Integer> doubleLinkedList= new IDLList<Integer>();
	
		doubleLinkedList.add(9);
        System.out.println("The first element added in the list is: " + doubleLinkedList.toString());
        
        // Adding elements at the head of the list
        doubleLinkedList.add(8);
        System.out.println("The current list after adding 8 at head of the list is: " + doubleLinkedList.toString());
        
        // Adding elements at specific index position
        doubleLinkedList.add(1,64);
        System.out.println("The current list after adding 64 at index '1' of the list is: " + doubleLinkedList.toString());
        
        // Adding elements to the last of the list
        doubleLinkedList.append(100);
        System.out.println("The current list after adding 100 at the last of the list is: " + doubleLinkedList.toString());
        doubleLinkedList.append(55);
        System.out.println("The current list after adding 55 at the last of the list is: " + doubleLinkedList.toString());
        doubleLinkedList.append(66);
        System.out.println("The current list after adding 66 at the last of the list is: " + doubleLinkedList.toString());
        
        //Getting Current list
        System.out.println("\nThe current list is: " + doubleLinkedList.toString());
        
        
        // Getting element from specific position of the list by providing index
        // If entered index is not found it will throw an error message and move on with execution
        try 
       {
        System.out.println("The element at 3rd index position of the list is: " +doubleLinkedList.get(3));
       }
        
       catch(Exception e)
        {
    	   System.out.println("!!!!!ERROR ERROR ERROR!!!!!"); 
    	   System.out.println("PLEASE ENTER A VALID INDEX"); 
        }
        
        //Getting Current list
        System.out.println("\nThe current list is: " + doubleLinkedList.toString());
        
        //Getting the head object of the list
        System.out.println("The HEAD object of the list is: " +doubleLinkedList.getHead());
        
        //Getting the tail object of the list
        System.out.println("The tail object of the list is: " +doubleLinkedList.getLast());
        
        //Getting the size of the list
        System.out.println("The size of the list is: " +doubleLinkedList.size());
        
        // Getting Current list
        System.out.println("\nThe current list is: " + doubleLinkedList.toString());
        
        //Removing the head of the list
        System.out.println("Removed Head of the list is: " + doubleLinkedList.remove());
        System.out.println("The current list after removing head is: " + doubleLinkedList.toString());
      
        // Getting Current list
        System.out.println("\nThe current list is: " + doubleLinkedList.toString());
        
        //Removing the tail of the list
        System.out.println("Removed Tail of the list is: " + doubleLinkedList.removeLast());
        System.out.println("The current list after removing tail is: " + doubleLinkedList.toString());
        
        // Getting Current list
        System.out.println("\nThe current list is: " + doubleLinkedList.toString());
        
       
        //Removing element from specific index position of the list
        //If the index is not found then it will throw and error message and move on with execution
        try 
        {
        	System.out.println("Removed element from 3rd index position of the list is: " + doubleLinkedList.removeAt(3));
        	System.out.println("The current list after removing 3rd index element from the list: " + doubleLinkedList.toString());
        }
        catch(Exception e)
        {
        	
        	System.out.println("!!!!!!ERROR--INVALID INPUT!!!!!");
        	System.out.println("Please enter a valid input");
        }
        
        // Getting Current list
        System.out.println("\nThe current list is: " + doubleLinkedList.toString());
        
        //Removing specific element from list
        System.out.println("Now we will try to remove element 9 from the list");
        System.out.println("Is element 9 removed from the list? : " + doubleLinkedList.remove(9));
        System.out.println("The current list after removing element 9 from the list is: " + doubleLinkedList.toString());
        
        //At the End printing the list 
        System.out.println("\nThe current list after all the operation is: " + doubleLinkedList.toString());
        
        
	}
}