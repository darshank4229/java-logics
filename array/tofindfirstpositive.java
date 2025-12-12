package array;

import java.util.Arrays;

public class tofindfirstpositive {
public static void main(String[] args) {
	int[] a= {5,2,1,4,6};
	Arrays.sort(a);
	int sum=0;
	int no=a[a.length-1];
	int res=no*(no+1)/2;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];		
	}
	System.out.println(res-sum);
	
}
}
