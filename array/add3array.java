package array;

import java.util.Arrays;

public class add3array {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int[] b= {1,2,3,4,5};
	int[] c= {11,22,33,44,55};
	int [] temp=new int[a.length+b.length+c.length];
	System.arraycopy(a, 0, temp, 0, a.length);
	System.arraycopy(b, 0, temp,  a.length,b.length);
	System.arraycopy(c, 0, temp, a.length+ b.length,c.length);
	System.out.println(Arrays.toString(temp));
}
}
