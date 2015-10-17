<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en-us" id="extr-page">
<head>
    <meta charset="utf-8">
    <title> DemoCMS Admin Login</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- #CSS Links -->
    <!-- Basic Styles -->
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/bootstrap/css/bootstrap.css">

    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/font-awesome.min.css">

    <!-- SmartAdmin Styles : Caution! DO NOT change the order -->
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/smartadmin-production-plugins.min.css">
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/smartadmin-production.min.css">
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/smartadmin-skins.min.css">

    <!-- SmartAdmin RTL Support -->
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/smartadmin-rtl.min.css">

    <!-- We recommend you use "your_style.css" to override SmartAdmin
         specific styles this will also ensure you retrain your customization with each SmartAdmin update.
    <link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

    <!-- #FAVICONS -->

    <!-- #GOOGLE FONT -->
    <link rel="stylesheet" href="http://fonts.useso.com/css?family=Open+Sans:400italic,700italic,300,400,700">

</head>

<body class="animated fadeInDown">

<header id="header">
    <!--<span id="logo"></span>-->

    <div id="logo-group">

        <span id="logo">  </span>

        <!-- END AJAX-DROPDOWN -->
    </div>

    <span id="extr-page-header-space">
        <span class="hidden-mobile hiddex-xs">Already registered?</span>
        <a href="/console/loginPage" class="btn btn-danger">Sign In</a>
    </span>

</header>
<div id="main" role="main">

    <!-- MAIN CONTENT -->
    <div id="content" class="container">

        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-7 col-lg-7 hidden-xs hidden-sm">

            </div>
            <div class="col-xs-12 col-sm-12 col-md-5 col-lg-5">
                <div class="well no-padding">

                    <form action="php/demo-register.php" id="smart-form-register" class="smart-form client-form">
                        <header>
                            Registration is FREE*
                        </header>

                        <fieldset>
                            <section>
                                <label class="input"> <i class="icon-append fa fa-user"></i>
                                    <input type="text" name="username" placeholder="Username">
                                    <b class="tooltip tooltip-bottom-right">Needed to enter the website</b> </label>
                            </section>

                            <section>
                                <label class="input"> <i class="icon-append fa fa-envelope"></i>
                                    <input type="email" name="email" placeholder="Email address">
                                    <b class="tooltip tooltip-bottom-right">Needed to verify your account</b> </label>
                            </section>

                            <section>
                                <label class="input"> <i class="icon-append fa fa-lock"></i>
                                    <input type="password" name="password" placeholder="Password" id="password">
                                    <b class="tooltip tooltip-bottom-right">Don't forget your password</b> </label>
                            </section>

                            <section>
                                <label class="input"> <i class="icon-append fa fa-lock"></i>
                                    <input type="password" name="passwordConfirm" placeholder="Confirm password">
                                    <b class="tooltip tooltip-bottom-right">Don't forget your password</b> </label>
                            </section>
                        </fieldset>

                        <fieldset>
                            <div class="row">
                                <section class="col col-6">
                                    <label class="input">
                                        <input type="text" name="firstname" placeholder="First name">
                                    </label>
                                </section>
                                <section class="col col-6">
                                    <label class="input">
                                        <input type="text" name="lastname" placeholder="Last name">
                                    </label>
                                </section>
                            </div>

                            <div class="row">
                                <section class="col col-6">
                                    <label class="select">
                                        <select name="gender">
                                            <option value="0" selected="" disabled="">Gender</option>
                                            <option value="1">Male</option>
                                            <option value="2">Female</option>
                                            <option value="3">Prefer not to answer</option>
                                        </select> <i></i> </label>
                                </section>
                                <section class="col col-6">
                                    <label class="input"> <i class="icon-append fa fa-calendar"></i>
                                        <input type="text" name="request" placeholder="Request activation on" class="datepicker" data-dateformat='dd/mm/yy'>
                                    </label>
                                </section>
                            </div>

                            <section>
                                <label class="checkbox">
                                    <input type="checkbox" name="subscription" id="subscription">
                                    <i></i>I want to receive news and special offers</label>
                                <label class="checkbox">
                                    <input type="checkbox" name="terms" id="terms">
                                    <i></i>I agree with the <a href="#" data-toggle="modal" data-target="#myModal"> Terms and Conditions </a></label>
                            </section>
                        </fieldset>
                        <footer>
                            <button type="submit" class="btn btn-primary">
                                Register
                            </button>
                        </footer>

                        <div class="message">
                            <i class="fa fa-check"></i>
                            <p>
                                Thank you for your registration!
                            </p>
                        </div>
                    </form>

                </div>

            </div>
        </div>
    </div>

</div>


<!--================================================== -->

<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/pace/pace.min.js"></script>

<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
<script src="<%=request.getContextPath()%>/static/assets/jquery-2.1.3.js"></script>
<script> if (!window.jQuery) {
    document.write('<script src="<%=request.getContextPath()%>/static/assets/jquery-2.1.3.min.js"><\/script>');
} </script>

<script src="//ajax.useso.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
<script> if (!window.jQuery.ui) {
    document.write('<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/libs/jquery-ui-1.10.3.min.js"><\/script>');
} </script>

<!-- IMPORTANT: APP CONFIG -->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/app.config.js"></script>

<!-- JS TOUCH : include this plugin for mobile drag / drop touch events
		<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

<!-- BOOTSTRAP JS -->
<script src="<%=request.getContextPath()%>/static/assets/bootstrap/js/bootstrap.js"></script>

<!-- JQUERY VALIDATE -->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/jquery-validate/jquery.validate.min.js"></script>

<!-- JQUERY MASKED INPUT -->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/masked-input/jquery.maskedinput.min.js"></script>

<!--[if IE 8]>

<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

<![endif]-->

<!-- MAIN APP JS FILE -->
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/app.min.js"></script>

<script type="text/javascript">
    runAllForms();
    var basePath = "<%=request.getContextPath()%>";
</script>

<script src="<%=request.getContextPath()%>/static/script/console/regesterPage.js"></script>






</body>
</html>