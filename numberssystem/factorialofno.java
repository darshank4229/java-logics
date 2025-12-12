package numberssystem;

public class factorialofno {
public static int fact(int no) {
	int sum=1;
	for (int i = 1; i <=no; i++) {
		sum=sum*i;
	}
	return sum;
}
public static void main(String[] args) {
	int a=fact(4);
	System.out.println("the factorial is  "+a);
}
}
