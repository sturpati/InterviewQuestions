package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiplyLists {

	//You have 2 lists of positive integers. Write a program which multiplies corresponding elements in these lists. 
	public static void main(String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split("\\|");

			String[] toListA = splitInput[0].trim().split(" ");
			String[] toListB = splitInput[1].trim().split(" ");

			/*
			List<String> listA = new ArrayList<String>();
			for(int i= 0; i<toListA.length;i++){
				listA.add(toListA[i]);
			}

			List<String> listB = new ArrayList<String>();
			for(int j= 0; j<toListB.length;j++){
				listB.add(toListB[j]);
			}*/
			StringBuffer sb = new StringBuffer();

			for(int i = 0; i < toListA.length; i++){
				sb.append(Integer.parseInt(toListA[i])*Integer.parseInt(toListB[i])).append(" ");		
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

/* Input Data
9 0 6 | 15 14 9
5 | 8
13 4 15 1 15 5 | 1 4 15 14 8 2*/
