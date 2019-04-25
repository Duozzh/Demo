package Network;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection1 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.runoob.com/mysql/mysql-tutorial.html");
		URLConnection conn = url.openConnection();
		InputStream is = conn.getInputStream();
		//下面这行代码也能实现。
		//InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("d:\\info.html");
		byte[] buffer = new byte[2048];
		int length = 0;
		while(-1 != (length = is.read(buffer,0,buffer.length))) {
			os.write(buffer,0,length);
			
		}
		is.close();
		os.close();
		
	}
}
