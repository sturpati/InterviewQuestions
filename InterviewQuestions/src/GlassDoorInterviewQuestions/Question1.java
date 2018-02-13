package GlassDoorInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* 
 * Interviewer gave me an array of character and asked me to find first non-repeating character
 */

public class Question1 {

	public static void main (String[]args){
		char inputs[] = {'a', 'b', 'c', 'd', 'a', 'c'};

		usingMap(inputs);


	}

	public static void usingSets(char inputs[]){
		
	}

	public static void usingMap(char inputs[]){
		Map<Character,Integer> nonRepeat = new HashMap<Character,Integer>();

		for (char input : inputs){
			int count = 1;
			if (nonRepeat.containsKey(input)){
				count = nonRepeat.get(input);	
				count++;
			} 
			nonRepeat.put(input, count);
		}

		for (Entry<Character,Integer> entry: nonRepeat.entrySet()){
			if (entry.getValue()==1){

				char nonRepeatingChar =entry.getKey();
				System.out.print(nonRepeatingChar);

				break;
			}
		}
	}
}
