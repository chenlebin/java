package clb.dao;

import java.util.List;
import clb.bean.JhkBean;
import clb.dao.DBUtil;


public class JhkDAO {
	//��
	public static int jk( JhkBean yhs)
		{
			String sql="insert into t_jhk (zz,zh,time,je,ll) values(?,?,?,?,?)";
			Object[] params= {yhs.getZz(),yhs.getZh(),yhs.getTime(),yhs.getJe(),yhs.getLl()};
			return DBUtil.update(sql, params);		
		}
	
	//������1����������ڻ����Ƿ����+��Ϣʱ��
	public static void hk1( int bd_id)
	{
		
		String sql="delete from t_jhk where id=?";
		Object[] params= {bd_id};
		DBUtil.update(sql, params);
	}

	//������2��������С��Ƿ����+��Ϣδ�ܽ�ծ����ʱ��
		public static void hk2( JhkBean yhs)
		{
			String sql="update t_jhk set je=?,time=? where id=?";
			Object[] params= {yhs.getJe(),yhs.getTime(),yhs.getId()};
			DBUtil.update(sql, params);
		}
		
    //��ѯ�Լ�Ƿ�µ�����ծ��
		public static List<JhkBean> cxsy(JhkBean yhs)
		{
			String sql="select * from t_jhk where zh=?";
			Object [] params= {yhs.getZh()};
			List<JhkBean> ublist= DBUtil.getList(sql,JhkBean.class,params);
			return ublist;
		}
		
	
	//��ѯ�Լ��ŵ�����ծ
		public static List<JhkBean> cxfz( JhkBean yhs)
		{
			String sql="select * from t_jhk where zz=?";
			Object [] params= {yhs.getZz()};
			List<JhkBean> ublist= DBUtil.getList(sql,JhkBean.class,params);
			return ublist;
		}
		
	//��ѯ����ծ��ı������Ϣ
		public static int cxdb( int yhs)
		{
			String sql="select bjlx from t_jhk where id=?";
			Object [] params= {yhs};
			int i=DBUtil.getScalar(sql, params);
			return i;
		}
		
		//��ѯ����ծ��ı������Ϣ
		public static List<JhkBean> cxdb1( int yhs)
		{
			String sql="select bjlx from t_jhk where id=?";
			Object [] params= {yhs};
			List<JhkBean> ublist= DBUtil.getList(sql,JhkBean.class,params);
			return ublist;
			
		}
    

}
