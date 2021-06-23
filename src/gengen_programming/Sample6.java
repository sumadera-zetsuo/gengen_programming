// パッケージ名
package gengen_programming;

import java.util.Scanner;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample6 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 定数を定義する（大文字にしておくとわかりやすい）
		final int SEIJIN = 20;
		// ユーザ入力を受け付ける準備
		Scanner scan = new Scanner(System.in);

		// ユーザ受付を取得して変数に代入
		System.out.println("まず、名前を入力してください。");
		String name = scan.nextLine();
		System.out.println("次に、年齢を入力してください。");
		int age = scan.nextInt();

		// 入力された内容を出力し、年齢の評価を行う。
		System.out.println(name + "さんの年齢は" + age + "歳です。");
		// ageが定数20より小さかったら
		if (age < SEIJIN) {
			System.out.println("あなたは未成年ですね。");
			// それ以外（つまり20以上）だったら
		} else {
			System.out.println("あなたは成人ですね。");
		}
	}
}
