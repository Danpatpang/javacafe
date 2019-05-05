package collections;

public class Wallet implements Comparable<Wallet> {
	public int coin;
	public String wallet;

	Wallet(int coin, String wallet) {
		this.coin = coin;
		this.wallet = wallet;
	}

	@Override
	public int compareTo(Wallet o) {
		if(this.coin > o.coin) {
			return 1;
		} else if (this.coin == o.coin) {
			return 0;
		} else {
			return -1;
		}
	}
}