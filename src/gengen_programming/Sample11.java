package gengen_programming;

public class Sample11 {

	public static void main(String[] args) {
		// 変数と型を定義する。
		int num1 = 4;
		int num2 = 7;
		int sum1 = add(num1, num2);
		System.out.println("合計は" + sum1 + "です。");
		int dif = min(num1, num2);
		System.out.println("合計は" + dif + "です。");
	}

	// 数値を2つ受け取るとその値を足した値が返ってくる 
	public static int add(int num1, int num2) { // int num1,num2引数
		return num1 + num2; // 戻り値
	}

	// 数値を2つ受け取るとその値を引いた値が返ってくる 
	public static int min(int num1, int num2) { // int num1,num2引数
		return num1 - num2; // 戻り値
	}

}
