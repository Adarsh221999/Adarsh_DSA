package GFG_Basics_Programme;

public class recurssion {
        
	   public static int f(int n) {
		   if (n==0) {
			   return 1 ;
		   }
		   
		return n*f(n-1);
		   
		
		   
	   }
	   public static void main(String[] args) {
		System.out.println(f(5));
		
	}
}
