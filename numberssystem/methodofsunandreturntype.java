package numberssystem;

public class methodofsunandreturntype {
public static int sum(int no) {

	int sum = 0;
	while(no!=0) {
		int rem= no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
public static void main(String[] args) {
	int a= sum(1234);
	System.out.println("the total value is "+a);
}
}
