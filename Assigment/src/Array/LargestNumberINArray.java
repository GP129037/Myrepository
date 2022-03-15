package Array;

public class LargestNumberINArray {

	public static void main(String[] args) {
		int [] arr={0,1,2,3,4,5,8,6,9};
		
		int M=0;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>M)
				M=arr[i];
			
		
		}
		System.out.println("Largest Number in Given array is :- " +M);
		
	}
	


}
