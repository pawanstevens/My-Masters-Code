import java.util.Random;
import java.util.Stack;
import java.util.*;
/**
 * @author Pawan Kumar
 * CS 570-B
 * Homework 5
 */


public class Treap <E extends Comparable<E> >
{
	
	/**
	 * private static inner class Node<E>
	 *
	 * @param <E>
	 */
	private static class Node<E>
	{
	
		public E data;
		public int priority;
		public Node<E> left;
		public Node<E> right;
		
		
		
		/**Constructor:-
		 * Creates a new node with the given data and priority. It throws exception if data is null.
		 * @param data
		 * @param priority
		 * @throws Exception 
		 */
		public Node(E data, int priority) throws Exception
		{
			if(data == null)
			{
				throw new Exception("Error:- No data value is provided");
			}
			
			this.data = data;
			this.priority = priority;
			left = null;
			right = null;
		}
		
		
		/**
		 * Method rotateRight() performs right rotation
		 * @returning  a reference to the root of the result
		 * @throws Exception 
		 */
		
		public Node<E> rotateRight() throws Exception
		{
		
		
			Node<E> var = new Node<E>(this.data, this.priority);
			if(this.left != null)
			{
				var.left = this.left.right;
				var.right = this.right;
				this.priority = this.left.priority;
				this.data = this.left.data;	
				this.left = this.left.left;
				this.right = var;
				
				
			}
			
			return this;
		}
		
		
		/**
		 * Method rotateLeft() performs left rotation
		 * @throws Exception 
		 * @returning a reference to the root of the result. 
		 */
		
		public Node<E> rotateLeft()  throws Exception
		{
			
		 
			Node<E> var = new Node<E>(this.data, this.priority);
			
			if(right != null)
			{
				var.left = this.left;
				var.right = this.right.left;
				this.priority = this.right.priority;
				this.data = this.right.data;	
				this.right = this.right.right;
				this.left = var;
				
			}
			
			return this;
	}
}
	

		
	/**
	 * Developing The Treap Class
	 */

	/**
	 * Data Fields
	 */
	
	private Random priorityGenerator;
	private Node<E> root;
	
	
	/**
	 * Constructor Treap() that creates an empty treap
	 */
	 public Treap() throws Exception
	 {
	        this.priorityGenerator = new Random();
	        this.root = null;
	 } 
	 
	
	 /**
	  * Constructor Treap(long seed) that creates an empty treap
	  */
	 public Treap(long seed) throws Exception
	 {
		 if(seed <= 0)
		 {
			 throw new NullPointerException("Error!!! Seed cannot be less than or equal to zero");
		 }
		 this.priorityGenerator = new Random(seed);
	     this.root = null;
	 }
	 
	
	 /**
	  * Method to insert a given element into the tree
	  * @param key
	  * @returns true, if a node with key was successfully added to the treap otherwise return false
	  * @throws Exception
	  */
	 boolean add(E key) throws Exception
	 {
		 return add(key, priorityGenerator.nextInt());
	 }
	 
	
	 /**
	  * Method that will add key in the tree according to priority.
	  * @param key
	  * @param priority
	  * @throws Exception 
	  *  @returns true, if a node with key was successfully added to the treap otherwise return false 
	  */
	 public boolean add(E key, int priority) throws Exception
	 {
		 if(key == null)
		 {
			 throw new Exception();
		 }
		 
		 if(priority<0)
		 {
			 throw new Exception();
		 }
		 
		 Node<E> var  = new Node<E>(key, priority);
		
		 
		 if(root == null)
		 {
			 root = new Node(key, priority);
			 return true;
		 }
		 
		 Node<E> nd = null;
		 Node<E> root = this.root;
		 Stack<Node<E>> varStack = new Stack<Node<E>>();
		 
		 while (root != null) 
		 {
			 varStack.push(root);
			
			 if((key.compareTo(root.data)) < 0)
			 {
				 root = root.left; 
			 }
			 
			 else if((key.compareTo(root.data)) > 0)
			 {
				 root = root.right;
			 }
			 else
			 {
				 return false;
			 }
		 } 
			 
			 if(((E)varStack.peek().data).compareTo(key) > 0)                // check if wrong o/p
			 {
				 varStack.peek().left = var;
				 varStack.push(var);
				 
			 }
			 
			 else
			 {
				 varStack.peek().right = var;
				 varStack.push(var);
			 }
			 
			 reheap(varStack);
			 return true;
		 }
		 
		 
	 
	
	 
	 
	 /**
	  * Helper function reheap to restore the heap invariant
	  * @param stack
	  * @throws Exception
	  */
	 
