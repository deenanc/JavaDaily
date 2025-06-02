package jpbasic;

import java.util.Scanner;

public class OddorEven {
	
	public static void oddOrEven(int input) {
		if(input%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int input=sc.nextInt();
		oddOrEven(input);
		sc.close();

	}

}
