package numberssystem;

public class tofindthecountofnumber {
public static void main(String[] args) {
	int no=20259798;
	int count=0;
	while(no!=0) {
		count++;
		no=no/10;
	}
	System.out.println("the count is  "+count);
}
}
