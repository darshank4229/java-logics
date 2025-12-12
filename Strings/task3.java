package Strings;

public class task3 {
    public static void main(String[] args) {
        String str = "how are you java";
        String[] s = str.split(" ");
        String res= "";

        for (int i = 0; i < s.length; i++) {
            char first = (char)(s[i].charAt(0) - 32);  
            res = res+first + s[i].substring(1) + " ";
        }

        System.out.println(res);
    }
}
