package JDBC;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
	private static final String dbconfig = "dbconfig.properties"/*[�����ļ�·��]*/;
	private static Properties prop = new Properties()/*[��Ӧ�����ļ�]*/;
	static {
		try {
			InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(dbconfig);
			prop.load(in);
			Class.forName(prop.getProperty("driverClassName"));
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}//[�������ļ����ݼ��ص�prop�����С���Ϊ�Ƿŵ�static������ɵļ��ز��������Լ��ز���ֻ����JdbcUtils�౻����ʱ��ɶ������ļ��ļ��ء�]

	public static Connection getConnection/*[��ȡConnection�������������Ǵ�prop�л�ȡ��]*/() {
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