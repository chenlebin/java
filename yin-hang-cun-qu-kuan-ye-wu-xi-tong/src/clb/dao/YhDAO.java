package clb.dao;

import java.util.List;

import clb.bean.XxBean;
import clb.bean.YhBean;
import clb.bean.ZcBean;
import clb.bean.YhxxBean;
import clb.dao.DBUtil;


public class YhDAO {
	//用户增加的方法（函数）
		public static int addyh( YhBean yhs)
		  {
			String sql="insert into t_yhuser (uid,uname,ulx,upwd) values(?,?,?,?)";
			Object[] params= {yhs.getUid(),yhs.getUname(),yhs.getUlx(),yhs.getUpwd()};
			 return DBUtil.update(sql, params);
			
		  }
		
	//用户信息修改的方法（函数）
	    public static void gengxin( YhBean yhs)
		{
	    	//更新用户的账户类型
	    	String sql1="update t_yhuser set ulx=? where uid=?";
			Object[] params1= {yhs.getUlx(),yhs.getUid()};
			DBUtil.update(sql1, params1);
	    	//更新用户的账户名
	    	String sql2="update t_yhuser set uname=? where uid=?";
			Object[] params2= {yhs.getUname(),yhs.getUid()};
			DBUtil.update(sql2, params2);
			//更新用户的密码
	    	String sql3="update t_yhuser set upwd=? where uid=?";
			Object[] params3= {yhs.getUpwd(),yhs.getUid()};
			DBUtil.update(sql3, params3);
		}
    //登录的方法
		public static List<YhBean> denglu(YhBean yhs)
		{
			String sql="select * from t_yhuser where uname=? and upwd=? and ulx=?";
			Object[] params= {yhs.getUname(),yhs.getUpwd(),yhs.getUlx()};
			List<YhBean> ublist= DBUtil.getList(sql, YhBean.class, params);
			return ublist;
		}
	 //用户存取款的方法
		public static void cunqukuan(ZcBean yhs)
		{
			String sql="update t_yhzc set ye=(ye+?) where kh=?";
			Object[] params= {yhs.getCqk(),yhs.getKh()};
			DBUtil.update(sql, params);

		}
		
		
	//删除用户信息的方法
		public static void delyh(int bd_id)
		{
			String sql="delete from t_yhuser where uid=?";
			Object[] params= {bd_id};
			DBUtil.update(sql, params);
			
		}
		
		

		//用户信息查询函数
		public static List<XxBean> queryyhxx(int id)
		{
			String sql="select * from t_yhuser inner join t_yhzc where t_yhuser.uid=? and t_yhzc.uid=?";
			Object[] params= {id,id};
			List<XxBean> ublist= DBUtil.getList(sql, XxBean.class, params);
			return ublist;
		}
		
		
		//用户余额查询函数
				public static List<ZcBean> queryyhye(int kh1)
				{
					String sql="select kh,ye from t_yhzc where kh=?";
					Object[] params= {kh1};
					List<ZcBean> ublist= DBUtil.getList(sql, ZcBean.class, params);
					return ublist;
				}
		//用户银行卡卡号查询函数
				public static List<ZcBean> queryyhkh(int id)
				{
					String sql="select uid,kh from t_yhzc where uid=?";
					Object[] params= {id};
					List<ZcBean> ublist= DBUtil.getList(sql, ZcBean.class, params);
					return ublist;
				}
		//查询实时银行账户总人数
				public static List<YhxxBean> yhzrs()
				{
					//实时更新银行信息表的内容
					String sql1="update t_yhxx set uidsum=(select count(uid) from t_yhuser)";
					DBUtil.update(sql1,null);
					//将更新过后的银行账户总人数信息查询之后返回给ublist
					String sql2="select uidsum from t_yhxx";
					List<YhxxBean> ublist= DBUtil.getList(sql2, YhxxBean.class,null);
					return ublist;
				}

				
		//查询实时银行总余额
				public static List<YhxxBean> yhzye()
				{
					//实时更新银行信息表的内容
					String sql1="update t_yhxx set yesum=(select sum(ye) from t_yhzc)";
					DBUtil.update(sql1,null);
					//将更新过后的银行总余额信息查询之后返回给ublist
					String sql2="select yesum from t_yhxx";
					List<YhxxBean> ublist= DBUtil.getList(sql2,YhxxBean.class,null);
					return ublist;
				}
				
				
				
		

		


}
