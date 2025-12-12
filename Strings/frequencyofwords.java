package Strings;
import java.util.LinkedHashMap;
import java.util.Map;
public class frequencyofwords {
public static void main(String[] args) {
	String s="programming";
	Map<String, Integer> m1=new LinkedHashMap<String, Integer>();
	String[] s1=s.split(" ");
	for(String s2:s1) {
		m1.put(s2,m1.getOrDefault(s2, 0)+1);
	}	
	m1.forEach((key,value)->{
		System.out.println(key+" "+value);
});
}
}
