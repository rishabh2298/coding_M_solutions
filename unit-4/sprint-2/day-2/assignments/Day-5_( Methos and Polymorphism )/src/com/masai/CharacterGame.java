package com.masai;

public class CharacterGame {
	
	void characterType(char x) {
		
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' ||
				x=='O' || x=='U') {
			System.out.println("Vowel");
		}
		else if(x=='b' || x=='c' || x=='d' || x=='f' || x=='g' || x=='h' || x=='j' || x=='k'
				 || x=='l' || x=='m' || x=='n' || x=='p' || x=='q' || x=='r' || x=='s' || x=='t'
				 || x=='v' || x=='w' || x=='x' || x=='y' || x=='z' || x=='B' || x=='C' || x=='D'
				 || x=='F' || x=='G' || x=='H' || x=='J' || x=='K' || x=='L' || x=='M' || x=='N'
				 || x=='P' || x=='Q' || x=='R' || x=='S' || x=='T' || x=='V' || x=='W' || x=='X'
				 || x=='Y' || x=='Z') {
			System.out.println("Consonant");
		}
		else {
			System.out.println("Invalid Character");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharacterGame g1 = new CharacterGame();
		g1.characterType('a');
		g1.characterType('C');
		g1.characterType('#');
	}

}
