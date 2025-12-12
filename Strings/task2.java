package Strings;

public class task2 {
public static void main(String[] args) {
	String str="hello";
	String res="";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		res=res+(char)(ch+4);
	}
	System.out.println(res);
}
}
