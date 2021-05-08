<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ tagliburi="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>欠款汇总结果</title>
<style>
td{ 
border:solid 4px}

table{
   width:400px;
}

table tr{
  height:60px;
}


table tr td{
   /*border:1px solid red;*/
}


table tr:nth-child(odd){

 background-color:#ABFAF5;
  }
  
table tr:nth-child(even){
  background-color:#D8D8D8;
}
	  
	body{
	  
	 background-image:url(duomeiti/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_202011281514041.jpg);
	 background-size:cover;}
	 
	 .juzhong{
display:flex;
justify-content:center;
align-items:center;
 position:relative;
	 top:100px;
	 text-align:center;
}

.fanhui{ 
display:flex;
justify-content:center;
align-items:center;
position:relative;
	 top:180px;
}

}
</style>
</head>
<body>


<h1 align="center" style="color:#BBE6EC">欠款汇总结果</h1>
<div class="juzhong" >
<table>

<tr>
  <td>id</td>
  <td>债主</td>
  <td>债户</td>
  <td>借款时间</td>
  <td>本金</td>
  <td>利率</td>
  <td>本金利息</td>
</tr>



<c:forEach items="${dbdata}" var="bd">
   <tr>
     <td>${bd.id}</td>
     <td>${bd.zz}</td>
     <td>${bd.zh}</td>
     <td>${bd.time}</td>
     <td>${bd.je}</td>
     <td>${bd.ll}</td>
     <td>${bd.bjlx}</td>
   </tr>
</c:forEach>
</table>
</div>

<div class="fanhui">
<form>
<a href="主页.jsp">
<input type="button"  value="返回主页" style="  height:40px; width:120px;align:center; border-radius:30%; background-color:#97FDDC; ">
</a>
</form>
</div>

</body>
</html>