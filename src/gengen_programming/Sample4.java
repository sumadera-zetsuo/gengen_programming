// パッケージ名
package gengen_programming;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample4 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 変数と型を定義する。
		String name = "田中太郎";
		int age = 20;

		// コンソールに変数の内容を出力する。
		System.out.println("私の名前は" + name + "です。");
		System.out.print("年齢は" + age + "歳で、");

		// 変数の内容を修正する。
		age = age + 5; // 現在の年齢に5を加えた値で上書きする。
		age += 5; // 上の内容はこのように省略して書くこともできる。
		age++; // ＋1するときはこのように省略して書くこともできる。

		// コンソールに変数の内容を出力する。
		System.out.print("11年後は" + age + "歳になります。");
	}
}
