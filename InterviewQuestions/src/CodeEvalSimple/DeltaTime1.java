package CodeEvalSimple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeltaTime1 {
	
	public static void main(String[] args){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		try {
			String input = "00:00:42 00:00:44";
			long t1 = sdf.parse(input.split(" ")[0]).getTime();
			long t2 = sdf.parse(input.split(" ")[1]).getTime();
			
			System.out.println(Math.abs(t2 -t1));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

}
