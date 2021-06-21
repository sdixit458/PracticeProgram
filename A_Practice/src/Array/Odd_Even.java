package Array;

public class Odd_Even {

	public static void main(String[] args) {
		int[]arr={3,2,8,4,7};
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.println(arr[i]+" is even number");
			}else{
				System.out.println(arr[i]+" is odd number");
			}
		}
	}

}
