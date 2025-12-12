package numberssystem;

public class fibonacciwhileloop {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int res=0;
	int ranges=10;
	System.out.println(a);
	System.out.println(b);
	int i=2;
	while (i<ranges) {
		res=a+b;
		System.out.println(res);
		a=b;
		b=res;
		i++;
	}
}
}
