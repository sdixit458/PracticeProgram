package Logics;

public class specialchar {

	public static void main(String[] args) {
		String word="ja!@#$va";
		String newword=word.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newword);

	}

}
