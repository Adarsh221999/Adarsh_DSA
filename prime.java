package GFG_Basics_Programme;

public class prime {

	public static void main(String[] args) {
		boolean b=isprime(31);
		System.out.println(b);

	}


	
		
		
		public static boolean isprime(int num) {
			if (num==1) {
				return false;
			}
			
			for (int i=2;i<num/2;i++) {
				if (num%i==0) {
					return false;
					
				}
			}
			
			return true;
			
		}

	}



