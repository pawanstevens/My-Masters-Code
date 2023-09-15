/* Name - Pawan Kumar
 * CS 570-B
 * Homework 3
 */

import java.util.ArrayList;
import java.lang.*;
public class IDLList<E> 
{
	
	// Inner class Node<E>
	private static class Node<E>
	{
		private E data;
        private Node<E> next;
        private Node<E> prev;
        
        
        // creating a node holding elem
        private Node(E elem) 
        {
            this.data = elem;
            this.prev = null;
            this.next = null;
        }
        
        
        // creating a node holding elem, with next as next and prev as prev.
        private Node(E elem, Node<E> prev, Node<E> next)
        {
            this.data = elem;
            this.prev = prev;
            this.next = next;
        }
    }
	
	
	private Node<E> head;
	private Node<E> tail;
	private int size;
	private ArrayList<Node<E>> indices;
	
	
	// A constructor for creating an empty double linked-list
	 public IDLList()
	 {
		 this.head = null;
		 this.tail = null;
		 this.size = 0;
		 this.indices = new ArrayList<Node<E>>(); 
		 
	 }
	 
	 
	 // A method that adds elem at position index 
	 public boolean add(int index, E elem)
	 {
		 
			 if (index < 0 || index > size)
			 {
				throw new ArrayIndexOutOfBoundsException("Index not found");
			 }
			 
			 
			 else if(index == size)
			 {
				 append(elem);
				 
				 return true;
			 }
			 
			 else if(index == 0)
			 {
				 add(elem);
				 
				 return true;
			 }
			   
   			 else 
			 {
				 Node<E> nd = indices.get(index);
				 Node<E> node = new Node<E>(elem,nd.prev,nd);
				 nd.prev.next = node;
				 nd.prev = node;
				 indices.add(index,node);
				 size++;			
				 return true;
			 }
	}
	  
	 
	 // A method that will adds elem at head so that it can become first element of the list
	 public boolean add (E elem) 
	 {
		 if(head == null)
		 {
			 Node<E> newNd = new Node<E>(elem);
	         head = newNd;
	         tail = newNd;
	         indices.add(0, newNd);
	         size ++;
	         return true;
	         
		 }
		 
		 else
		 {
			 Node<E> newNd = new Node<E>(elem);
			 newNd.next = head;
			 head.prev = newNd;
			 head = newNd;
			 indices.add(0, newNd);
			 size++;
			 return true;

		 }
	 }
	
	 
	 // A method that will add elem as the new last element of the list
	 public boolean append (E elem)
	 {
		 if(head == null)
		 {
			 Node<E> newNd = new Node<E>(elem);
	         head = newNd;
	         tail = newNd;
	         indices.add(0, newNd);
	         size ++;
	         return true;
	         
		 }
		 
		 else
		 { 
			 Node<E> newNd = new Node<E>(elem, tail, null);
		     indices.add(newNd);
		     tail.next = newNd;
		     tail = newNd;
		     size++;
             return true;
		 }
	}
	  
	 
	 /* A method that returns the object at index from the head.
	  * This method uses index for fast access.
	  * Indexing starts from 0,thus get(0) returns the head element of the list.
      */
	 public E get (int index) throws IndexOutOfBoundsException 
	 {
		 if (index<0 || index>= size)
			 throw new IndexOutOfBoundsException();
		 
		 
	     return this.indices.get(index).data;
	  }
	 
	 
	 // A method that returns the object at the head.
	 public E getHead ()
	 {
		 return head.data;
	 }
	 
	 
	 // A method that returns the object at the tail.
	 public E getLast ()
	 {
		 return tail.data;
	 }
	 
	 
	 //A method that returns the list size.
	 public int size()
	 {
		 return size;
	 }
	  
	 
	 // A method that removes and returns the element at the head
	 public E remove() throws IndexOutOfBoundsException 
	 {
		 if(size == 0) 
		 {
			 throw new IndexOutOfBoundsException("List is Empty");  
		 }
		 
		 else if(size == 1)
		 {
			 Node<E> nd = head;
			 head = null;
			 tail = null;
			 indices.remove(0); 
			 size--;
			 return nd.data;
		 }
		 
		 else
		 {
			 Node<E> nd = head;
			 head = head.next;
		     head.prev = null;
		     indices.remove(0);   
			 size--;
			 return nd.data;	
		 }
	 }
	 
	 
	 // A method that removes and returns the element at the tail.
	 public E removeLast () throws IndexOutOfBoundsException
	 {
		 if(size == 0) 
		 {
			 throw new IndexOutOfBoundsException("List is Empty");  
		 }
		 
		 else if(size == 1)
		 {
			 Node<E> nd = head;
			 head = null;
			 tail = null;
			 indices.remove(size - 1); 
			 size--;
			 return nd.data;
		 }
		 
		 else
		 {
			 Node<E> nd = tail;
		     tail = tail.prev;
		     tail.next = null;
		     indices.remove(size - 1); 
			 size--;
			 return nd.data;
		 }
	}
	 
	 
	 /* A method that removes and returns the element at the index index.
	  * In this method we are using index for fast access.
	  */
	 public E removeAt (int index) throws Exception
	 {
		 if(index < 0 || index >= size)
		 {
			 throw new Exception("Index not found"); 
		 }
		 
		 else if(index == 0) 
		 {
			return remove();
		 }
		 
		 else if(index == size - 1)
		 {
			 E nd = tail.data;
			 tail.prev.next = null;
			 tail = tail.prev;
			 indices.remove(index);
			 size--;
			 return nd;
		 }
		 
		 else
		 {
			 Node<E> nd = indices.get(index);
			 E dat = nd.data;
			 nd.prev.next = nd.next;
			 nd.next.prev = nd.prev;
			 indices.remove(index);
			 size--;
			 return dat;
		 }
	 }
	
	 
	 /* A method that removes the first occurrence of elem in the list and returns true.
	 * This method return false if elem was not in the list.
	 */
	 public boolean remove(E elem)
	 {

	        for (int i = 0; i < indices.size(); i++) {

	            if (indices.get(i).data == elem) {
	                try 
	                {
						removeAt(i);
					} 
	                catch (Exception e)
	                {
				
						System.out.println("Error");
	                }
	                return true;
	            }
               }
              return false;
	   }
	
	 
	//A method that presents a string representation of the list.
	public String toString() 
	{
		E data;
		String list = "";
		for(int i = 0; i < size; i++) {
			if(i != size - 1) 
			{
				data = (indices.get(i).data);
				list = list + (data + ", ");
			}
			else
			{
				data = (indices.get(i).data);
				list = list + data;
			}
		}
		
		return list; 
		
	}
}
	
        

	


