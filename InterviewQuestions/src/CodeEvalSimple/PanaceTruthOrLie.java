package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PanaceTruthOrLie {

	public static void main(String [] args){
		for (String input : readFromFile(args[0])){
			String[] splitInput = input.split("\\|");
			String[] hexaNumbers = splitInput[0].trim().split(" ");
			String[] binaryNumbers = splitInput[1].trim().split(" ");

			double hexaSumVirus = 0;
			double binarySumAnti = 0;

			//Hexadecimal sum calculation
			for (String hexaNumber : hexaNumbers){
				double sum1 = 0.0;

				char[] charHexas = hexaNumber.toCharArray();
				int length1 = charHexas.length;
				for (char charHexa: charHexas){
					if(!Character.isAlphabetic(charHexa)){
						sum1 = Double.parseDouble(Character.toString(charHexa)) * Math.pow(16, length1-1);
					}else{
						if (charHexa=='a'){
							sum1 = 10 * Math.pow(16, length1-1);
						}else if (charHexa=='b'){
							sum1 = 11 * Math.pow(16, length1-1);
						}else if (charHexa=='c'){
							sum1 = 12 * Math.pow(16, length1-1);
						}else if (charHexa=='d'){
							sum1 = 13 * Math.pow(16, length1-1);
						}else if (charHexa=='e'){
							sum1 = 14 * Math.pow(16, length1-1);
						}else if (charHexa=='f'){
							sum1 = 15 * Math.pow(16, length1-1);
						}
					}
					length1--;
					hexaSumVirus+=sum1;	
				}
			}
			//System.out.println((long)hexaSumVirus);


			//Binary sum calculation
			for (String binaryNumber : binaryNumbers){
				double sum2 = 0;

				char[] charBinarys = binaryNumber.toCharArray();
				int length2 = charBinarys.length;

				for (char charBinary : charBinarys){

					sum2 += (Double.parseDouble(Character.toString(charBinary)) * Math.pow(2, length2-1));
					length2--;
				}
				binarySumAnti+=sum2;
			}
			//System.out.println((long)binarySumAnti);

			if (binarySumAnti>=hexaSumVirus){
				System.out.println("True");
			}else {
				System.out.println("False");

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
