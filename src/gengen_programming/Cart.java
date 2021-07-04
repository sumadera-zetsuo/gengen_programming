package gengen_programming;

public class Cart {
	String name;
	int price;
	int speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void speedUp() {
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
	}

}
