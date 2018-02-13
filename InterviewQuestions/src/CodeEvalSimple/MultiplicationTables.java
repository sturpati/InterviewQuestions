package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiplicationTables {

	//Print out the grade school multiplication table upto 12*12. 

	public static void main(String[]args){
		int table = 12;
		int times = 12;
		for (int i = 1;i<=table;i++){
			StringBuffer sb = new StringBuffer();
            boolean first = true;
			for(int j=1; j<=times; j++){
                
				int size = Integer.toString(i*j).length();
				if(first){
					first = false;
					if(size == 1){
						sb.append(" ");
					}
				} else {
					if(size == 1){
						sb.append("   ");
					}
					if(size == 2){
						sb.append("  ");
					}
					if(size == 3){
						sb.append(" ");
					}
				}
				
				sb.append(i*j);

			}
			System.out.println(sb.toString());
		}

	}

}
