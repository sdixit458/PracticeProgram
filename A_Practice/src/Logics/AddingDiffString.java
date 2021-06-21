package Logics;

public class AddingDiffString {

	public static void main(String[] args) {
		String str1="abc";
		String str2="xyz";
		String newStr="";
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				newStr=newStr+str1.charAt(i)+str2.charAt(i);
			}
		}
		System.out.println(newStr);//axbycz
	}
}