package SortingRelatedProblems;

public class BinarySearch {

	public static void main(String[]args){
		
		int[] arrayInput = {10,12,14,16,18,20,22,24,26};
		int searchElement = 24;
		int first = 0;
		int last = arrayInput.length - 1;		
		
		while(last>=first){
			int middle = (last+first)/2;
			if(arrayInput[middle]==searchElement){
				System.out.println("Index of the search element is: "+middle);
				break;
			}
			if(arrayInput[middle]>searchElement){
				last = middle-1;
			}
			if(arrayInput[middle]<searchElement){
				first=middle+1;
			}
			
		}
		
	}

}
