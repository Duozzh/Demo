package JavaIO;

import java.io.File;

public class FileTest4 {
	public static void main(String[] args) {
		File file = new File("d:/abc/xyz");
//		String[] names = file.list();
//		for(String name:names) {
//			System.out.println(name);
//		}
		File[] files = file.listFiles();
		for(File f:files) {
			System.out.println(f.getName());
		}
	}
}
