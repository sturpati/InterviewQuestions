package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

	/*A happy number is defined by the following process. Starting with any positive integer,
	 *replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
	 *(where it will stay), or it loops endlessly in a cycle which does not include 1. 
	 *Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1
	 *are unhappy numbers. 
	 *example: 7 is a happy number: 7->49->97->130->10->1.
	 * 22 is NOT a happy number: 22->8->64->52->29->85->89->145->42->20->4->16->37->58->89 ... */

	public static void main(String []args){

		//int inputNumber = 22;	
		for(String inputNumber: readFromFile(args[0])){
			
		long sum ;
		sum=Long.valueOf(inputNumber);
		Set<Long> duplicate = new HashSet <Long>();

		while(sum>1)
		{
			sum=sumOfNumbersSquare(sum);
			if(duplicate.contains(sum)){
				System.out.println(0);	
				break;
			}else{
				duplicate.add(sum);
			}

		}
		if(sum==1)
			System.out.println(1);
		
		}
	}

	public static long sumOfNumbersSquare(long inputNumber){
		long sum = 0;
		while (inputNumber != 0) { 
			sum = ((inputNumber%10)*(inputNumber%10)) + sum;
			inputNumber /= 10; 
		} 

		return sum;
	}
	
public static List<String> readFromFile(String filePath){
		
		File file = new File(filePath);
		BufferedReader reader = null;
		List<String> result = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(file));
			String stLine = null;
			while((stLine = reader.readLine()) != null) {
				result.add(stLine);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
}
