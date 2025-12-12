package array;

import java.util.Arrays;

public class merge2arraywith {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int[] b= {10,20,30,40,50};
	int [] temp=new int[a.length+b.length];
	System.arraycopy(a, 0, temp, 0, a.length);
	System.out.println(Arrays.toString(temp));
	System.arraycopy(b, 0, temp,  a.length,b.length);
	System.out.println(Arrays.toString(temp));
}
}
