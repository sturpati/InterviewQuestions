package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HiddenDigits {

	public static void main(String[] args){
		for(String input : readFromFile(args[0])){
			StringBuffer sb = new StringBuffer();
			char[] characterInput = input.toCharArray();

			for (char i : characterInput){

				if (Character.isLowerCase(i)){
					switch(i)
					{
					case 'a' :
						sb.append(0);
						break;
					case 'b' :
						sb.append(1);
						break;
					case 'c' :
						sb.append(2);;
						break;
					case 'd' :
						sb.append(3);
						break;
					case 'e' :
						sb.append(4);
						break;
					case 'f' :
						sb.append(5);
						break;
					case 'g' :
						sb.append(6);
						break;
					case 'h' :
						sb.append(7);
						break;
					case 'i' :
						sb.append(8);
						break;
					case 'j' :
						sb.append(9);
						break;
					}

				}
				if (Character.isDigit(i)){
					sb.append(i);

				}
			}
			int size = sb.toString().length();
			if (size==0){
				System.out.println("NONE");
			}else{
				System.out.println(sb.toString());
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
