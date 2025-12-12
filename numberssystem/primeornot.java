package numberssystem;

import java.util.Scanner;

public class primeornot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	boolean b=true;
	if(a<=1) {
		b=false;
	}
	else {
		for (int i = 2; i<Math.sqrt(a); i++) {
			if(a%i==0) {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println(a+" "+ " is a prime number");
		}
		else {
		System.out.println(a+" "+ " is  not a prime number");
		}
	}
	
}
}
