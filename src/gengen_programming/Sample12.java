package gengen_programming;

import java.util.Random;

public class Sample12 {

	public static void main(String[] args) {
		System.out.println("乱数は" + random_num() + "です。");
	}

	public static int random_num() {
		Random rand = new Random();
		return rand.nextInt(10);
	}

}
