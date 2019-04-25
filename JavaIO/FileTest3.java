package JavaIO;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		File file  = new File("d:/abc/xyz/hello");
		System.out.println(file.mkdirs());
		System.out.println(file.isFile());
	}
}
