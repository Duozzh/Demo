package JavaIO;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/abc/xyz");
		File file2 = new File(file,"hello.txt");
		file2.createNewFile();
	}
}


