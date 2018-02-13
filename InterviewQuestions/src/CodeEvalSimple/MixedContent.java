package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MixedContent {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInputs = input.split(",");
			int size = splitInputs.length;
			StringBuffer sb = new StringBuffer();
			Boolean numberOnly = true;
			Boolean wordOnly = true;

			String[] number = new String[size];
			String[] word = new String[size];
			int i = 0;
			int k=0;
			for (String splitInput : splitInputs){
				try{
					Integer.parseInt(splitInput);
					number[i] = splitInput;
					i++;
					numberOnly = false;
				}catch(NumberFormatException e){
					word[k] = splitInput;
					k++;
					wordOnly = false;
				}			
			}

			for (int j=0; j <number.length;j++){
				if(word[j]==null){
					break;
				}
				if (j==0){
					sb.append(word[j]);
				}else {
					sb.append("," + word[j]);

				}


			}

			if (numberOnly == false && wordOnly == false ){
				sb.append("|");

			}

			for (int j=0; j <number.length;j++){
				if(number[j]==null){
					break;
				}
				
				if (j==0){
					sb.append(number[j]);
				}else {
					sb.append("," + number[j]);

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
