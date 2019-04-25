package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo {
	/*
	 * �������ݿ⣬�õ�Connection����ɹ���
	 * �����ݿ�������ɾ����
	 */
	//@Test
	public void fun1() throws ClassNotFoundException, SQLException {
		/*
		 * һ���õ�Connection
		 * 1. ׼���Ĵ����
		 * 2. ����������
		 * 3. �õ�Connection
		 */
		// ׼���Ĵ����
		String driverClassName = "com.mysql.jdbc.Driver";
		// jdbcЭ��ĸ�ʽ��jdbc:���̵�����:��Э�飨�ɹ����Լ����涨��
		// ��mysql���ԣ�������Э��ṹ��//����:�˿ں�/���ݿ�����
		String url = "jdbc:mysql://localhost:3306/mydb3";
		String username = "root";
		String password = "123";
		
		// ����������
		Class.forName(driverClassName);
		// ʹ��DriverManager���Լ�ʡ�µ�3���������õ�Connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		/*
		 * ���������ݿ�������ɾ����
		 * 1. ͨ��Connection���󴴽�Statement
		 * > Statement���ķ����������Ĺ��ܾ��������ݿⷢ��sql��䣡
		 * 2. ��������int executeUpdate(String sql)�������Է���DML��DDL
		 */
		// 1. ͨ��Connection�õ�Statement����
		Statement stmt = con.createStatement();
		// 2. ʹ��Statement����sql��䣡
//		String sql = "INSERT INTO stu VALUES('ITCAST_0003', 'wangWu', 88, 'male')";
//		String sql = "UPDATE stu SET name='zhaoLiu', age=22, " +
//				"gender='female' WHERE number='ITCAST_0003'";
		String sql = "DELETE FROM stu";
		int r = stmt.executeUpdate(sql);
		System.out.println(r);
	}
	
	/**
	 * ִ�в�ѯ
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	//@Test
	public void fun2() throws ClassNotFoundException, SQLException {
		/*
		 * һ���õ�Connection
		 * �����õ�Statement������select���
		 * �����Բ�ѯ���صġ���񡱽��н�����
		 */
		/*
		 * һ���õ�����
		 * 1. ׼���Ĵ����Ӳ���
		 */
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/exam";
		String username = "root";
		String password = "123";
		
		/*
		 * 2. ����������
		 */
		Class.forName(driverClassName);
		/*
		 * 3. ͨ��ʡ�µ�������������DriverManger��getConnection()���õ�����
		 */
		Connection con = DriverManager.getConnection(url, username, password);
		
		/*
		 * �����õ�Statement��ִ��select���
		 * 1. �õ�Statement����Connection��createStatement()����
		 */
		Statement stmt = con.createStatement();
		/*
		 * 2. ����Statement��ResultSet rs = executeQuery(String querySql)
		 */
		ResultSet rs = stmt.executeQuery("select * from emp");
		
		/*
		 * ��������ResultSet
		 * 1. ���й���ƶ�����һ�У����Ե���next()������ɣ�
		 */
		while(rs.next()) {//�ѹ�������ƶ�һ�У����ж���һ���Ƿ���ڣ�
			int empno = rs.getInt(1);//ͨ���б������ȡ���е�ֵ��
			String ename = rs.getString("ename");//ͨ������������ȡ���е�ֵ
			double sal = rs.getDouble("sal");
			
			System.out.println(empno +  ", " + ename + ", " + sal);
		}
		
		/*
		 * �ġ��ر���Դ
		 * ����
		 */
		rs.close();
		stmt.close();
		con.close();//�������������Ҫ�أ����ؾ�����
	}
	
	// �淶��
	@Test
	public void fun3() throws Exception {
		Connection con = null;//��������
		Statement stmt = null;
		ResultSet rs = null;
		try {
			/*
			 * һ���õ�����
			 */
			String driverClassName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/exam";
			String username = "root";
			String password = "123";
			
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, username, password);//ʵ����
			
			/*
			 * ��������Statement
			 */
			stmt = con.createStatement();
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);
			
			rs.last();//�ѹ���ƶ������һ��
System.out.println(rs.getRow());
			rs.beforeFirst();
			
			/*
			 * ����ѭ������rs����ӡ��������
			 * 
			 * getString()��getObject()��ͨ�õģ�
			 */
//			while(rs.next()) {
//				System.out.println(rs.getObject(1) + ", " 
//						+ rs.getString("ename") + ", " + rs.getDouble("sal"));
//			}
			
			int count = rs.getMetaData().getColumnCount();
			while(rs.next()) {//������
				for(int i = 1; i <= count; i++) {//������
					System.out.print(rs.getString(i));
					if(i < count) {
						System.out.print(", ");
					}
				}
				System.out.println();
			}
			
		} catch(Exception e) {
			throw new RuntimeException(e);
		} finally {
			// �ر�
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
		
	}
}
