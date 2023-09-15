
      import javax.swing.JOptionPane;
       public class E12C6E18Password 
       {
          public static void main(String[] args){
          int option=JOptionPane.YES_OPTION;
          while(option==JOptionPane.YES_OPTION){
       try{
           String password=JOptionPane.showInputDialog(
               "Enter a Password: Please follow the rules mentioned below to enter your password" +
                "\n1.A password must have at least eight characters" +
                 "\n2.A password must contain only letters and digits"
                 + "\n3.A password must contain at least two digits");
                      isValidPassword(password);
             option=JOptionPane.showConfirmDialog(null,
                "Valid Password"+"\nDo you want to continue");
              } // end try
            catch(Exception ex)
       {
          String outputStr = " Invalid Password: " + 
        		  ex.getMessage() + "\nDo you want to continue? ";
          option = JOptionPane.showConfirmDialog(null, outputStr);
       } // end catch
       } // end while
       } // end main()
      private static void isValidPassword(String str)throws Exception
      {
    	  int increment = 0;
    	  if(str.length()<8)
    			
    		     throw new Exception("Password must have atleast 8 characters"); // Checking 1st rule given in problem
    	  else
    	  {
    		  for(int i=0;i<str.length();i++)
    				
    			{
    			   if(!Character.isLetterOrDigit(str.charAt(i)))
    				{
    				   throw new Exception("Password must have only letters ('a' to 'z' or 'A' to 'Z') and digits('0' to '9'"); //Checking 2nd rule given in problem
    				}
    				if(Character.isDigit(str.charAt(i)))
    				{
    					increment ++;
    				}
    		   }
    		  if(increment<2)
    		  {
    			 throw new Exception("Password must have atleast 2 digits"); // Checking 3rd rule of the problem
    		  }
    		  
    	  }
    		
   
      }// end isValidPassword
      
 
} 