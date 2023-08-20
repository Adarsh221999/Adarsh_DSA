package GFG_Basics_Programme;

import java.util.ArrayList;

public class Binary_search {

	public static void main(String[] args) {
		int[] A= {1,4,3,6,2,8,7,};
		binarysearch(A, 5, 0, 7);
		
		
		

	}

	
	public static ArrayList<Long> binarysearch(int[] arr,int s,int e,int x) {
	       s=0;
	       e=arr.length-1;
	    
	      
	      while (s<e){
	          int mid=(s+e)/2;
	          if((int)arr[mid]==x && (int)arr[mid+1]!=x)||((int)arr[mid]==x && (int)arr[mid+1]!=x){
	              list.add((long)mid);
	              
	          }
	          else if((int)arr[mid]<x){
	              s=mid+1;
	          }
	          else{
	              e=mid-1;
	          }
	      }	
	}
}


