package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalizeWords {

	public static void main (String[]args){
		for (String input : readFromFile(args[0])){
			StringBuffer sb = new StringBuffer();
			boolean first = true;
			boolean foundSpace = false;
			for(Character ch : input.toCharArray()) {
				if(first) {
					sb.append(Character.toUpperCase(ch));
					first = false;

				} else {

					if(ch == ' ') {
						sb.append(ch);
						foundSpace = true;

					} else if(foundSpace) {
						sb.append(Character.toUpperCase(ch));
						foundSpace = false;
					} else {
						sb.append(ch);
					}
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
