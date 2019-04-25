package JavaIO;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:\\out.txt",true);
		String str = "hello world ";
		byte[] buffer = str.getBytes();
		os.write(buffer);
		os.close();
	}
}
 