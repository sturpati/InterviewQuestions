package CodeEvalSimple;

import java.util.HashSet;
import java.util.Set;

public class SumOfPrimes {

	//Sum of first 1000 prime numbers

	/*NOTES: 0 and 1 are not prime numbers so start from 2 */

	public static void main(String [] args){
		int range = 0; long sum = 0l;
		int i=1;

		while (range <= 1000){
			int count = 0;
			i++;

			for (int j=1;j<=i;j++){

				if ((i%j)==0){
					count++;
				}

			}
			if (count== 2){
				range++;
				sum +=i;
				if(range==1000){
					break;
				}

			}

		}
		System.out.println(sum);

	}

}

