package pattrens;

public class thirdpattren {
public static void main(String[] args) {
	for (int row = 1; row <=5; row++) {
		
		for (int coloum = 0; coloum <=5; coloum++) {
			if(row<=coloum) {
				System.out.print(" *");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

}

