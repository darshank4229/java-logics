package Strings;

public class palindromwith {
	public static void main(String[] args) {
		String str="darshan";
		String res="";
		for (int i = str.length()-1; i >=0; i--) {
			res=res+str.charAt(i);
		}
		if(str==res) {
			System.out.println("it is palindrome ");
		}
		else {
			System.out.println("it is not a palindrome ");
		}
		
	}
}
