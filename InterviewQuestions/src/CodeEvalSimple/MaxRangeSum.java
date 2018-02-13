package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxRangeSum {

	public static void main (String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split(";");
			int range = Integer.parseInt(splitInput[0]);
			String[] num = splitInput[1].split(" ");
			int i=0;
			int increase = 0;
			int maxNum = 0;
			while (range <= num.length){
				int sum= 0;

				while (i<range){

					sum = Integer.parseInt(num[i])+sum;
					i++;

				}
				//System.out.println(sum);
				if (maxNum < sum){
					maxNum = sum;
				}
				increase++;
				i=increase;
				range++;
			}

			if (maxNum<0){
				System.out.println(0);

			}else{
				System.out.println(maxNum);
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
