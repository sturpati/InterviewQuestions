package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LowestUniqueNumber {

	public static void main(String[]args){
		for (String input : readFromFile(args[0])){		
			String[] splitInputs = input.split(" ");

			Map<String,Integer> duplicate = new TreeMap<String,Integer>();
			for (String splitInput : splitInputs){
				int count = 1;
				if (duplicate.containsKey(splitInput)){
					count = duplicate.get(splitInput);
					count++;
				}
				duplicate.put(splitInput, count);
			}

			int lowestNumber = 0;
			for (Entry<String,Integer> entry: duplicate.entrySet()){
				if (entry.getValue()==1){
					lowestNumber = Integer.parseInt(entry.getKey());
					break;
				}
			}

			if (lowestNumber == 0){
				System.out.println(0);
			} else {
				lowestNumberPosition(splitInputs,lowestNumber);
			}
		}
	}

	public static void lowestNumberPosition(String[] splitInputs,int lowestNumber){
		int position= 1;
		for (String splitInput : splitInputs){
			if (Integer.parseInt(splitInput)==lowestNumber){
				System.out.println(position);
				break;
			}
			position++;
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
