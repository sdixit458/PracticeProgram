package Logics;

public class PalimdromeNumber {
	public static void main(String[] args) {
		int num=121121;
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num +" is a palindrome number");
		}else {
			System.out.println(org_num +" is not a palindrome number");
		}
		
	}

}
