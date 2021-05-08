package clb.servlet;

import java.io.*;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clb.bean.JhkBean;
import clb.dao.JhkDAO;


/**
 * Servlet implementation class JhkServlet
 */
@WebServlet("/JhkServlet")
public class JhkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JhkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ձ�־λ
		String s_flag=request.getParameter("flag");
		String s_flag2=request.getParameter("flag2");
		
//��jk(request,response)
		if(s_flag.equals("jk"))
		{
			//�����û�
			this.jk(request, response);
			//ҳ����ת
			 request.getRequestDispatcher("/��ҳ.jsp").forward(request, response);
		}
		
//���hk(request,response)
		if(s_flag.equals("hk"))
		{
			//�����û�
			this.hk(request, response);
			//ҳ����ת
			request.getRequestDispatcher("/��ҳ.jsp").forward(request, response);
		}

//Ƿ����ܣ�queryzh(request,response)
		if(s_flag.equals("queryzh"))
		{
			this.queryzh(request, response);

		}
		
//��ծ���ܣ�queryzz(request,response)
		if(s_flag.equals("queryzz"))
		{
			this.queryzz(request, response);

		}
		
	}

	
	public static void jk(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		
		
		
		String u_zz=request.getParameter("zz");
		String u_zh=request.getParameter("zh");
		String u_time=request.getParameter("time");
		String u_je=request.getParameter("je");
		String u_ll=request.getParameter("ll");
		
		
		//��������Ĵ���������������
		String u_zz1=new String( u_zz.getBytes("iso-8859-1"),"utf-8");
		String u_zh1=new String( u_zh.getBytes("iso-8859-1"),"utf-8");
		float u_time1=Float.parseFloat(u_time);
		int u_je1=Integer.parseInt(u_je);
		float u_ll1=Float.parseFloat(u_ll);


		//dopost����  request.setCharacterEncoding("utf-8");
		
	    
	    JhkBean yhs=new JhkBean();
	    yhs.setZz(u_zz1);
	    yhs.setZh(u_zh1);
	    yhs.setTime(u_time1);
	    yhs.setJe(u_je1);
	    yhs.setLl(u_ll1);

	    int i=JhkDAO.jk(yhs);
//	    ���i=1�����ɹ�����ʧ�ܡ�
	    if(i==1)
	    {
	    	request.setAttribute("mag","��ϲ,�����Ϣ¼��ɹ���");
	    }
	    else
	    {
	    	request.setAttribute("mag","���ź�,�����Ϣ¼��ʧ�ܣ�");
	    	
	    }
	    ServletRequest arg0;
	    
	    
	}
	
	
	
	public static void hk(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		
		
		
		String u_id=request.getParameter("id1");
		String u_je=request.getParameter("je1");
		String u_time=request.getParameter("time1");

		
	
		int u_id1=Integer.parseInt(u_id);
		int u_je1=Integer.parseInt(u_je);
		float u_time1=Float.parseFloat(u_time);
		

		//dopost����  request.setCharacterEncoding("utf-8");
		
		
	    
	    int i=JhkDAO.cxdb(u_id1);
        System.out.println(i);
//	    ���i=1�����ɹ�����ʧ�ܡ�
	    if(u_je1>=i)
	    {
	    	JhkDAO.hk1(u_id1);    
	    }
	    else
	    {
	    	
	    	JhkBean yhs=new JhkBean();
		    yhs.setTime(u_time1);
		    int k=0;
		    k=i-u_je1;
		    yhs.setJe(k);
		    System.out.println(k);
		    yhs.setId(u_id1);
	    	JhkDAO.hk2(yhs);    	
	    }

	    
	    
	}
	
	

	public static void queryzh(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		
		String u_zh=request.getParameter("zh");
		String u_zh1=new String( u_zh.getBytes("iso-8859-1"),"utf-8");
		
	    JhkBean yhs=new JhkBean();
	    System.out.println(u_zh1);
	    yhs.setZh(u_zh1);
	    System.out.println(yhs.getZh());
		
  
	    List<JhkBean> dblist=JhkDAO.cxsy(yhs);
		//��װ����
		request.setAttribute("dbdata",dblist);
	    //ҳ����ת
	    request.getRequestDispatcher("/Ƿ����ܽ��.jsp").forward(request, response);

	    
	    
	}
	
	public static void queryzz(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		
		String u_zz=request.getParameter("zz");
		String u_zz1=new String( u_zz.getBytes("iso-8859-1"),"utf-8");
		
	    JhkBean yhs=new JhkBean();
	    System.out.println(u_zz1);
	    yhs.setZz(u_zz1);
	    System.out.println(yhs.getZz());
		
  
	    List<JhkBean> dblist=JhkDAO.cxfz(yhs);
		//��װ����
		request.setAttribute("dbdata",dblist);
	    //ҳ����ת
	    request.getRequestDispatcher("/��ծ���ܽ����.jsp").forward(request, response);
	    
	}
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
