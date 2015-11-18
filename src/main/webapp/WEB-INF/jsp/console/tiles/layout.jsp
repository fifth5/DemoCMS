<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en-us" >
<head>
    <meta charset="utf-8">

    <title> DemoCMS Console</title>
    <meta name="description" content="">
    <meta name="author" content="">

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- #CSS Links -->
    <!-- Basic Styles -->
    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/bootstrap.min.css">

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

    <link rel="stylesheet" type="text/css" media="screen"
          href="<%=request.getContextPath()%>/static/assets/smartAdmin/css/demo.min.css">

    <!-- #FAVICONS -->

    <!-- #GOOGLE FONT -->
    <link rel="stylesheet" href="http://fonts.useso.com/css?family=Open+Sans:400italic,700italic,300,400,700">

</head>

<body>

    <!-- HEADER -->
    <header id="header">

        <!-- pulled right: nav area -->
        <div class="pull-right">

            <!-- collapse menu button -->
            <div id="hide-menu" class="btn-header pull-right">
                <span> <a href="javascript:void(0);" data-action="toggleMenu" title="Collapse Menu"><i class="fa fa-reorder"></i></a> </span>
            </div>
            <!-- end collapse menu -->

            <!-- logout button -->
            <div id="logout" class="btn-header transparent pull-right">
                <span> <a href="/console/logout" title="Sign Out" data-action="userLogout" data-logout-msg="You can improve your security further after logging out by closing this opened browser"><i class="fa fa-sign-out"></i></a> </span>
            </div>
            <!-- end logout button -->

            <!-- fullscreen button -->
            <div id="fullscreen" class="btn-header transparent pull-right">
                <span> <a href="javascript:void(0);" data-action="launchFullscreen" title="Full Screen"><i class="fa fa-arrows-alt"></i></a> </span>
            </div>
            <!-- end fullscreen button -->

        </div>
        <!-- end pulled right: nav area -->

    </header>
    <!-- END HEADER -->

    <!-- Left panel : Navigation area -->
    <!-- Note: This width of the aside area can be adjusted through LESS variables -->
    <aside id="left-panel">

        <!-- User info -->
        <div class="login-info">
				<span> <!-- User image size is adjusted inside CSS, it should stay as it -->

					<a href="javascript:void(0);" id="show-shortcut" data-action="toggleShortcut">
                        <img src="img/avatars/sunny.png" alt="me" class="online" />
						<span>
							john.doe
						</span>
                        <i class="fa fa-angle-down"></i>
                    </a>

				</span>
        </div>
        <!-- end user info -->

        <!-- NAVIGATION : This navigation is also responsive-->
        <nav>
            <ul>
                <li>
                    <a href="#" title="Dashboard">
                        <i class="fa fa-lg fa-fw fa-home"></i> <span class="menu-item-parent">Dashboard</span>
                    </a>
                </li>
                <li>
                    <a href="<%=request.getContextPath()%>/console/bannerBoard">
                        <i class="fa fa-lg fa-fw fa-inbox"></i>
                        <span class="menu-item-parent">Banner</span>
                    </a>
                </li>
                <li>
                    <a href="<%=request.getContextPath()%>/console/articleBoard">
                        <i class="fa fa-lg fa-fw fa-inbox"></i>
                        <span class="menu-item-parent">Article</span>
                    </a>
                </li>


            </ul>
        </nav>

        <span class="minifyme" data-action="minifyMenu">
            <i class="fa fa-arrow-circle-left hit"></i>
        </span>

    </aside>
    <!-- END NAVIGATION -->

    <!-- MAIN PANEL -->
    <div id="main" role="main">

        <!-- RIBBON -->
        <div id="ribbon">

				<span class="ribbon-button-alignment">
					<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span>
				</span>

            <!-- breadcrumb -->
            <ol class="breadcrumb">
                <li>Home</li><li>Dashboard</li>
            </ol>
            <!-- end breadcrumb -->

            <!-- You can also add more buttons to the
            ribbon for further usability

            Example below:

            <span class="ribbon-button-alignment pull-right">
            <span id="search" class="btn btn-ribbon hidden-xs" data-title="search"><i class="fa-grid"></i> Change Grid</span>
            <span id="add" class="btn btn-ribbon hidden-xs" data-title="add"><i class="fa-plus"></i> Add</span>
            <span id="search" class="btn btn-ribbon" data-title="search"><i class="fa-search"></i> <span class="hidden-mobile">Search</span></span>
            </span> -->

        </div>
        <!-- END RIBBON -->

        <!-- MAIN CONTENT -->
        <div id="content">
            <tiles:insertAttribute name="consoleBoard"  />
        </div>
        <!-- END MAIN CONTENT -->

    </div>
    <!-- END MAIN PANEL -->

    <!-- PAGE FOOTER -->
    <div class="page-footer">
        <div class="row">
            <div class="col-xs-12 col-sm-6">
                <span class="txt-color-white">DemoCMS <span class="hidden-xs"> - Web Application Framework</span> © 2014-2015</span>
            </div>

            <div class="col-xs-6 col-sm-6 text-right hidden-xs">
            </div>
        </div>
    </div>
    <!-- END PAGE FOOTER -->

    <!--================================================== -->

    <!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
    <script data-pace-options='{ "restartOnRequestAfter": true }' src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/pace/pace.min.js"></script>


    <!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
    <script src="<%=request.getContextPath()%>/static/assets/jquery-2.1.3.js"></script>
    <script> if (!window.jQuery) {
        document.write('<script src="<%=request.getContextPath()%>/static/assets/jquery-2.1.3.min.js"><\/script>');
    } </script>

    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/libs/jquery-ui-1.10.3.min.js"></script>
    <script>
        if (!window.jQuery.ui) {
            document.write('<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/libs/jquery-ui-1.10.3.min.js"><\/script>');
        }
    </script>

    <!-- IMPORTANT: APP CONFIG -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/app.config.js"></script>

    <!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script>

    <!-- BOOTSTRAP JS -->
    <script src="<%=request.getContextPath()%>/static/assets/bootstrap/js/bootstrap.js"></script>


    <!-- CUSTOM NOTIFICATION -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/notification/SmartNotification.min.js"></script>

    <!-- JARVIS WIDGETS -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/smartwidgets/jarvis.widget.min.js"></script>

    <!-- EASY PIE CHARTS -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>

    <!-- SPARKLINES -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/sparkline/jquery.sparkline.min.js"></script>

    <!-- JQUERY VALIDATE -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/jquery-validate/jquery.validate.min.js"></script>

    <!-- JQUERY MASKED INPUT -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/masked-input/jquery.maskedinput.min.js"></script>

    <!-- JQUERY SELECT2 INPUT -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/select2/select2.min.js"></script>

    <!-- JQUERY UI + Bootstrap Slider -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

    <!-- browser msie issue fix -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

    <!-- FastClick: For mobile devices -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/fastclick/fastclick.min.js"></script>


    <!--[if IE 8]>

    <h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

    <![endif]-->

    <!-- Demo purpose only
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/demo.min.js"></script>-->

    <!-- MAIN APP JS FILE -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/app.min.js"></script>

    <!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
    <!-- Voice command : plugin -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/speech/voicecommand.min.js"></script>

    <!-- SmartChat UI : plugin -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/smart-chat-ui/smart.chat.ui.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/smart-chat-ui/smart.chat.manager.min.js"></script>

    <!-- PAGE RELATED PLUGIN(S) -->

    <!-- Flot Chart Plugin: Flot Engine, Flot Resizer, Flot Tooltip -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/flot/jquery.flot.cust.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/flot/jquery.flot.resize.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/flot/jquery.flot.time.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/flot/jquery.flot.tooltip.min.js"></script>

    <!-- Vector Maps Plugin: Vectormap engine, Vectormap language -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/vectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/vectormap/jquery-jvectormap-world-mill-en.js"></script>

    <!-- Full Calendar -->
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/moment/moment.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/fullcalendar/jquery.fullcalendar.min.js"></script>


</body>
</html>