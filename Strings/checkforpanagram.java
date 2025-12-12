package Strings;
import java.util.Set;
import java.util.TreeSet;
public class checkforpanagram {
public static void main(String[] args) {
	String str="the quick brown fox jumps over the lazy dog";
	str=str.replaceAll(" ", "").toLowerCase();
	Set<Character> s1=new TreeSet<Character>();
	for (int i = 0; i < str.length(); i++) {
		s1.add(str.charAt(i));
	}
	if(s1.size()==26) {
		System.out.println(" it is a panagram");
	}
	else {
		System.out.println(" it is not a panagram");
	}
}
}