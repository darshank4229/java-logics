package numberssystem;

import java.util.Scanner;

public class rangeofprimebumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	System.out.println("enter the range");
	int range =sc.nextInt();
	for (int j = a+1; j < range; j++) {
		a=j;
	boolean b=true;
	if(a<=1) {
		b=false;
	}
	else {
		for (int i = 2; i<=Math.sqrt(a); i++) {
			if(a%i==0) {
				b=false;
				break;
			}
		}}
		if(b) {
			System.out.println(a+" "+ " is a prime number");
		}
	
	}
}
}
