package GFG_Basics_Programme;


	class Solution
	
     
	{
	    public int TotalPairs(int[] nums, int k)
	    {
	        int count=0;
	        for (int i=0;i<=nums.length-1;i++){
	            for (int j=1;j<=nums.length-1;j++){
	                if (nums[j]-nums[i]==k || nums[i]-nums[j]==k ){
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	}


