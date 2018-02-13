package CodeEvalSimple;

public class OddNumbers {

	//Print all odd numbers between 0 to 99.
	public static void main(String [] args){
		int range = 100;
		for(int i=0;i<range;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}
