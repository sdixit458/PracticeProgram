package Array;

import java.util.Arrays;

public class DuplicateNumber {
	
	static int DuplicateRemover(int arr[],int n) {
		if(n==0 || n==1) {
			return n;
		}
		int[] temp = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		//Changing original array
		for(int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}


	public static void main(String[] args) {
		
		
	//write a java code to remove duplicates in an array 
		int arr[] = {9,5,5,5,6,7,4,8,4,4};
		Arrays.sort(arr);
		int len = arr.length;
		
		len = DuplicateRemover(arr, len);
		
		//printing array elements		
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}

