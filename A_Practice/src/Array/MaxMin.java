package Array;

public class MaxMin {

	public static void main(String[] args) {
		int []num= {100,1,5,6,57};
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Max number is : "+max);
		System.out.println("Min number is : "+min);
		int out=max-min;
		System.out.println("Output of max_min is : "+out);
	}

}
