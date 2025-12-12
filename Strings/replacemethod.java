package Strings;

public class replacemethod {
	public static void main(String[] args) {
		String str="Make";
		char[]arr= {'C','B','F','T','L','W'};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(str.replace('M', arr[i]));
		}
		
//		System.out.println(str.replace("M", "F"));
//		System.out.println(str.replace("M", "B"));
//		System.out.println(str.replace("M", "T"));
//		System.out.println(str.replace("M", "L"));
//		System.out.println("***************************************");
//		String ss="Son shines the world";
//		System.out.println(ss);
//		System.out.println(ss.replace("Son", "Sun"));
	}
}
