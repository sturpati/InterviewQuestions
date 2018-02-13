package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AgeDistribution {
	
	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
			int age = Integer.parseInt(input);
			if (age < 0 || age >100){
				System.out.println("This program is for humans");
			}else if (age>=0 && age <=2){
				System.out.println("Still in Mama's arms");
			}else if (age==3 || age==4){
				System.out.println("Preschool Maniac");
			}else if (age>=5 && age <=11){
				System.out.println("Elementary school");
			}else if (age>=12 && age <=14){
				System.out.println("Middle school");
			}else if (age>=15 && age <=18){
				System.out.println("High school");
			}else if (age>=19 && age <=22){
				System.out.println("College");
			}else if (age>=23 && age <=65){
				System.out.println("Working for the man");
			}else if (age>=66 && age <=100){
				System.out.println("The Golden Years");
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
