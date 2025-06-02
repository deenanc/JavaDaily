package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		System.out.println("Enter the number of names");
		int numberOfNames=sc.nextInt();
		
		System.out.println("Enter names");
		for(int i=0;i<=numberOfNames;i++) {
			String name=sc.nextLine();
			list.add(name);
		}
		
		for(String output:list) {
			System.out.println(output);
		}
		
		System.out.println(list);
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			String output1=it.next();
			System.out.println(output1);
		}
		
		sc.close();

	}

}
