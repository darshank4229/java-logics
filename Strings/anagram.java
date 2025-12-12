package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("enter the 1st string");
	String str1=s1.next();
	System.out.println("enter the 2nd string");
	String str2=s1.next();
	if(str1.length()==str2.length()) {
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
	if(	Arrays.equals(c1, c2)) {
		System.out.println("it is anagram");
	}
	else {
		System.out.println("it is  not a anagram");
	}		
		}
	else {
		System.out.println("not an anagram");
	}
}
}
