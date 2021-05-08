package clb.dao;

import java.util.List;

import clb.bean.XxBean;
import clb.bean.YhBean;
import clb.bean.ZcBean;
import clb.bean.YhxxBean;
import clb.dao.DBUtil;


public class YhDAO {
	//�û����ӵķ�����������
		public static int addyh( YhBean yhs)
		  {
			String sql="insert into t_yhuser (uid,uname,ulx,upwd) values(?,?,?,?)";
			Object[] params= {yhs.getUid(),yhs.getUname(),yhs.getUlx(),yhs.getUpwd()};
			 return DBUtil.update(sql, params);
			
		  }
		
	//�û���Ϣ�޸ĵķ�����������
	    public static void gengxin( YhBean yhs)
		{
	    	//�����û����˻�����
	    	String sql1="update t_yhuser set ulx=? where uid=?";
			Object[] params1= {yhs.getUlx(),yhs.getUid()};
			DBUtil.update(sql1, params1);
	    	//�����û����˻���
	    	String sql2="update t_yhuser set uname=? where uid=?";
			Object[] params2= {yhs.getUname(),yhs.getUid()};
			DBUtil.update(sql2, params2);
			//�����û�������
	    	String sql3="update t_yhuser set upwd=? where uid=?";
			Object[] params3= {yhs.getUpwd(),yhs.getUid()};
			DBUtil.update(sql3, params3);
		}
    //��¼�ķ���
		public static List<YhBean> denglu(YhBean yhs)
		{
			String sql="select * from t_yhuser where uname=? and upwd=? and ulx=?";
			Object[] params= {yhs.getUname(),yhs.getUpwd(),yhs.getUlx()};
			List<YhBean> ublist= DBUtil.getList(sql, YhBean.class, params);
			return ublist;
		}
	 //�û���ȡ��ķ���
		public static void cunqukuan(ZcBean yhs)
		{
			String sql="update t_yhzc set ye=(ye+?) where kh=?";
			Object[] params= {yhs.getCqk(),yhs.getKh()};
			DBUtil.update(sql, params);

		}
		
		
	//ɾ���û���Ϣ�ķ���
		public static void delyh(int bd_id)
		{
			String sql="delete from t_yhuser where uid=?";
			Object[] params= {bd_id};
			DBUtil.update(sql, params);
			
		}
		
		

		//�û���Ϣ��ѯ����
		public static List<XxBean> queryyhxx(int id)
		{
			String sql="select * from t_yhuser inner join t_yhzc where t_yhuser.uid=? and t_yhzc.uid=?";
			Object[] params= {id,id};
			List<XxBean> ublist= DBUtil.getList(sql, XxBean.class, params);
			return ublist;
		}
		
		
		//�û�����ѯ����
				public static List<ZcBean> queryyhye(int kh1)
				{
					String sql="select kh,ye from t_yhzc where kh=?";
					Object[] params= {kh1};
					List<ZcBean> ublist= DBUtil.getList(sql, ZcBean.class, params);
					return ublist;
				}
		//�û����п����Ų�ѯ����
				public static List<ZcBean> queryyhkh(int id)
				{
					String sql="select uid,kh from t_yhzc where uid=?";
					Object[] params= {id};
					List<ZcBean> ublist= DBUtil.getList(sql, ZcBean.class, params);
					return ublist;
				}
		//��ѯʵʱ�����˻�������
				public static List<YhxxBean> yhzrs()
				{
					//ʵʱ����������Ϣ�������
					String sql1="update t_yhxx set uidsum=(select count(uid) from t_yhuser)";
					DBUtil.update(sql1,null);
					//�����¹���������˻���������Ϣ��ѯ֮�󷵻ظ�ublist
					String sql2="select uidsum from t_yhxx";
					List<YhxxBean> ublist= DBUtil.getList(sql2, YhxxBean.class,null);
					return ublist;
				}

				
		//��ѯʵʱ���������
				public static List<YhxxBean> yhzye()
				{
					//ʵʱ����������Ϣ�������
					String sql1="update t_yhxx set yesum=(select sum(ye) from t_yhzc)";
					DBUtil.update(sql1,null);
					//�����¹���������������Ϣ��ѯ֮�󷵻ظ�ublist
					String sql2="select yesum from t_yhxx";
					List<YhxxBean> ublist= DBUtil.getList(sql2,YhxxBean.class,null);
					return ublist;
				}
				
				
				
		

		


}
