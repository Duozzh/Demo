package JavaIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class DataStreamTest {
	public static void main(String[] args) throws Exception {
		//输出一个带参数的文件
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("d:\\test1.txt")));
		byte b = 3;
		int i = 12;
		char ch = 'a';
		float f = 3.3f;
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeChar(ch);
		dos.writeFloat(f);
		dos.close();
		//输入一个带参数的文件
		DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("d:\\test1.txt")));
		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		dis.close();
	}
}
