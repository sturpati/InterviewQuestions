package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

	public static void main(String [] args){
		for(String input : readFromFile(args[0])){
			int inputValue = Integer.parseInt(input);
			boolean isNumberEven = isEven(inputValue);
			if(isNumberEven==true){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
	}

	public static Boolean isEven(int inputValue){
		if((inputValue%2) == 0){
			return true;
		}else{
			return false;
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
