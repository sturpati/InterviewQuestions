package CodeEvalSimpleNotCompleted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WineName {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){ 
			String[] splitInput = input.split("\\|");
			String[] wineNames= splitInput[0].trim().split(" ");
			char[] letters = splitInput[1].trim().toCharArray();
			StringBuffer sb = new StringBuffer();
			int count = letters.length;

			for (String wineName : wineNames){
				count = 0;

				char[] wineNameChars = wineName.toCharArray();
				for (char letter : letters){

					for (char wineNameChar : wineNameChars ){
						if (letter==wineNameChar){
							count++;
							if (count == letters.length){
								sb.append(wineName + " ");
							}
							break;

						}

					}
				}
			}

			if (sb.length() == 0){
				System.out.println("False");

			}else{
				System.out.println(sb.toString());
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
