package masai.com.question04;

import java.util.Scanner;

public class CharPos {
	
	
	static void getChar(String string, int position) {
		char[] str = string.toCharArray();
		
		for(int i=0; i<str.length; i++) {
			if(position==i) {
				System.out.println("Charater at the position "+position+" => "+str[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Stirng : ");
		String string = scanner.next();
		
		System.out.print("Enter a position : ");
		int position = scanner.nextInt();
		
		while(position>=string.length()) {
			System.out.print("Invalid position, Please enter valid position : ");
			position = scanner.nextInt();
		}
		scanner.close();
		
		getChar(string, position);
		
	}

}
