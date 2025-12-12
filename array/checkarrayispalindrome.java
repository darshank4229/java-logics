package array;
public class checkarrayispalindrome {
public static void main(String[] args) {
	int[] a= {1,2,3,2,1};
	for (int i = 0; i < a.length/2; i++) {
		if(a[i]!=a[a.length-1-i]) {
			System.out.println(" the given array is not a palindrome");
			return;
		}		
	}
	System.out.println(" the given array  is a palindrome ");
}
}