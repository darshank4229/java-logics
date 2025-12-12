package numberssystem;

public class strongnumber {
public static int fact(int no) {
	int sum=1;
	for (int i = 1; i <=no; i++) {
		sum=sum*i;
	}
	return sum;
}
public static void main(String[] args) {
	int no=3;
	int sum=0;
	int a=no;
	while(no!=0) {
		int rem=no%10;
		sum=sum+fact(rem);
		no=no/10;
	}
	if(a==sum) {
		System.out.println(a+"  it is a strong number");
	}
	else {
		System.out.println(a+"  it is not  a strong number");
	}
}
}
