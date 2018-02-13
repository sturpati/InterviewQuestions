package CodeEvalSimple;

import java.io.File;

public class FileSize {
	
	public static void main(String [] args){
		File file = new File(args[0]);
		long fileSize = file.length();
		System.out.println(fileSize);
	}

}
