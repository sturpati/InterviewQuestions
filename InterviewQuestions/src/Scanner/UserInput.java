package Scanner;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args){
		float f;
		int n;
		String s;
		Scanner in = new Scanner(System.in);
		
		s = in.nextLine();
		System.out.println("you entered string "+s);
		n = in.nextInt();
		System.out.println("you entered number "+n);
		f= in.nextFloat();
		System.out.println("you entered float "+f);

	}

}
