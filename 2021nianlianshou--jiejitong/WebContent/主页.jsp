<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>借记通</title>
<link rel="stylesheet"
 href="css/bootstrap.min.css">
 
<script language="javascript" src="js/jquery-1.11.3.min.js"></script>

 <script  language="javascript" src="js/bootstrap.min.js"></script>
 
 <meta name="viewport" content="width=device-width,initial-scaiel=1">
 
 </head>

<body onLoad="chenlebin()">

<script language="javascript">
function chenlebin()
{
	   alert("欢迎您使用借记通APP，祝您使用愉快！");}
</script>

<div class="container">
 
 <div>
 	<div class="zpbz"><h3 style="color:#81BCE4">有借有还 &nbsp;&nbsp;&nbsp;&nbsp;再借不难 &nbsp;&nbsp;&nbsp;&nbsp;远离高利贷校园贷从我做起</h3></div>
	
     
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
      
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      
       <li><a class="navbar-brand" href="还款.jsp">还款功能</a></li>
        <li><a href="借款.jsp">借款功能</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">查询功能 <span class="caret"></span></a>
          <ul class="dropdown-menu">
          
            <li role="separator" class="divider"></li>
            <li><a href="欠款汇总.jsp">查询欠款总金额（本金）</a></li>
            
            <li role="separator" class="divider"></li>   
            <li><a href="查询单笔债务的本金和利息.jsp">查询单笔债务的本金和利息</a></li>  
                      
            <li role="separator" class="divider"></li>
            <li><a href="放债汇总.jsp">查询放债总金额（本金）</a></li>
            
          </ul>
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
  
    <h1>欢迎使用借记通APP</h1>
  <p>本软件是转为记录债务开发的软件，您可以通过本软件的债务记录系统全方位了解自己的债务或放贷详情还有多种整合功能欢迎您的使用。</p>
  
    
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
