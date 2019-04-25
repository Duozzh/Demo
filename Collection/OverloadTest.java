package Collection;

public class OverloadTest {
	public OverloadTest() {
		this(3);
		System.out.println("test");
	}
	public OverloadTest(int i) {
		System.out.println(++i);
	}
	public static void main(String[] args) {
		OverloadTest test = new OverloadTest();
	}

}
