package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RealFakeCreditCard {

	public static void main(String[] args){
		for(String creditCardNumber: readFromFile(args[0])){
			String newC = creditCardNumber.replaceAll(" ", "");
			char[] everyNumber = newC.toCharArray();
			int sum;
			int newSum = 0;
			for(int i=0;i<everyNumber.length;i++){
				if(i%2==0){
					sum = 2*Character.getNumericValue(everyNumber[i]);
				}else{
					sum = Character.getNumericValue(everyNumber [i]);
				}
				newSum += sum;
			}
			if((newSum%10) == 0){
				System.out.println("Real");
			}else{
				System.out.println("Fake");

			}
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
