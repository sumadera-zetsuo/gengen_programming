// パッケージ名
package gengen_programming;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample8 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 配列:同じようなジャンルのものをたくさん定義したい時に便利な変数
		String fruits[] = { "りんご", "ばなな", "みかん", "すいか", "ぶどう", "れもん" };
		// 配列内の要素の数分繰り返しを実行
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}
