package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MorseCode {

	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
			String[] eachWords = input.split("  ");
			StringBuffer sb = new StringBuffer();
			for (String eachWord : eachWords ){
				String[] eachLetters = eachWord.split(" ");
				for (String eachLetter : eachLetters){
					String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
							"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
							"W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",
							"9", "0", " " };

					String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
							"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
							"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
							"-.--", "--..", ".----", "..---", "...--", "....-", ".....",
							"-....", "--...", "---..", "----.", "-----", "|" };
					for (int i = 0; i<morse.length;i++ ){
						if (morse[i].equalsIgnoreCase(eachLetter)){
							sb.append(alpha[i]);
						}
					}
				}
				sb.append(" ");
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
