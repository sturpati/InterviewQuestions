package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordToDigit {

	public static void main(String [] args){
		for(String input : readFromFile(args[0])){
			String [] splitInput = input.split(";");
			for (String i : splitInput)
				switch(i)
				{
				case "zero" :
					System.out.print(0);
					break;
				case "one" :
					System.out.print(1);
					break;
				case "two" :
					System.out.print(2);
					break;
				case "three" :
					System.out.print(3);
					break;
				case "four" :
					System.out.print(4);
					break;
				case "five" :
					System.out.print(5);
					break;
				case "six" :
					System.out.print(6);
					break;
				case "seven" :
					System.out.print(7);
					break;
				case "eight" :
					System.out.print(8);
					break;
				case "nine" :
					System.out.print(9);
					break;
				}
			System.out.print("\n");
		}

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
