package numberssystem;

public class tillgettingsingeldigit {
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
int no =2345;
while(no>9) {
	no=sum(no);
}
System.out.println("the sum is "+no);
}
}