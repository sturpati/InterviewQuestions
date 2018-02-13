package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataRecovery {

	public static void main (String [] args){
		for(String input : readFromFile(args[0])){
			String[] inputSplit = input.split(";");
			String[] datas = inputSplit[0].split(" ");
			String[] positions = inputSplit[1].split(" ");

			int length = datas.length;

			String [] output = new String[length];
			int i = 0;

			for (String position: positions){
				output[Integer.parseInt(position)-1] = datas[i];
				i++;
			}

			StringBuffer sb = new StringBuffer();

			for (i=0; i<length;i++){
				if (output[i] == null){
					sb.append(datas[length-1]+" ");
				}else{
					sb.append(output[i]+" ");
				}
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
