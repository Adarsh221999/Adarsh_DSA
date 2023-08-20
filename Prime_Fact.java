package GFG_Basics_Programme;

import java.util.Scanner;

public class Prime_Fact {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		num=in.nextInt();
		if (num < 2) {System.out.println(num);;}
		for (int i=2;i<num;i++) {
			while (num%i==0) {
				System.out.print(i); 
				num=num/i;
				
			}
		}
	
				
		

	}

}
