package General;

public class MissingNumberInArray {

	public static void main(String[] args){
		int[] a = new int[]{1,2,3,3,4};

		int[] b = new int[]{1,2,3,4};


		for(int i=0,j=0; i<a.length && j<b.length;){

			if(a[i] == b[j]) 
			{ 
				i++; 
				j++;
			}
			else {
				int missing = 0;
				if(a[i]<b[j])
				{
					missing = a[i];
					i++;
				}
				else
				{
					missing = b[j];
					j++;
				}
				System.out.println(missing);
			}
		}


	}

}
