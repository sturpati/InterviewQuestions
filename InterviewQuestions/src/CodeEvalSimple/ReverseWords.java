package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
	
	//Reversing an input sequence of words
	
	public static void main(String[]args){
		for(String inputWord : readFromFile(args[0])){
		String[] splitWord = inputWord.split(" ");
		int size = splitWord.length;

		StringBuffer sb = new StringBuffer();
			for(int i=size-1; i<size ;i-- ){
				sb.append(splitWord[i]);
				sb.append(" ");
				if (i==0){
					i = size+1;
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
