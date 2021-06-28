// パッケージ名
package gengen_programming;

// クラス名(=ファイル名と同じ名前にして、先頭は大文字にする)
public class Sample9 {
	// メインメソッドを定義する。
	public static void main(String[] args) {
		// 変数と型を定義する。
		String name = "田中太郎";
		int age = 20;
		double height = 170.6;
		introduce(name, age, height);

		// 変数の値を変更する
		name = "田中次郎";
		age = 18;
		height = 173.8;
		introduce(name, age, height);

		// 変数の値を変更する
		name = "田中三郎";
		age = 15;
		height = 162.8;
		introduce(name, age, height);
		selfIntroduce();
	}

	// 自己紹介するメソッド。(=関数,function)
	// 名前と年齢と身長を渡してね。(=引数)
	public static void introduce(String name, int age, double height) {
		System.out.println("私の名前は" + name + "です。");
		System.out.print("年齢は" + age + "歳で、");
		System.out.println("身長は" + height + "cmです。");
	}

	// 自己紹介するメソッド。(=関数,function)
	// 引数がなくても勝手に自己紹介するよ。
	public static void selfIntroduce() {
		System.out.println("私の名前は須磨寺絶男です。");
		System.out.print("年齢は20歳で、");
		System.out.println("身長は178.8cmです。");
	}
}
