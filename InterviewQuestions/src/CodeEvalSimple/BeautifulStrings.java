package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BeautifulStrings {

	public static void main(String[]args){
		for (String input : readFromFile(args[0])){
			char[] inputChar = input.toCharArray();
			Map<Character,Integer> map=new HashMap<Character,Integer>(); 
			for(char ch : inputChar){
				if(Character.isAlphabetic(ch)){
				int count = 1;
				if(map.containsKey(Character.toLowerCase(ch))){
					count += map.get((Character.toLowerCase(ch)));

				}
				map.put(Character.toLowerCase(ch), count);
				}
			}

			List<Integer> mapValues = new ArrayList<Integer>();
			
			for(Entry<Character, Integer> entry : map.entrySet()){
				mapValues.add(entry.getValue());
				//System.out.println("key "+entry.getKey()+" value "+ entry.getValue());
			}

			Collections.sort(mapValues);
			Collections.reverse(mapValues);

			int i= 0;
			int max = 26;
			Map<Integer,Integer> beautifulMap = new HashMap<Integer,Integer>();  
			int size = mapValues.size();
			while ( i < size){
				beautifulMap.put(max, mapValues.get(i));
				max--;
				i++;
			}

			int sum = 0;
			for(Entry<Integer, Integer> entry : beautifulMap.entrySet()){
				int valueOfAlphabet = entry.getKey() * entry.getValue();
				sum += valueOfAlphabet;
			}

			System.out.println(sum);
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
