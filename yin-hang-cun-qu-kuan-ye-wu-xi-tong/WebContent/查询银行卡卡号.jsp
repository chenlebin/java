<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询银行卡卡号</title>
<style>
  body{ 
	 background-image:url(duomeiti/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_202011221403365.jpg);
	 background-size:cover;
	 
	 }
  .zhuce{	 
     position:relative;
	 top:100px;
	 left:300px;
	 text-align:center;
	 }
	 
</style>
</head>

<!--
  本网页仍存在的问题：
    1、账号和邮箱的触发条件不是在对话框回车则立马弹出验证信息，而是采用点击右侧验证按钮进行触发，并不符合题意。
    2、代码太长，并不精简，我还可以尝试继续使用更精简的代码完成。
-->

<script language="javascript">
var yzm2="";


function tiaozhuan()
{
	alert("即将为您跳转查询结果界面,请稍后！")//将数据库中传输过来的银行卡卡号以窗口弹出，暂时还没想好咋进行传输。
}

function yz()
{
	
    <!--得到随机验证码-->
	s=new Array("S","D","3","9","0","2","a","x","7","6","1","4","5","8","Z","K","k","F","Y","y");
	
    var yzm1="";
    for(var j=0;j<4;j++)
    {
	yzm1=s[Math.floor(Math.random()*100%20)]+yzm1;
	}
	yzm2=yzm1;
	<!--将得到的随机验证码替换到HTML中的文本里-->
	document.getElementById("huan").innerHTML=yzm1;
	
	}
	
function tj()
{
	
  var zhuce=0;	
	
  <!--验证验证码是否输入正确了-->
  var yanzheng1=document.getElementById("yanzhengma").value;
  if(yanzheng1==yzm2)
  {
	  
	  zhuce++;
  }
  else
  {
	  alert("您输入的验证码错误请重新输入！");
	  yz();
  }
  
  
  
  if(zhuce==1)
  {
	
	 tiaozhuan();
	
  }

}

</script>
<style> 
  #yzm{
	  background-color:#9FC;
	  height:20px;
	  width:70px;
	  display:inline;
	  }
  #yzm2{
	  background-color:#9FC;
	  display:inline;
	  }
  #bg{
	  background-color:#DCF2BD;
	  }

</style>

<body onLoad="yz()">
<div>
  <h1 align="center" style="color:#D64EC8">查询银行卡卡号</h1></div>
<div class="zhuce">
<form action="cc?flag=queryyhkh" method="post">

<table width="495" border="1" id="bg">
  
  
  
  
  <tr>
    <td > <a  href="用户界面.jsp"><img src="duomeiti/返回主菜单.png"></a>用户id
      <input  type="text" id="uid"  name="uid1" size="8" >
  </td>
  </tr>
  
  <tr>
    <td>验证码
      <label for="textfield3"></label>
      <input name="textfield" type="text" id="yanzhengma" size="8" > <div id="yzm"><span onClick="yz() " id="huan">陈乐斌</span></div> </td>
  </tr>


  <tr>
  
    <td style="text-align:center;"><input type="submit" name="tijiao" id="tijiao" value="查询" style="border-radius:30%;  background-color:#4DA6FF; " onClick="tj()"></td>
  </tr>
</table>
</form>
</div>
</body>
</html>
