package integer;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class String0521 {
	
	public static void reverseWord(String input) {
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void reverseEachWord(String input) {
		String revSentence="";
		String words[]=input.split(" ");
		for(String word:words) {
			String rev="";
			for(int i=word.length()-1;i>=0;i--) {
				rev=rev+word.charAt(i);
			}
			revSentence=revSentence+rev+" ";
		}
		System.out.println(revSentence);
	}
	
	public static void charOccurrence(String input) {
		HashMap<Character,Integer> map=new HashMap<>();
		char letters[]=input.toCharArray();
		for(char letter:letters) {
			if(map.containsKey(letter)) {
				map.put(letter, map.get(letter)+1);
			}else {
				map.put(letter, 1);
			}
		}
		System.out.println(map);
	}
	
	public static void wordOccurrence(String input) {
		HashMap<String,Integer> map=new HashMap<>();
		String words[]=input.split(" ");
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}
	
	public static void removeDuplicateChar(String input) {
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		char letters[]=input.toCharArray();
		for(char letter:letters) {
			set.add(letter);
		}
		StringBuffer sb=new StringBuffer();
		for(char c:set) {
			sb.append(c);
		}
		String output=sb.toString();
		System.out.println(output);
	}
	
	public static void removeDuplicateWord(String input) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		String words[]=input.split(" ");
		for(String word:words) {
			set.add(word);
		}
		StringBuffer sb=new StringBuffer();
		for(String s:set) {
			sb.append(s).append(" ");
		}
		String output=sb.toString();
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input");
		String input=sc.nextLine();
		
//		reverseWord(input);
//		reverseEachWord(input);
//		charOccurrence(input);
//		wordOccurrence(input);
//		removeDuplicateChar(input);
		removeDuplicateWord(input);
		
		sc.close();

	}

}
