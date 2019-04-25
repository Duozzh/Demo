package JavaIO;

import java.io.File;
import java.io.IOException;

public class FileTest5 {
	public static void main(String[] args) throws IOException {
		 File file = new File("d:\\abc\\xyz\\hello\\123.txt");
		// file.createNewFile();
		 file.delete();
	}
}
