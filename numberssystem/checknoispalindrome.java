package numberssystem;

public class checknoispalindrome {
public static void main(String[] args) {
	int a=2332;
	int copy=a;
	int rev = 0;
	while(a!=0) {
		int rem= a%10;
		rev=(rev*10)+rem;
		a=a/10;
	}
	if(copy==rev)
	System.out.println( "it is palindrome");
	else {
		System.out.println("it is not a palindrome");
	}
}
}
