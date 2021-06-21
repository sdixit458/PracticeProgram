package Logics;

public class ReverseStringPrintOdd {
	public static void main(String[] args) {
		 String a="Abhishek";
		 char []word=a.toCharArray();
		 char[]result=new char[word.length/2];
		 int k=0;
		 for(int i=0;i<word.length;i++) {
			 if(i%2==0) {
				 result[k]=word[i];
				 k++;
			 }
			 	 
		 }
		 for(int i=result.length-1;i>=0;i--) {
			 System.out.println(" "+result[i]);
		 }
	}

}
