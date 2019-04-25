package JavaIO;

import java.io.File;

public class FileTest6 {
	public static void main(String[] args) {
		File file = new File("d:\\adc\\xyz\\hello");
		String[] names = file.list();
		for(String name : names) {
			if(name.endsWith(".txt")) {
				System.out.println(name);
			}
		}
	}
}
 