package array;

import java.util.Arrays;

public class allthezero {
public static void main(String[] args) {
	int[] a= {0,3,2,0,0,10,6,0,8,0,9};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int[] temp=new int[a.length];
	int j=0;	
	for (int i = 0; i < a.length; i++) {
		if(a[i]!=0) {
			temp[j++]=a[i];
		}		
	}
	System.out.println(Arrays.toString(temp));
}
}
