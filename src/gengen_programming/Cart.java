package gengen_programming;

public class Cart {
	//フィールド
	public String name;
	public int price;
	public int speed;
	
	//アクセサー
	//ゲッター
	public String getName() {
		return name;
	}
	//セッター
	public void setName(String name) {
		this.name = name;
	}
	//ゲッター
	public int getPrice() {
		return price;
	}
	//セッター
	public void setPrice(int price) {
		this.price = price;
	}
	//ゲッター
	public int getSpeed() {
		return speed;
	}
	//セッター
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//メソッド
	public void () {
		speed += 10;
	}
	//メソッド
	public void break_() {
		speed -= 10;
	}
	
}
