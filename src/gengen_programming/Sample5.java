// パッケージ名
package gengen_programming;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample5 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 変数と型を定義する。
		String name = "田中太郎";
		int age = 20;
		double height = 170.6;
		double weight = 62.4;
		double bmi; // 変数定義のタイミングで値を代入していなくてもOK

		// コンソールに変数の内容を出力する。
		System.out.println("私の名前は" + name + "です。");
		System.out.print("年齢は" + age + "歳で、");
		System.out.println("身長は" + height + "cm、体重は" + weight + "kgです。");

		// BMIを算出し、出力する。
		bmi = Math.round(weight / (height / 100) / (height / 100));
		System.out.print("BMIは" + bmi + "です。");

		if (bmi < 18.5) {
			System.out.print("痩せ気味ですね。");
		} else if (bmi < 25.0) {
			System.out.print("標準体型ですね。");
		} else {
			System.out.print("肥満気味ですね。");
		}
	}
}
