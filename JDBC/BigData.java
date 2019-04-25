package JDBC;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import cn.itcast.demo3.JdbcUtils;

/**
 * ������
 * @author cxf
 *
 */
public class Demo4 {
	/**
	 * ��mp3���浽���ݿ��С�
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void fun1() throws Exception {
		/*
		 * 1. �õ�Connection
		 * 2. ����sqlģ�壬����pstmt
		 * 3. ����sqlģ���еĲ���
		 * 4. ����pstmt��executeUpdate()ִ��
		 */
		Connection con = JdbcUtils.getConnection();
		String sql = "insert into tab_bin values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setInt(1, 1);
		pstmt.setString(2, "�������.mp3");
		/**
		 * ��Ҫ�õ�Blob
		 * 1. �����е����ļ���Ŀ����Blob
		 * 2. �Ȱ��ļ����byte[]
		 * 3. ��ʹ��byte[]����Blob
		 */
		// ���ļ�ת����byte[]
		byte[] bytes = IOUtils.toByteArray(new FileInputStream("F:/�������.mp3"));
		// ʹ��byte[]����Blob
		Blob blob = new SerialBlob(bytes);
		// ���ò���
		pstmt.setBlob(3, blob);
		
		pstmt.executeUpdate();
	}
	
	/**
	 * �����ݿ��ȡmp3
	 * @throws SQLException 
	 */
	@Test
	public void fun2() throws Exception {
		/*
		 * 1. ����Connection
		 */
		Connection con = JdbcUtils.getConnection();
		/*
		 * 2. ����select���ģ�壬����pstmt
		 */
		String sql = "select * from tab_bin";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		/*
		 * 3. pstmtִ�в�ѯ���õ�ResultSet
		 */
		ResultSet rs = pstmt.executeQuery();
		
		/*
		 * 4. ��ȡrs����Ϊdata��������
		 */
		if(rs.next()) {
			Blob blob = rs.getBlob("data");
			/*
			 * ��Blob���Ӳ���ϵ��ļ���
			 */
			/*
			 * 1. ͨ��Blob�õ�����������
			 * 2. �Լ��������������
			 * 3. ��������������д�뵽�������
			 */
			InputStream in = blob.getBinaryStream();
			OutputStream out = new FileOutputStream("c:/lgfw.mp3");
			IOUtils.copy(in, out);
		}
	}
}
