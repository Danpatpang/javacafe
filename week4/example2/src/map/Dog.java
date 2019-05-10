package map;

public class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

//	@Override
//	public boolean equals(Object o) {
//		return ((Dog) o).color.equals(this.color);
//	}
//
//	@Override
//	public int hashCode() {
//		return color.length();
//	}

	@Override
	public String toString() {
		return color + " dog";
	}
}
