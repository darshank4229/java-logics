package array;
import java.util.ArrayList;
import java.util.Arrays;
public class tofindsequence {
public static void main(String[] args) {
	int[] a= {7,9,4,5,12,15};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	ArrayList a1=new ArrayList();
	for (int i = 0; i < a.length; i++) {
		a1.add(a[i]);
	}
	for (int i = a[0]; i < a[a.length-1]; i++) {
		if (!a1.contains(i)) {
			System.out.print(i+" ");			
		}
	}	
}
}
