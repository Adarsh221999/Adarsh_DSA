package GFG_Basics_Programme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>M = new HashMap<>();
		M.put(1, "Adarsh");
		M.put(2, "Ad");
		M.put(3, "shubham");
		M.put(5, "Akash");
		
		Set<Integer> se= new HashSet<>();
			se=	M.keySet();

		for (Integer i:se){
			if (i==2) {
				System.out.println(M.get(i ));
			}
			
		}
		
	}

}
