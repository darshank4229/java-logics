package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class toremoveduplicate {
	public static void main(String[] args) {
		int[] a= {3,1,2,2,3,1,4,5,6,4,7,8};
		System.out.println(Arrays.toString(a));
		Set<Integer> s1=new LinkedHashSet();
		for (int i = 0; i < a.length; i++) {
			s1.add(a[i]);
		}
		System.out.println(s1);
	}
}
