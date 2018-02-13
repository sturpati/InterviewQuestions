package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorElement {

	public static void main (String[] args){
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split(",");
			int size = (splitInput.length)/2;
			int maxNumber = 0;
			String maxKey = null;
			Map<String,Integer> map = new HashMap <String,Integer>();
			for(String i : splitInput){
				int count = 1;
				if(map.containsKey(i)){
					count += map.get(i);
				}
				map.put(i, count);
			}
			for(Map.Entry<String, Integer> entry : map.entrySet()){
				int value = entry.getValue();
				String key = entry.getKey();
				if (value>maxNumber){
					maxNumber = value;
					maxKey = key;
				}


			}
			if (maxNumber > size){
				System.out.println(maxKey);
			}else {
				System.out.println("None");
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
