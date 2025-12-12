package numberssystem;

public class sumofsquareofnumber {
public static void main(String[] args) {
	int a=2345;
	double sum = 0;
	while(a!=0) {
		int rem= a%10;
		sum=sum+Math.pow(rem, 4);
		a=a/10;
	}
	System.out.println( " the total sum is  "+sum);
}
}

