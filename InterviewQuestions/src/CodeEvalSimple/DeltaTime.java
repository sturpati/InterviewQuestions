package CodeEvalSimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeltaTime {

	public static void main (String [] args) throws ParseException{

		for (String input : readFromFile(args[0])){
			
			String[] time = input.split(" ");
			String time1 = time[0];
			String time2 = time[1];



			String[] splitTime1 = time1.split(":");
			int time1Hrs = Integer.parseInt(splitTime1[0]);
			int time1Min = Integer.parseInt(splitTime1[1]);
			int time1Sec = Integer.parseInt(splitTime1[2]);

			String[] splitTime2 = time2.split(":");
			int time2Hrs = Integer.parseInt(splitTime2[0]);
			int time2Min = Integer.parseInt(splitTime2[1]);
			int time2Sec = Integer.parseInt(splitTime2[2]);



			int finalSec = 0;
			int finalMin = 0;
			int finalHrs = 0;

			if (time1Hrs>time2Hrs){
				if (time1Sec > time2Sec){
					finalSec = time1Sec - time2Sec;
				} else if (time1Sec < time2Sec){
					finalSec = (time1Sec+60) - time2Sec;
					time1Min = time1Min - 1;
				}else if (time1Sec == time2Sec){
					finalSec = 0;
				}

				if (time1Min > time2Min){
					finalMin = time1Min - time2Min;
				}else if (time1Min < time2Min) {
					finalMin = (time1Min+60) - time2Min;
					time1Hrs = time1Hrs-1;
				}else if (time1Min == time2Min){
					finalMin = 0;
				}

				if (time1Hrs > time2Hrs){
					finalHrs = time1Hrs - time2Hrs;
				}
			}

			if (time1Hrs < time2Hrs){
				if (time2Sec > time1Sec){
					finalSec = time2Sec - time1Sec;
				} else if (time2Sec < time1Sec){
					finalSec = (time2Sec+60) - time1Sec;
					time2Min = time2Min - 1;
				}else if (time2Sec == time1Sec){
					finalSec = 0;
				}

				if (time2Min > time1Min){
					finalMin = time2Min - time1Min;
				}else if (time2Min < time1Min) {
					finalMin = (time2Min+60) - time1Min;
					time2Hrs = time2Hrs-1;
				}else if (time2Min == time1Min){
					finalMin = 0;
				}

				if (time2Hrs > time1Hrs){
					finalHrs = time2Hrs - time1Hrs;
				}

			}

			//When hrs1 and hrs2 is equal checking for mins:
			if (time1Hrs == time2Hrs){
				if (time1Min>time2Min){
					if (time1Sec>time2Sec){
						finalSec = time1Sec-time2Sec;
					}else if (time1Sec<time2Sec){
						finalSec = (time1Sec+60)-time2Sec;
						time1Min = time1Min-1;
					}else if (time1Sec==time2Sec){
						finalSec = 0;
					}

					finalMin = time1Min-time2Min;
					finalHrs = 0;
				}

				if (time1Min < time2Min){
					if (time2Sec>time1Sec){
						finalSec = time2Sec-time1Sec;
					}else if (time2Sec<time1Sec){
						finalSec = (time2Sec+60)-time1Sec;
						time2Min = time2Min-1;
					}else if (time2Sec==time1Sec){
						finalSec = 0;
					}

					finalMin = time2Min-time1Min;
					finalHrs = 0;
				}

				if (time1Min == time2Min){
					if (time2Sec>time1Sec){
						finalSec = time2Sec-time1Sec;
					}else if (time2Sec<time1Sec){
						finalSec = time1Sec-time2Sec;
					}else if (time2Sec==time1Sec){
						finalSec = 0;
					}
				}


			}
			System.out.println (String.format("%02d",finalHrs) + ":" + String.format("%02d",finalMin) + ":" + String.format("%02d",finalSec));
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
