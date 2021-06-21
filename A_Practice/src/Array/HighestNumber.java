package Array;

public class HighestNumber {

	public static void main(String[] args) {
		int maxNumber=0;
        int[]number={12,5,89,35,47};
        for(int j=0; j<5;j++)
            {

                if(maxNumber<number[j])
                    maxNumber=number[j];                
               
            }
        System.out.print(maxNumber);

	}

}
