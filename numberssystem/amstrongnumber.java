package numberssystem;

public class amstrongnumber {
public static void main(String[] args) {
	int no =153;
	int a=no;
	int b=no;
	int count =0;
	double sum=0;
	while(no!=0) {
		count++;
		no=no/10;
	}
	while(a!=0) {
		int r=a%10;
		sum=sum+Math.pow(r, count);
		a=a/10;
	}
	if(sum==b) {
		System.out.println(sum+" == "+b+ " so it is amstrong number");
	}
	else {
		System.out.println(sum+" != "+b+ " so it is not a  amstrong number");
	}
}
}
