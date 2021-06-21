package Logics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int org_num=num;
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res+rem*rem*rem;
			num=num/10;
		}if(res==org_num) {
			System.out.println(org_num+ " is Armstrong number");
		}else {
			System.out.println(org_num+ " is not Armstrong number");
		}
	}

}
