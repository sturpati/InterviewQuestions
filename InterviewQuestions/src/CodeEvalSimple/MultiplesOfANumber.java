package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiplesOfANumber {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			String [] splitInput = input.split(",");
			int x =Integer.parseInt(splitInput[0] );
			int n = Integer.parseInt(splitInput[1]);

			int i=1;
			long smallestMultiple = 0;
			while (smallestMultiple<x){
				smallestMultiple = n*i;
				i++;
			}

			System.out.println(smallestMultiple);


			/*for(int i=0;i<n;i++){
			long smallestMultipe = (long)(Math.pow(2,i));
			if (smallestMultipe>=x){
				System.out.println(smallestMultipe);
				break;
			}
		}*/
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
