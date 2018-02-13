package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TimeToEat {

	public static void main (String[] args){
		for (String input : readFromFile(args[0])){
			String[] splitInputs = input.split(" ");

			StringBuffer sb = new StringBuffer();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Map <Integer,String> orderMap = new TreeMap <Integer,String>();
			//List<Integer> order = new ArrayList<Integer>();
			for (String splitInput: splitInputs){
				try {
					long t = sdf.parse(splitInput).getTime();
					//order.add((int)t);
					orderMap.put((int)t, splitInput);
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
			//Collections.sort(order);

			for (Entry<Integer,String> entry : orderMap.entrySet()){
				sb.append(entry.getValue()+ " ");
			}

			
			String[] reverseOrder = sb.toString().split(" ");
			StringBuffer sbNew = new StringBuffer();
			int size = reverseOrder.length;
			for (int i=size; i>0;i--){
				sbNew.append(reverseOrder[i-1] + " ");
			}
			System.out.println(sbNew.toString());
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
