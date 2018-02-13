package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split(" ");
			int x = Integer.parseInt(splitInput[0]);
			int y = Integer.parseInt(splitInput[1]);
			int z = Integer.parseInt(splitInput[2]);
			StringBuffer sb = new StringBuffer();
			int multiply = 0;
			Boolean xMultiple = false;
			Boolean yMultiple = false;
			while(multiply<z){
				multiply++;
				xMultiple = multiply%x==0;
				yMultiple = multiply%y==0;
				
				if (xMultiple && yMultiple){
					sb.append("FB ");

				}
				else if (xMultiple){
					sb.append("F ");
				}
				else if (yMultiple){
					sb.append("B ");

				}
				else {
					sb.append(multiply+" ");
				}
			}
			System.out.println(sb.toString());
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
