package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RoadTrip {
	
	public static void main(String [] args){
		for (String input : readFromFile(args[0])){
		String[] splitInputs = input.split(";");
		List<Integer> distanceList = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer();
		for (String splitInput : splitInputs){
			String distances = splitInput.trim().split(",")[1];
			distanceList.add(Integer.parseInt(distances));
		}
		
		Collections.sort(distanceList);
		sb.append(distanceList.get(0) + ",");
		for (int i = 0; i < distanceList.size()-1;i++){
			sb.append(distanceList.get(i+1) - distanceList.get(i) + ",");
		}
		
		System.out.println(sb.toString().substring(0, sb.length()-1));
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
