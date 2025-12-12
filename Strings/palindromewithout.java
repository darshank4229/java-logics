package Strings;

public class palindromewithout {
	public static void main(String[] args) {
		String str="level";
		char[] ch=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			if(ch[i]!=ch[j]) {
			System.out.println("it is  not a palindrome");	
			return;
			}
			i++;
			j--;
		}
		System.out.println("it is a palindrome");
	}
}
