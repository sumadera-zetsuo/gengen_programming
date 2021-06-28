// パッケージ名
package gengen_programming;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample7 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 繰り返し処理(0から20までカウンタ変数を増加させながら繰り返す。)
		for (int i = 0; i <= 20; i++) {
			// 3の倍数の時はアホになる
			if (i % 3 == 0 && i != 0) {
				System.out.println("アホ！");
			} else {
				// 3の倍数以外の時は偶数か奇数かを判定する。
				if (i % 2 == 0) {
					System.out.println(i + "は偶数です。");
				} else {
					System.out.println(i + "は奇数です。");
				}
			}
		}
	}
}
