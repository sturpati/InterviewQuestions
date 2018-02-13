package GlassDoorInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * write a program to remove duplicates numbers from the list and display the duplicates ? 
 * ( The Programming Language can be any, I did in Java ) and the interviewer shares the screen with you and can see you typing .  
 */
public class Question3 {
	
	public static void main(String[]args){
		
		List<Integer> numbers = new ArrayList<Integer> ();
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		removeDuplicates(numbers);
		int numDuplicate = 0;
		int count = 0;
		
		/*for (int num : numbers){
			for (int j=1; j<numbers.size();j++){
				numDuplicate = numbers.get(j);
				if (num == numDuplicate){
					count++;
					if (count > 1) {
						numbers.remove(j);
					}

				}
			}
			if (count > 1){
				System.out.println("Duplicates:"+num);
				count = 0;
			}	
			

		}
		for(int k=0;k<numbers.size();k++){
		    System.out.println(numbers.get(k));
		} */
		
	}
	
	public static void removeDuplicates(List<Integer> list) {
		
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		List<Integer> duplicates = new ArrayList<Integer>();
		List<Integer> nonDuplicates = new ArrayList<Integer>();
		for(int i: list) {
			if(!uniqueNumbers.add(i)) {
				duplicates.add(i);
			} else {
				nonDuplicates = new ArrayList<Integer>();
			}
		}
        System.out.println("Varuns output");
		for(int i : duplicates) System.out.println(i);
		System.out.println("UNique");
		for(int i : uniqueNumbers) System.out.println(i);
		
	}

	
}
