package HeadFirstTest;

public class Duck {
	int size;
	public Duck() {
		size = 27;
		System.out.println(size);
	}
	public Duck(int ducksize) {
		size = ducksize;
		System.out.println(size);
	}
	public static void main(String[] args) {
		Duck duck = new Duck();

	}
}
