package General;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MissingNumberInTwoArraysUsingList {

	public static void main(String[] args){
		
		//radom.
		Integer[] a = new Integer[]{1,2,3,3,4};

		Integer[] b = new Integer[]{1,2,3,3};
		List<Integer> listA = new LinkedList<Integer>(Arrays.asList(a));
		List<Integer> listB = new LinkedList<Integer>(Arrays.asList(b));	
		Boolean missingNumber = false;

		for(int i=0; i<listA.size(); i++){
			if(i==(listA.size()-1) && missingNumber==false){
				System.out.println("missing number:" + listA.get(i));
			}
			for(int j=0; j<listB.size();j++){
				if(listA.get(i)==listB.get(j)){
					listB.remove(j);
					break;
				}else{
					System.out.println("missing number:" + listA.get(i));
					missingNumber=true;
				}
			}
			if (missingNumber==true){
				break;
			}
		}

	}

}
