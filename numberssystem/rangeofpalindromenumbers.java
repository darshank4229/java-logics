package numberssystem;

public class rangeofpalindromenumbers {
public static void main(String[] args) {
	int sum=0;
	for(int i =1;i<=100;i++) {
		int b=i;
		while(i!=0) {
			int rem= i%10;
			if(i<=10)
			sum=(sum*10)+rem;
			i=i/10;
		}
		
		
	}
}
}
