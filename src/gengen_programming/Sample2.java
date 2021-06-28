// パッケージ名
package gengen_programming;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample2 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 変数と型を定義する。
		String name = "田中太郎";
		int age = 20;
		double height = 170.6;

		// コンソールに変数の内容を出力する。
		System.out.println("私の名前は" + name + "です。");
		System.out.print("年齢は" + age + "歳で、");
		System.out.println("身長は" + height + "cmです。");
	}
}
