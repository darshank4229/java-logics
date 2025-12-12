package array;

import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
public static void main(String[] args) {
	int[] a= {1,3,2,1,4,6,10};
	int[] b= {5,2,8,7,6,10,9};
	ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(1,3,2,1,4,6,8));
	System.out.println(a1);
	ArrayList<Integer> a2=new ArrayList<Integer>(Arrays.asList(5,2,8,7,6,10,9));
	System.out.println(a2);
	a1.retainAll(a2);
	System.out.println(a1);
}
}
