<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户界面</title>
<link rel="stylesheet"
 href="css/bootstrap.min.css">
 
<script language="javascript" src="js/jquery-1.11.3.min.js"></script>

 <script  language="javascript" src="js/bootstrap.min.js"></script>
 
 <meta name="viewport" content="width=device-width,initial-scaiel=1">
 
 </head>

<body onLoad="chenlebin()">

<div class="container">
 
 <div>
 	<div class="zpbz"><h3 style="color:#81BCE4">和平友善 &nbsp;&nbsp;&nbsp;&nbsp;农业社保 &nbsp;&nbsp;&nbsp;&nbsp;掌上银行</h3></div>
	
     
	<div class="cdiv"></div>
 </div>
 
    

  <br>
  
  
  <div class="row">
  
  <h3>
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="登录.jsp">登录</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
       
        <li><a href="注册.jsp">注册</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">信息管理业务 <span class="caret"></span></a>
          <ul class="dropdown-menu">
          
          <li role="separator" class="divider"></li>
            <li><a href="账户信息查询.jsp">账户信息查询</a></li>
            <li role="separator" class="divider"></li>
           
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">存取款业务<span class="caret"></span></a>
          <ul class="dropdown-menu">
          <li role="separator" class="divider"></li>
            <li><a href="查询账户余额.jsp">查询账户余额</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="存取业务.jsp">存取业务</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="查询银行卡卡号.jsp">查询银行卡卡号</a></li>
            
            
          </ul>
          <li style=" line-height:50px;vertical-align:middle "><img width="600" src="duomeiti/导航.png" style=" padding-top:10px"></li>
        </li>
        

      </ul>
      
      
      
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
  </h3>
  </div>
  
  
  <div class="jumbotron">
  <div class="container">
  
    <h1>欢迎使用银行存取款用户系统（用户端）</h1>
  <p>本系统对不同用户采取不同的权限进行使用，普通用户只能使用查询业务，和存取款业务，而管理员可以对用户信息、存取款业务进行修改，感谢您使用本系统。</p>
  
    
  </div>
</div>
  
  
   <div class="row">
   <div id="carousel-example-generic" class="carousel slide">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active" align="center">
    <a href="https://app.abchina.com/static/app/jzdjm/default.htm">
      <img src="duomeiti/yh1.jpg">
    </a>
      <div class="carousel-caption">
      </div>
    </div>
    
    <div class="item " align="center">
    <a href="http://www.abchina.com/cn/PersonalServices/SvcBulletin/202011/t20201109_1909398.htm">
       <img src="duomeiti/yh2.jpg">
    </a>
      <div class="carousel-caption">
      </div>
    </div>
    
    <div class="item " align="center">
    <a href="https://coin.abchina.com/static/mobile/index.html#/">
       <img src="duomeiti/yh3.jpg">
    </a>
      <div class="carousel-caption">
      </div>
    </div>
    
    <div class="item " align="center">
    <a href="http://www.abchina.com/cn/PersonalServices/SvcBulletin/202009/t20200901_1903156.htm">
       <img src="duomeiti/yh4.jpg">
    </a>
      <div class="carousel-caption">
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div>
  </div>
  <br><br>
   <div class="row">
     <img src="duomeiti/主页插图.png">
   
   
  </div>
  
 	
</div>

</body>
</html>
