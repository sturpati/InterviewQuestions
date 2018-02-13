package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelfDescribingNumber {

	public static void main(String [] args){

		for(String input : readFromFile(args[0])){		
			char[] charInputs = input.toCharArray();
			Map<Character,Integer> map =  new HashMap <Character,Integer>();

			for (char charInput : charInputs){
				int count = 1;

				if (map.containsKey(charInput)){
					count = map.get(charInput);
					count++;
				}
				map.put(charInput, count);
			}

			

			Boolean output = true;

			for (int i=0; i<charInputs.length;i++){
				int value=0;
				if(map.containsKey(String.valueOf(i).toCharArray()[0])){
					value = map.get(String.valueOf(i).toCharArray()[0]); 
				}
				//System.out.println(value);
				//System.out.println(charInputs[i]);
				if (Character.getNumericValue(charInputs[i]) != value){
					output = false;
					break;
				}
				//System.out.println(value);
			}
			if(output){
				System.out.println(1);
			}else{
				System.out.println(0);
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
