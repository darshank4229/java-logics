package array;
public class lenearmethod {
	static void present(int[] a,int search)
	{		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==search) {
				System.out.println("the value is present in"+" "+i);
				return;
			}		
		}
		System.out.println("the value is not present");
	}	
public static void main(String[] args) {
	int[] a= {10,20,3,2,40};
	int search=4;
present(a,search);	
}
}