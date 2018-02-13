package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntersection {

	public static void main (String[]args){
		for (String input : readFromFile (args[0])){
			String[] splitInput = input.split(";");

			String[] toSetA = splitInput[0].split(",");
			Set<String> setA = new HashSet<String>();
			for(int i=0;i<toSetA.length;i++){
				setA.add(toSetA[i]);
			}
			//Set<String> intersection = new HashSet<String>();
			String[] tointersection = splitInput[1].split(",");
			StringBuffer sb = new StringBuffer();
			for(int j=0;j<tointersection.length;j++){
				if(setA.contains(tointersection[j])){
					sb.append(tointersection[j]);		
					sb.append(",");
					}
			}
			if(sb.length()==0){
				System.out.println(" ");
			}else{
				System.out.println(sb.toString().substring(0, sb.length()-1));
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
