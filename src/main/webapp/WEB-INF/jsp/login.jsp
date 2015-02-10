<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/assets/bootstrap/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/static/assets/bootstrap/css/bootstrap-theme.min.css">


<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/common.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="<%=request.getContextPath()%>/static/assets/jquery-2.1.3.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="<%=request.getContextPath()%>/static/assets/bootstrap/js/bootstrap.min.js"></script>

<title>DemoCMS Login Page</title>

</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">DEMOCMS</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="<%=request.getContextPath()%>/console">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container" >
        <form class="form-signin" action="<%=request.getContextPath()%>/console/login">
            <h2 class="form-signin-heading">Please sign in</h2>
            <label for="inputEmail" class="sr-only">Email address</label> <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus> <label for="inputPassword" class="sr-only">Password</label> <input type="password" id="inputPassword"
                class="form-control" placeholder="Password" required>
            <div class="checkbox">
                <label> <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit" id="btn_Login">Sign in</button>
        </form>
    </div>
    <!-- /.container -->

<script type="text/javascript">
$(function(){
	/*$("#btn_Login").bind("click",function(){
		$("#form-signin").action="/login";
		$("#form-signin").submit();
	});*/
});
</script>

</body>
</html>