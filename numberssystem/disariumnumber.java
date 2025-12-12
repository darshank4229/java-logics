package numberssystem;

public class disariumnumber {
public static void main(String[] args) {
	int no =135;
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
		count--;
		a=a/10;
	}
	if(sum==b) {
		System.out.println(sum+" == "+b+ " so it is disarium number");
	}
	else {
		System.out.println(sum+" != "+b+ " so it is not a  disarium number");
	}
}
}
