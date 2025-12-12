package Strings;
public class reverseawordnotsentence {
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
		for (int i = 0; i <s.length; i++) {
			System.out.print(rev(s[i])+" ");
		}
	}
}
