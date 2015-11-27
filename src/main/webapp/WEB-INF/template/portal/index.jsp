<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>   
<tiles:insertDefinition name="base.portal">
    <tiles:putAttribute name="body" >
        <div>
            <!--=== Style Switcher ===-->
            <i class="style-switcher-btn style-switcher-btn-option icon-cogs"></i>
            <div class="style-switcher style-switcher-inner">
                <div class="theme-close"><i class="icon-remove"></i></div>
                <div class="theme-heading">Theme Colors</div>
                <ul class="unstyled">
                    <li class="theme-default theme-active" data-style="default" data-header="dark"></li>
                    <li class="theme-blue" data-style="blue" data-header="dark"></li>
                    <li class="theme-orange" data-style="orange" data-header="dark"></li>
                    <li class="theme-red" data-style="red" data-header="dark"></li>
                    <li class="theme-light" data-style="light" data-header="dark"></li>
                </ul>
            </div><!--/style-switcher-->
            <!--=== End Style Switcher ===-->

            <!--=== Header ===-->
            <div class="header">
                <div class="container">
                    <!-- Logo -->
                    <div class="logo">
                        <a href="index.html"><img id="logo-header" src="assets/img/logo2-default.png" alt="Logo" /></a>
                    </div><!-- /logo -->

                    <!-- Menu -->
                    <div class="navbar">
                        <div class="navbar-inner">
                            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </a><!-- /nav-collapse -->
                            <div class="nav-collapse collapse">
                                <ul class="nav">
                                    <li class="active">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Home
                                            <b class="caret"></b>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="index.html">Option1: Landing Page</a></li>
                                            <li class="active"><a href="page_home.html">Option2: Header Option</a></li>
                                            <li><a href="page_home4.html">Option3: Revolution Slider</a></li>
                                            <li><a href="page_home5.html">Option4: Amazing Content</a></li>
                                            <li><a href="page_home1.html">Option5: Mixed Content</a></li>
                                            <li><a href="page_home2.html">Option6: Content with Sidebar</a></li>
                                            <li><a href="page_home3.html">Option7: Aplle Style Slider</a></li>
                                            <li><a href="page_home_all.html">Home All In One</a></li>
                                        </ul>
                                        <b class="caret-out"></b>
                                    </li>
                                    <li>
                                        <a href="" class="dropdown-toggle" data-toggle="dropdown">Pages
                                            <b class="caret"></b>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="page_about.html">About Us</a></li>
                                            <li><a href="page_services.html">Services</a></li>
                                            <li><a href="page_pricing.html">Pricing</a></li>
                                            <li><a href="page_coming_soon.html">Coming Soon</a></li>
                                            <li><a href="page_faq.html">FAQs</a></li>
                                            <li><a href="page_search.html">Search Result</a></li>
                                            <li><a href="page_gallery.html">Gallery</a></li>
                                            <li><a href="page_registration.html">Registration</a></li>
                                            <li><a href="page_login.html">Login</a></li>
                                            <li><a href="page_404.html">404</a></li>
                                            <li><a href="page_clients.html">Clients</a></li>
                                            <li><a href="page_privacy.html">Privacy Policy</a></li>
                                            <li><a href="page_terms.html">Terms of Service</a></li>
                                            <li><a href="page_column_left.html">2 Columns (Left)</a></li>
                                            <li><a href="page_column_right.html">2 Columns (Right)</a></li>
                                        </ul>
                                        <b class="caret-out"></b>
                                    </li>
                                    <li>
                                        <a href="" class="dropdown-toggle" data-toggle="dropdown">Features
                                            <b class="caret"></b>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="feature_grid.html">Grid Layout</a></li>
                                            <li><a href="feature_typography.html">Typography</a></li>
                                            <li><a href="feature_thumbnail.html">Thumbnails</a></li>
                                            <li><a href="feature_component.html">Components</a></li>
                                            <li><a href="feature_navigation.html">Navigation</a></li>
                                            <li><a href="feature_table.html">Tables</a></li>
                                            <li><a href="feature_form.html">Forms</a></li>
                                            <li><a href="feature_icons.html">Icons</a></li>
                                            <li><a href="feature_button.html">Buttons</a></li>
                                        </ul>
                                        <b class="caret-out"></b>
                                    </li>
                                    <li>
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Portfolio
                                            <b class="caret"></b>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="portfolio.html">Portfolio</a></li>
                                            <li><a href="portfolio_item.html">Portfolio Item</a></li>
                                            <li><a href="portfolio_2columns.html">Portfolio 2 Columns</a></li>
                                            <li><a href="portfolio_3columns.html">Portfolio 3 Columns</a></li>
                                            <li><a href="portfolio_4columns.html">Portfolio 4 Columns</a></li>
                                        </ul>
                                        <b class="caret-out"></b>
                                    </li>
                                    <li>
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Blog
                                            <b class="caret"></b>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="blog.html">Blog</a></li>
                                            <li><a href="blog_item.html">Blog Item</a></li>
                                            <li><a href="blog_left_sidebar.html">Blog Left Sidebar</a></li>
                                            <li><a href="blog_item_left_sidebar.html">Blog Item Left Sidebar</a></li>
                                        </ul>
                                        <b class="caret-out"></b>
                                    </li>
                                    <li>
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Contact
                                            <b class="caret"></b>
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a href="page_contact.html">Contact Default</a></li>
                                            <li><a href="page_contact1.html">Contact Boxed Map</a></li>
                                        </ul>
                                        <b class="caret-out"></b>
                                    </li>
                                    <li><a class="search search-nav"><i class="icon-search search-btn"></i></a></li>
                                </ul>
                                <div class="search-open search-open-inner">
                                    <div class="input-append">
                                        <form />
                                        <input type="text" class="span3" placeholder="Search" />
                                        <button type="submit" class="btn-u">Search</button>
                                        </form>
                                    </div>
                                </div>
                            </div><!-- /nav-collapse -->
                        </div><!-- /navbar-inner -->
                    </div><!-- /navbar -->
                </div><!-- /container -->
            </div><!--/header -->
            <!--=== End Header ===-->

            <div style="height: 1000px">

                hello world<br>
            </div>



        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>