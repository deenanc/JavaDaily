package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Set<String> set=new HashSet<String>();
		System.out.println("Enter the number of names");
		int numberOfNames=sc.nextInt();
		System.out.println("Enter names");
		for(int i=0;i<=numberOfNames;i++) {
			String name=sc.nextLine();
			set.add(name);
		}
		
		System.out.println(set);
		
		for(String name:set) {
			System.out.println(name);
		}
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String output=it.next();
			System.out.println(output);
		}
		
		sc.close();

	}

}
