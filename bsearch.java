package GFG_Basics_Programme;

import java.util.ArrayList;

public class bsearch {

	public static void main(String[] args) {
		 ArrayList<Long> list= new ArrayList<>();
	      int  s=0;
	      int e=n-1;
	    
	      
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
	      
	      return list;

	}

}
