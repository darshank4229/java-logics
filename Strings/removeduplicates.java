package Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicates {
public static void main(String[] args) {
	String str="aabbcddefgghi";
	char[] ch=str.toCharArray();
	System.out.println(Arrays.toString(ch));
	Set<Character> s1=new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		s1.add(ch[i]);
	}
	System.out.println(s1);
}
}
