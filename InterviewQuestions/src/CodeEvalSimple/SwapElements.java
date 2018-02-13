package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapElements {

	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split(":");

			String[] listValues = splitInput[0].trim().split(" ");
			String[] swapPositions = splitInput[1].trim().split(",");
			StringBuffer sb = new StringBuffer();
			for (String swapPosition: swapPositions){
				String[] position = swapPosition.trim().split("-");
				String temp = listValues[Integer.parseInt(position[0])];
				listValues[Integer.parseInt(position[0])] = listValues[Integer.parseInt(position[1])];
				listValues[Integer.parseInt(position[1])] = temp;

			}

			for (String listValue : listValues){
				sb.append(listValue + " ")	;
			}
			System.out.println(sb.toString().trim());
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
