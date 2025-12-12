package Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removedupwordsinsentence {
	public static void main(String[] args) {
		String str="hey hey hi hi hello rr rr u u ";
		String[] ch=str.split(" ");
		System.out.println(Arrays.toString(ch));
		Set<String> s1=new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) {
			s1.add(ch[i]);
		}
		System.out.println(s1);
	}
}
