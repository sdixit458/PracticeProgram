package Array;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[]arr={3,2,8,4,7};
	     int max=arr[0];
	     int secMax=0;
	        for(int i=1; i<arr.length;i++){
	               if(arr[i]>max){
	                    secMax=max;
	                    max=arr[i];                
	                }else{
	                  secMax=arr[i];
	                }
	               
	            }
	        System.out.println(max+ " is a  Highest Number");
	        System.out.println(secMax+" is secound Highest Number");

	}

}
