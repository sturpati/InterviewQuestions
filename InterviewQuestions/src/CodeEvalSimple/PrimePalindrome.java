package CodeEvalSimple;

public class PrimePalindrome {

	public static void main(String [] args){
		int limit = 0;
		for(int i = 1000;i>limit;i--){
			int count = 0;
			for (int j=1;j<=i;j++ ){
				if(i%j == 0){
					count++;
				}
			}
			if(count == 2){
				//System.out.println("I am prime number" +i);
				
				//to check if palindrome
				
				String primeNumber = String.valueOf(i);
				char[] charPrime = primeNumber.toCharArray();
				int size = charPrime.length;
				StringBuffer sb = new StringBuffer();
				for (int k=size-1;k<size;k--){
					sb.append(charPrime[k]);
					if(k==0){
						break;
											}
				}
				String reverse = sb.toString();
				if (primeNumber.equalsIgnoreCase(reverse)){
					System.out.println(i);
					break;
	
				}
			}
		}
		
				
	}

}
