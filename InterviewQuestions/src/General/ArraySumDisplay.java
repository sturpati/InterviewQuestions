package General;

import java.util.Arrays;
import java.util.Collection;

public class ArraySumDisplay {

	public static void main(String[] args){
		int sum = 10;
		int[] inputArray = new int[]{1,2,3,5,6,7,8,9,5};
		
		for(int i=0; i<inputArray.length;i++){
			for (int j =i+1; j<inputArray.length;j++){
				if (inputArray[i]+inputArray[j] == sum){
					if(inputArray[i]!=inputArray[j]){
						System.out.println(String.valueOf(inputArray[j])+" + "+String.valueOf(inputArray[i]));
					}	 				
				}	 			
			}
		}
		
		Arrays.sort(inputArray);
		int i=0, j=inputArray.length-1;
		while(i<j)
		{
			
		}
	}
}
