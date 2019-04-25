package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("d:\\hello.txt");
		byte[] buffer = new byte[200];
		int length = 0;
		while(-1 !=(length = is.read(buffer,0,200))) {
			String str = new String(buffer,0,length);
			System.out.println(str);
		}
		is.close();
	}
}
