package gengen_programming;

public class Sample11 {

	public static void main(String[] args) {
		// 変数と型を定義する。
		int num1 = 4;
		int num2 = 7;
		int sum = add(num1, num2);
		System.out.println("合計は" + sum + "です。");
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
