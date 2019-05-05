package collection.list;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(500));

		Coin tempCoin = coinBox.peek();
		System.out.println(tempCoin.getValue());

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue());
		}

//		tempCoin = coinBox.peek();
//		System.out.println(tempCoin.getValue());
	}
}

class Coin {
	private int value;

	Coin(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}
}
