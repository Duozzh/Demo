package JavaIO;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\io.txt");
		System.out.println(file.createNewFile());
		 
	}
}
