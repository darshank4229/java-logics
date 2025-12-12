package numberssystem;

public class productofnumber {
public static void main(String[] args) {
	int a=2345;
	int prd = 1;
	while(a!=0) {
		int rem= a%10;
		
		prd=prd*rem;
		
		a=a/10;
	}
	System.out.println( " the total sum is  "+prd);
}
}
