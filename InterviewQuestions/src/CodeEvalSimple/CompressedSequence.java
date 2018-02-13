package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CompressedSequence {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInputs = input.split(" ");
			StringBuffer sb = new StringBuffer();
			String previousInput = null;
			int count = 1;

			for (String splitInput : splitInputs ){
				if (splitInput.equalsIgnoreCase(previousInput)){
					count++;
				}else if (previousInput!=null) {
					sb.append(count + " "+ previousInput+ " " );
					count = 1;
				}
				previousInput = splitInput;

			}
			sb.append(count + " "+ previousInput+ " " );

			System.out.println(sb.toString().trim());

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
