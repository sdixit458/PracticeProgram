package NewConcepts;

public class Overloading {
	void sum(int a) {
		System.out.println(a);
	}
	void sum(int b,int c) {
		System.out.println(b/c);
	}
	public static void main(String[] args) {
		Overloading ovr=new Overloading();
		ovr.sum(10);
		ovr.sum(10, 5);
	}

}
