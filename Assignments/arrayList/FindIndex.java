package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character>character=new ArrayList<>();
		character.add('A');
		character.add('B');
		character.add('a');
		character.add('4');
		
		character.add('E');
		character.add('R');
		character.add('G');
		character.add('H');
		character.add('J');
		character.add('i');
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char letter=sc.next().charAt(0);
		
	System.out.println("Index of "+letter +" is "+findIndex(letter,character));
		
	}

	private static int findIndex(char letter,List<Character> character) {
		// TODO Auto-generated method stub
//		for(int i=0;i<character.size();i++) {
//			if(character.get(i)==letter)
//				return i;
//	}
//		return -1;
		return character.indexOf(letter);
	}
}
