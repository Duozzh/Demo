package JDBC;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import cn.itcast.demo3.JdbcUtils;

/**
 * ������
 * @author cxf
 *
 */
public class Demo5 {
	/**
	 * pstmt�����ڲ��м���
	 * 1. ��ѭ�������pstmt�����sql���������Լ���ģ�壬ʹ��һ�������ģ�巣û����ƥ���һ��sql���
	 * 2. ��������ִ������������������ݿⷢ�ͣ�
	 * @throws SQLException 
	 */
	@Test
	public void fun5() throws SQLException {
		/*
		 * pstmt��
		 * > ��Ӳ���������
		 * > ִ������
		 */
		Connection con = JdbcUtils.getConnection();
		String sql = "INSERT INTO t_stu VALUES(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// ������Ӳ���
		for(int i = 0; i < 10000; i++) {
			pstmt.setInt(1, i+1);
			pstmt.setString(2, "stu_" + i);
			pstmt.setInt(3, i);
			pstmt.setString(4, i%2==0?"��":"Ů");
			
			pstmt.addBatch();//���������һ������ͱ��浽�������ˡ�
		}
		long start = System.currentTimeMillis();
		pstmt.executeBatch();//ִ������
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);//412764, 301
	}
}
