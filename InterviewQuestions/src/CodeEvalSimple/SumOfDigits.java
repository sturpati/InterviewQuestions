package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class SumOfDigits {

	//Given a positive integer, find the sum of its constituent digits. 
	public static void main(String [] args){
		//Scanner input = new Scanner(System.in);
		//System.out.println("Please input a number ");
		//inputNumber = input.nextLong();
		//input.close();

		for(String input : readFromFile(args[0])) {
			printSumOfDigits(Long.valueOf(input));
		}



	}

	public static void printSumOfDigits(Long inputNumber ){
		Long sum = 0l;
		while (inputNumber != 0l) { 
			sum += inputNumber % 10; 
			inputNumber /= 10; 
		} 
		System.out.println(sum); 

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
