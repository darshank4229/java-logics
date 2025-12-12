package Strings;
import java.util.LinkedHashMap;
import java.util.Map;
public class uniquecharecorsonly {
	 public static void main(String[] args) {
	        String s = "darshan";
	        Map<Character, Integer> m1 = new LinkedHashMap<Character, Integer>();
	        for (char ch : s.toCharArray()) {
	            if (ch != ' ') { 
	                m1.put(ch, m1.getOrDefault(ch, 0) + 1);
	            }
	        }
	        m1.forEach((key, value) -> {
	        	if(value==1)
	            System.out.println(key + " -> " + value);
	        });
	    }
}
