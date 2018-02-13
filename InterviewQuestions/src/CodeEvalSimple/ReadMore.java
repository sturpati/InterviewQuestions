package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadMore {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			char [] charInput = input.toCharArray();
			int size = charInput.length;
			StringBuffer sb = new StringBuffer();
			if (size > 55){
				int index = 0; 
				while(index <=39){
					sb.append(charInput[index]);						
					index++;
				}

				int spaceIndex = sb.toString().lastIndexOf(" ");
				if(spaceIndex > 0) {
					System.out.println(sb.substring(0, spaceIndex)+"... <Read More>");
				} else {
					System.out.println(sb.toString()+"... <Read More>");
				}
				
				
				
			}else {
				System.out.println(input);
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
