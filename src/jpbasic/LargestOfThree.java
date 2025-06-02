package jpbasic;

import java.util.Scanner;

public class LargestOfThree {
	
	public static void largestOfThree(int num1, int num2, int num3) {
		int largest;
		
		if((num1>num2)&&(num1>num3)) {
			largest=num1;
		}else if((num2>num1)&&(num2>num3)) {
			largest=num2;
		}else {
			largest=num3;
		}
		
		System.out.println("Largest number is "+largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		largestOfThree(num1, num2, num3);
		
		sc.close();
	}

}
