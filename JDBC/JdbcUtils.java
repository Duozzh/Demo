package JDBC;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
	private static final String dbconfig = "dbconfig.properties"/*[配置文件路径]*/;
	private static Properties prop = new Properties()/*[对应配置文件]*/;
	static {
		try {
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(dbconfig);
			prop.load(in);
			Class.forName(prop.getProperty("driverClassName"));
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}//[把配置文件内容加载到prop对象中。因为是放到static块中完成的加载操作，所以加载操作只会在JdbcUtils类被加载时完成对配置文件的加载。]

	public static Connection getConnection/*[获取Connection方法，参数都是从prop中获取。]*/() {
		try {
			return DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("username"), prop.getProperty("password"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}		
/*
dbconfig.properties
driverClassName=com.mysql.jdbc.Driver
url=jdbc:mysql://localhost:3306/mydb1?useUnicode=true&characterEncoding=UTF8
username=root
password=123
*/