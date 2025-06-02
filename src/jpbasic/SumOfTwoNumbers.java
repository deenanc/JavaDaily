package jpbasic;

import java.util.Scanner;

public class SumOfTwoNumbers {
	
	public static void addTwoNumbers(int num1, int num2) {
		int sum;
		sum=num1+num2;
		System.out.println("Sum of two numbers "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		addTwoNumbers(num1, num2);
		
		sc.close();

	}

}
