<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- JS Global Compulsory -->
<script type="text/javascript" src="${system.hostURL}/static/assets/jquery-2.1.3.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/js/modernizr.custom.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<!-- JS Implementing Plugins -->
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/plugins/flexslider/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/plugins/parallax-slider/js/modernizr.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/plugins/parallax-slider/js/jquery.cslider.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/plugins/bxslider/jquery.bxslider.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/plugins/back-to-top.js"></script>
<!-- JS Page Level -->
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/js/app.js"></script>
<script type="text/javascript" src="${system.hostURL}/static/portal/assets/js/pages/index.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function() {
        App.init();
        App.initSliders();
        App.initBxSlider1();
        Index.initParallaxSlider();
    });
</script>
<!--[if lt IE 9]>
<script src="${system.hostURL}/static/portal/assets/js/respond.js"></script>
<![endif]-->
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='UTF-8'></script></div>

