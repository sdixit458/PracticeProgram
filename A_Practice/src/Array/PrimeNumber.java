package Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int[]arr={3,2,8,4,7};
		for(int index=0;index<arr.length;index++){
			int num=arr[index];
			if(num<2){
				System.out.println(num+" is not a prime number");
			}else{
				boolean prime=true;
				for(int i=2;i<num;i++){
			       if(num%i==0){
				      prime=false;
				      break;
			        }
		        }
	    if(prime){
	  	System.out.println(num+" is a PrimeNo");
	    }else {
	    	System.out.println(num+" is not primeNo");
	    }
	}
}

	}

}
