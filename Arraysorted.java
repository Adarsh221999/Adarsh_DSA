package GFG_Basics_Programme;

public class Arraysorted {
	
	   public static boolean sort(int a[],int n)
	   {
		   for (int i=0;i<n-2;i++) {
			   for(int j=i+1;j<=n-1;j++) {
				   if (a[i]>a[j]) {
					   
					   return false;
				   }
				   
			   }
		
		   }
		
		return true;
		
		   
	   }

	public static void main(String[] args) {
		int [] d= {1,3,8,9,34,56,78};
		sort(d, 7);

	}

}
