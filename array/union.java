package array;

import java.util.Set;
import java.util.TreeSet;

public class union {
public static void main(String[] args) {
	int[] a= {1,3,2,1,4,6,10};
	int[] b= {5,2,8,7,6,10,9};
	Set<Integer> s1=new TreeSet<Integer>();
	for (Integer x : a) {
		s1.add(x);
	}
	for (Integer y : b) {
		s1.add(y);
	}
	System.out.println(s1);
}
}
