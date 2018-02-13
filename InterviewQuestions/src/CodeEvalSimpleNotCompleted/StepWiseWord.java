package CodeEvalSimpleNotCompleted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StepWiseWord {

	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
			String[] words = input.split(" ");
			int previousLength = 0;
			String longestWord = null;
			for (String word: words){
				int length = word.length();
				if (length > previousLength){
					longestWord = word;
					previousLength = length;
				}

			}


			StringBuffer sb = new StringBuffer();
			char[] wordChars = longestWord.toCharArray();
			String star = " ";
			for (char wordChar : wordChars){

				sb.append(star+wordChar);
				star = star + "*";
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
