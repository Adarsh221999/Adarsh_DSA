package GFG_Basics_Programme;

public class out_of_bound {
	public static void main(String[] args) {
		int age =12;
		
	      if (age <18) {
	    	  throw new  ArithmeticException("Access Denied");
	      }
	      else{
	    	  System.out.println("Access Granted");
	    	  
	      }
             
	      
	}

}
