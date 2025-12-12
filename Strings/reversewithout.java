package Strings;

public class reversewithout {
public static void main(String[] args) {
	String str="darshan";
	char[] ch=str.toCharArray();
	int i=0;
	int j=str.length()-1;
	while(i<j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		i++;
		j--;
		
	}
	System.out.println(ch);
}
}
