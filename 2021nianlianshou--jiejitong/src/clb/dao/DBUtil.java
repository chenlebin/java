package clb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {
	private static DataSource dataSource = null;

	// �ѹ��캯��˽�л�,���Է�ֹ����new�����ʵ��
	private DBUtil() {
	}

	// ��������Դ
	static {
		dataSource = new ComboPooledDataSource("mysql");  //mysql���������ļ������õ�
	}

	// ��C3P0����Դ��ȡConnection����(���ݿ����Ӷ���)
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection(); // ���ص��Ǿ�������Ķ���,��close�����Ѿ�����д
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return conn;
	}

	// �ر���Դ
	public static void close(ResultSet rs, Statement stm, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stm != null) {
			try {
				stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close(); // �����ӵķ����͹�ȥһ��,��������Դ���ص�Connection�����Ǵ������,����close����������
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// �ر���Դ
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// ���ܸ���(���Խ������,����,ɾ�����ֲ���)
	public static int update(String sql, Object... params) {
		int result = 0;
		QueryRunner qr = new QueryRunner(); // ��һ���̲߳���ȫ����
		Connection conn=getConn();
		try {
			result = qr.update(conn, sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			close(conn);
		}
		
		return result;
	}

	// �������,�������ɵ�����ID����
	public static int addWithId(String sql, Object... params) {
		int autoId = 0;
		Connection conn = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		try {
			conn = getConn();
			stm = conn.prepareStatement(sql,
					PreparedStatement.RETURN_GENERATED_KEYS);
			for (int i = 0; i < params.length; i++) {
				stm.setObject(i + 1, params[i]);
			}

			// ִ����Ӳ���
			stm.executeUpdate();

			// ȡ�����ɵ�����ID
			ResultSet rsKey = stm.getGeneratedKeys();
			rsKey.next();
			autoId = rsKey.getInt(1);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			close(rs, stm, conn);
		}
		return autoId;
	}

	// ��ѯ��һ�������Ķ���
	public static <T> T getSingleObj(String sql, Class<T> clazz,
			Object... params) {
		QueryRunner qr = new QueryRunner();
		T result = null;
		Connection conn=getConn();
		try {
			result = qr.query(conn, sql, new BeanHandler<T>(clazz),
					params);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			close(conn);
		}

		return result;
	}
	

	// ��ѯ�������б�(��ArrayList�ķ�ʽ����),ע��,���û�в�ѯ������,�÷�������һ�����б�,������null
	//����
	public static <T> List<T> getList(String sql, Class<T> clazz,
			Object... params) {
		List<T> list = new ArrayList<T>();
		QueryRunner qr = new QueryRunner();
		Connection conn =getConn();
		
		try {
			list = qr.query(conn, sql, new BeanListHandler<T>(clazz), params);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			close(conn);
		}

		return list;
	}

	// ����Map����(�÷���ֻ��һ�����ݷ���ΪMap����,keyΪ�ֶ�����,valueΪ�ֶ�ֵ)
	public static Map<String, Object> getMap(String sql, Object... params) {
		Map<String, Object> m = null;
		QueryRunner qr = new QueryRunner();
		Connection conn =getConn();
		
		try {
			m = qr.query(conn, sql, new MapHandler(), params);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			close(conn);
		}

		return m;
	}

	// ����һ��List����,����ÿ�����ݶ�����װ����һ��Map����,
	public static List<Map<String, Object>> getMapList(String sql,
			Object... params) {
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		QueryRunner qr = new QueryRunner();
		Connection conn =getConn();

		try {
			mapList = qr.query(conn, sql, new MapListHandler(),
					params);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally{
			close(conn);
		}

		return mapList;
	}

	// ���ص��е�������,�÷�������������ѯ��¼��(��ʱ��ʹ��Long�ͽ��н���),�����ֶ�ֵ������
	public static <T> T getScalar(String sql, Object... obj) {
		T result = null;
		QueryRunner qr = new QueryRunner();
		Connection conn = getConn();
		try {
			result = qr.query(conn, sql, new ScalarHandler<T>(1), obj);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			close(conn);
		}

		return result;
	}
}
