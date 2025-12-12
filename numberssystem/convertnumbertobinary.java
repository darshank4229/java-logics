package numberssystem;

public class convertnumbertobinary {
public static void main(String[] args) {
	int no=11;
	int a=no;
	String res="";
	while(no!=0) {
		int rem=no%2;
		res=rem+res;
		no=no/2;
	}
	System.out.println("the binary form of  "+a +" is  "+res);
}
}
