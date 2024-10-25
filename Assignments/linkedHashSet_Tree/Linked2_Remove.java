package linkedHashSet_Tree;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked2_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character>character=new LinkedHashSet<>();
		character.add('A');
		character.add('B');
		character.add('C');
		character.add('D');
		character.add('E');
	
		System.out.println(character);
		
		character.remove("C");
		System.out.println(character);

	}

}
