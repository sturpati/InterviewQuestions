package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {

	public static void main(String[]args){

		for(String input : readFromFile(args[0])){
			String splitInput[] = input.split(",");
			int size = splitInput.length;
			Set<Integer> unique = new LinkedHashSet<Integer>();
			for(int i=0;i<size;i++){
				unique.add(Integer.parseInt(splitInput[i]));
			}

			String output = unique.toString().substring(1, unique.toString().length()-1);
			char[] charOutputs = output.toCharArray();
			StringBuffer sb = new StringBuffer();
			for(char charOutput : charOutputs){
				if (charOutput != ' '){
					sb.append(charOutput);
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
