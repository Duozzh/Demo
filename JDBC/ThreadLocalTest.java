package JDBC;

public class ThreadLocalTest {
	public static void main(String[] args) {
		ThreadLocal <String> tl = new ThreadLocal<String>();
		tl.set("hello");
		String s = tl.get();
		tl.remove();
		System.out.println(s);
	}
}
