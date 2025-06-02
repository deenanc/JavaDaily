package jpbasic;

import java.util.Scanner;

public class SwappTwoNumbers {
	
	public static void swapTwoNumbers(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Fist number after swapping "+num1);
		System.out.println("Second number after swapping "+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input");
		int num1=sc.nextInt();
		System.out.println("Enter second input");
		int num2=sc.nextInt();
		
		swapTwoNumbers(num1, num2);
		
		sc.close();

	}

}
