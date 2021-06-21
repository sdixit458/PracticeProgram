package Logics;

public class StringClass {
	public static void main(String[] args) { 
		String name="Java is a programming language";
		String rev ="";
		int len=name.length();
		 for(int i=len-1;i>=0;i--) { 
			 rev=rev+name.charAt(i);
		}
		 System.out.println("New string is : "+rev);
	}

}
