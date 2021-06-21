package Logics;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();		
		int rev=0; 
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
		/*
		 * StringBuffer sb=new StringBuffer(String.valueOf(a)); 
		 * StringBuffer rev=sb.reverse();
		 * System.out.println("Reverse number is : "+ rev);
		 */
		/*
		 * StringBuilder sbl=new StringBuilder(); sbl.append(a); StringBuilder
		 * rev=sbl.reverse(); System.out.println(" Number is "+rev);
		 */
	}

}
