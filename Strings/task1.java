package Strings;

public class task1 {
public static void main(String[] args) {
	String str="mEtHoDoVeRlOaDiNg";
	String res="";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>='A'&& ch<='Z') {
			res=res+(char)(ch+32);
		}
		else
		{
			res=res+(char)(ch-32);
		}		
	}
	System.out.println(res);
}
}
