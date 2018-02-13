package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrickOrTreat {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInputs = input.split(",");

			int sumCandies = 0;
			int deno = 0;
			int houses = 0;

			for (String splitInput : splitInputs){
				String [] eachInput = splitInput.split(": ");
				int totalCandies = 0;
				if (!eachInput[0].trim().equalsIgnoreCase("Houses")){
					if (eachInput[0].trim().equalsIgnoreCase("Vampires")){
						totalCandies = Integer.parseInt(eachInput[1]) * 3;
					}else if(eachInput[0].trim().equalsIgnoreCase("Zombies")){
						totalCandies = Integer.parseInt(eachInput[1]) * 4;
					}else if(eachInput[0].trim().equalsIgnoreCase("Witches")){
						totalCandies = Integer.parseInt(eachInput[1]) * 5;
					}
					deno += Integer.parseInt(eachInput[1]) ;
				} else {
					houses = Integer.parseInt(eachInput[1]);
				}
				sumCandies += totalCandies;
			}
			int candiesPerCandid = (sumCandies * houses)/deno;
			System.out.println(candiesPerCandid);
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
