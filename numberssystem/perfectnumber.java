package numberssystem;

public class perfectnumber {
public static void main(String[] args) {
	int no=12;
	int sum=0;
	for (int i = 1; i <=no/2; i++) {
		if(no%i==0) {
			sum=sum+i;
		}
	}
	if(sum==no) {
		System.out.println(no+" "+" its is a perfect number");
	}
	else {
		System.out.println(no+" "+" its is  not a perfect number");
	}
}
}
