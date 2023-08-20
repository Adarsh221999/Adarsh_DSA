package GFG_Basics_Programme;

import java.util.ArrayList;

class Solu{
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list=new ArrayList<>();
           for (int i=0;i<nums.length;i++){
               list.add(nums[i]);
           }
           for (int i=0;i<list.size();i++){
                if (list.get(i)==val){
                    list.remove(i);

                }
           }

           for(int j=0;j<list.size();j++){
              nums[j]=list.get(j);
           }  
           System.out.println(nums);
        return list.size();   
    }
    
    public static void main(String[] args) {
    	Solu s = new Solu();
    	int [] a= {0,1,2,2,3,0,4,2};
    	s.removeElement(a, 2);
		
	}
}
