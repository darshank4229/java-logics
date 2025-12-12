package numberssystem;

public class sumofodd {
public static void main(String[] args) {
	int a=2345;
	int sum = 0;
	while(a!=0) {
		int rem= a%10;
		if(rem%2==1)
		{
		sum=sum+rem;
		}
		a=a/10;
	}
	System.out.println( " the total sum is  "+sum);
}
}
