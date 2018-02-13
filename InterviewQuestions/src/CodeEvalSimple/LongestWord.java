package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LongestWord {

	public static void main(String [] args){
		for(String inputText : readFromFile(args[0])){
			String[] splitText = inputText.split(" ");
			int length = splitText.length;	
			int x = 0;
			String word = null;
			for(int i=0; i<length;i++){
				int wordSize = splitText[i].length();
				if(wordSize>x){
					x = wordSize;
					word = splitText[i].toString();
				}
			}
			System.out.println(word);
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


