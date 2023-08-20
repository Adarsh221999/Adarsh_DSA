package GFG_Basics_Programme;

public class Array_reduction {

	public static void main(String[] args) {
		int [] b= {10,20,30,40,50};
	    reduction(b,5);	
     
	}
	
	public static int reduction(int[] arr,int n) {
		int cost=0;
		for (int i=n-1;i>0;i--) {
			arr[i-1]=arr[i]+arr[i-1];
			
			cost=cost+arr[i-1];
		}
		System.out.println(cost);
		return cost;
	}

}
