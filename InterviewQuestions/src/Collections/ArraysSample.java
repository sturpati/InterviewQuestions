package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArraysSample {

	//To find the common and different elements in 2 arrays

	public static void main(String[]args) {
		
		/*int length;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the array");
		length = input.nextInt();
		int array1[] = new int[length];
		for(int count = 0;count<length;count++){
			System.out.println("Enter value of the array");
			array1[count] = input.nextInt();
		}*/
		int array1[] = {1,2,3,4,5};
		int array2[]= {2,6,8,4,1,7,11};
		
		
		Set<Integer> setA = new HashSet<Integer>();
		for(int i=0;i<array1.length;i++){
			setA.add(array1[i]);
		}
		System.out.println( setA.size() );
		List<Integer> common = new ArrayList<Integer>();
		List<Integer> diff = new ArrayList<Integer>();

		for(int i= 0; i< array2.length ;i++){
			if (setA.contains(array2[i])){
				common.add(array2[i]);
				setA.remove(array2[i]);
			} else{
				diff.add(array2[i]);
			}
		}
		
		diff.addAll(setA);
		System.out.println("Common elements are: " +common);
		System.out.println("Common elements are: " +diff);

	}

}
