package array;

import java.util.Arrays;

public class addarrywithout {
	public static void main(String[] args) {
	int[] a= {1,9,3,2,6};
	int[] b= {8,10,7,4,5};
	int [] temp=new int[a.length+b.length];
	int j=0;
	for (int i = 0; i < a.length; i++) {
		temp[j++]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		temp[j++]=b[i];
	}
	Arrays.sort(temp);
	System.out.println(Arrays.toString(temp));
}
}
