package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args){
		for (String input : readFromFile(args[0])){
			long limit= 2;
			long x =0;
			long y =1;
			long z = 0;
			
			if (Long.parseLong(input)==1){
				z=1;
			}
			while( limit<=Long.parseLong(input)){

				z = x + y; 
				x = y;
				y = z;
				limit++;
				
			}
			System.out.println(z);
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
