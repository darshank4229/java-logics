package Strings;

public class reverseasentenceandword {
static String rev(String a) {
	String res="";
	for (int i = a.length()-1; i >=0; i--) {
		res=res+a.charAt(i);
	}
	return res;
}
public static void main(String[] args) {
	String str="My Name Is Darshan";
	
	String[] s=str.split(" ");
	for (int i = s.length-1; i >=0; i--) {
		System.out.print(rev(s[i])+" ");
	}
}
}
