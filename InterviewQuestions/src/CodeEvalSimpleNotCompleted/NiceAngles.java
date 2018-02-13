package CodeEvalSimpleNotCompleted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NiceAngles {

	public static void main (String[] args) {
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split("\\.");
			StringBuffer sb = new StringBuffer();
			sb.append(splitInput[0] + ".");

			String afterDecimal = "0."+splitInput[1];
			double minutes= Double.parseDouble(afterDecimal)*60;
			String[] min = String.valueOf(minutes).split("\\.");
			sb.append((String.format("%02d",Integer.parseInt(min[0])))+ "'");

			String secAfterDecimal = "0."+min[1];
			double seconds = Double.parseDouble(secAfterDecimal)*60;
			String[] sec = String.valueOf(seconds).split("\\.");
			sb.append((String.format("%02d",Integer.parseInt(sec[0])))+ "\"");

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