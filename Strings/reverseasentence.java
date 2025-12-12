package Strings;

public class reverseasentence {
	public static void main(String[] args) {
		String str="My Name Is Darshan";
		
		String[] s=str.split(" ");
		for (int i = s.length-1; i >=0; i--) {
			System.out.print(s[i]+" ");
		}
	}
}
