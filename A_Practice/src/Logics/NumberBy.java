package Logics;
public class NumberBy {
	static int N=100;
	public static void main(String[] args) {
		for(int i=0;i<N;i++) {
			if(i%3==0 && i%5==0)
				System.out.print(i+" ");
		}
    }
}
