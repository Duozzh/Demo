package HeadFirstTest;

import org.junit.Test;
import java.sql.Connection;

public class Demo {
	public void fun1() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/exam";
		String username="root";
		String password="root";
		Connection con = DriverManager¡£getConnection(url,username,password);
		System.out.println(con);
	}
	
	
}
