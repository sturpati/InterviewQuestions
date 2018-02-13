package SortingRelatedProblems;

public class LinearSearch {
	
	public static void main (String[] args){
		int[] arrInputs = {1,2,3,4,5,6,7,8,9,10,11,12};
		int searchElement = 10;
		int position = 0;
		for(int arrInput:arrInputs){
			if(arrInput==searchElement){
				System.out.println("Index of the search element is: " +position);
			}
			position++;
		}
	}

}