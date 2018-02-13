	package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleSorting {

	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
		String[] splitInputs  = input.split(" ");

		List<Double> list = new ArrayList<Double>();
		for( String splitInput: splitInputs ){
			list.add(Double.parseDouble(splitInput));
		}
		Collections.sort(list);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i < list.size();i++){
			BigDecimal bd = new BigDecimal(list.get(i));
			sb.append(bd.setScale(3,BigDecimal.ROUND_HALF_UP) + " ");
			
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
