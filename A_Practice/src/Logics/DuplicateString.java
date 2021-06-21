package Logics;

public class DuplicateString {

	public static void main(String[] args) {
		String name="Qspider_Jspider";
		char a[]=name.toCharArray();
		int len=a.length;
		int count;
		for(int i=0; i<=len;i++) {
			count=1;
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='0';
				}
			}
			if(count>1 &&a[i]!='0') {
				System.out.println(" Duplicate char is : "+a[i]+" and his count is :"+count);
			}
		}
	}

}