	 private void reheap(Stack<Node<E>> stack) throws Exception
	 {
		 Node<E> temp  = stack.pop();
		 Node<E> vars = stack.pop();
		 while (vars != null && vars.priority < temp.priority)
		 {
			 if((temp.data.compareTo(vars.data)) > 0)
			 {
				 vars.rotateLeft();
				 if (stack.isEmpty()) 
				 {
	                    return;
				 }      
			 }
			 
			 else
			 {
				 vars.rotateRight();
				 if (stack.isEmpty()) 
				 {
	                    return;
				 } 
				 
			 }
			 
			 vars = stack.pop();
		 }
	 }
	  
	 
	
	  
	 /**
	  * This Method deletes the node with the given key from the treap and return true.
	  * The method does not modify the treap and returns false, if the key is not found.
	  * @param key
	  * @returns true if it deletes the node with the given key from the treap.
	  * @returns false if the key was not found.
	  */
	 boolean delete(E key)
	 {
		 if(key == null)
		 {
			 throw new NullPointerException();
		 }
		 
		 if (find(key) == false || root==null)
		 {
				return false;
		 }
		 
		 else 
		 {
			 this.root = delete(this.root, key);
		     return true; 
		 }
	 }
	 
	 /**
	  * Helper method for deletion
	  * @param nd
	  * @param key
	  */
	 private Node<E> delete(Node<E> nd, E varKey)
	 {
		 if (varKey == null) 
		 {
	         throw new NullPointerException("Error!!!!! Key cannot be null");
	     }
		 
		 if(nd == null)
		 {
			 return nd;
		 }
		 else
		 {
			 if(varKey.compareTo(nd.data) < 0)
			 {
				 nd.left = delete(nd.left, varKey);
			 }
			 else if((nd.data).compareTo(varKey) < 0)
			 {
				 nd.right = delete(nd.right, varKey);
			 }
			 else
			 {
				 if (nd.right == null)
				 {
					 return nd.left;
				 }
				 else if(nd.left == null)
				 {
					 return nd.right;
				 }
				 else
				 {
					 Node<E> temp = nd.right;
					 while(temp.left != null)
					 {
						 temp = temp.left;
					 }
					 
					 nd.data = temp.data;
	                 nd.right = delete(nd.right, nd.data);
				 }
			 }
		 }
		 
		 return nd;
	 }
	 
	 /**
	  * This Method finds a node with the given key in the treap rooted at root
	  * @param root
	  * @param key
	  * @return true if it finds it and false otherwise.
	  */
	 private boolean find(Node<E> root, E key)
	 {
		 if(key == null)
		 {
			 throw new NullPointerException("Error!!!!! Key cannot be null");
		 }
		 if(root != null)
		 {
			 if((key.compareTo(root.data)) == 0)
			 {
				 return true;
			 }
			 if(root.data.compareTo(key) < 0)
			 {
				 return find(root.right, key);
			 }
			 if(root.data.compareTo(key) > 0)
			 {
				 return find(root.left, key); 
			 }
		 }
		 
		return false;
	 }
	 
	
	 /**
	  * This Method finds a node with the given key in the treap
	  * @param key
	  * @return true if it finds it and false otherwise. 
	  */
	 public boolean find(E key)
	 {
		 if(key==null) 
		 {
			throw new NullPointerException("Error!!!!! Key cannot be null");
	     }
		 return find(this.root, key);
		 
	 }
	 
	 
	 /**
	  * This method carries out a pre-order traversal of the tree
	  * @returns a representation of the nodes as a string
	  */
	 public String toString()
	 {
		 StringBuilder str = new StringBuilder();
		 traverse(root, 1, str);
		 return str.toString();
	 }
	 
	 
	
	 /**
	  * Method for pre-order traversal of the tree
	  * @param nd
	  * @param level
	  * @param str
	  * @return
	  */
	 private String traverse(Node<E>nd, int level, StringBuilder str){
			
			for(int i = 1; i < level; i++)
			{
				str.append("  ");
			}		
			
			if(nd==null)
			{
				str.append("null\n\n");
			}
		      
			else
			{
				str.append("(key = "+nd.data+" , ");
				str.append("priority = "+ nd.priority + ")");  
				str.append("\n\n");
				traverse(nd.left, level + 1,str);
				traverse(nd.right, level + 1,str);
			}
			return str.toString();
			}
	 
	 
	 /**
	  * main method
	  */
	  public static void main(String[] args) throws Exception
	  {
		  Treap<Integer> testTree = new Treap <Integer>();
			/**
			 * Test cases mentioned in the homework
			 */
		 
			testTree.add(4,19);
		    testTree.add(2,31);
			testTree.add(6,70);
			testTree.add(1,84);
			testTree.add(3,12);
			testTree.add(5,83);
			testTree.add(7,26);
		    System.out.println(testTree.toString());
	        System.out.println("Is node with the key (7) found ? : " + testTree.find(7));
	        System.out.println("Deleting node if key (7) exists : " + testTree.delete(7));
	        System.out.println("\nAfter deletion treap is ");
	        System.out.println(testTree.toString());
	        
	      
   }
 }





