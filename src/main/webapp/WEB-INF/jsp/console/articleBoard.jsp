<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="console.default">
    <tiles:putAttribute name="consoleBoard">
        <div class="row">
            <div class=" col-lg-10 ">
                <div class="widget-body">
                    <form class="form-horizontal">

                        <fieldset>
                            <legend>Blog</legend>
                            <div class="form-group">
                                <label class="col-md-2 control-label">Title</label>

                                <div class="col-md-10">
                                    <input class="form-control" type="text" name="title" autocomplete="off">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-2 control-label">Content</label>

                                <div class="col-md-10">

                                    <!-- Widget ID (each widget will need unique ID)-->
                                    <div class="jarviswidget jarviswidget-color-blue" id="wid-id-0"
                                         data-widget-colorbutton="false" data-widget-editbutton="false"
                                         data-widget-togglebutton="false" data-widget-fullscreenbutton="false"
                                         data-widget-sortable="false" role="widget" style="border-top: 1px solid #ccc;">
                                        <!-- widget options:
                                        usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

                                        data-widget-colorbutton="false"
                                        data-widget-editbutton="false"
                                        data-widget-togglebutton="false"
                                        data-widget-deletebutton="false"
                                        data-widget-fullscreenbutton="false"
                                        data-widget-custombutton="false"
                                        data-widget-collapsed="true"
                                        data-widget-sortable="false"

                                        -->

                                        <!-- widget div-->
                                        <div role="content ">

                                            <!-- widget edit box -->
                                            <div class="jarviswidget-editbox">
                                                <!-- This area used as dropdown edit box -->

                                            </div>
                                            <!-- end widget edit box -->

                                            <!-- widget content -->
                                            <div class="widget-body no-padding">

                                                <div class="summernote" style="display: none;">


                                                </div>


                                                <div class="widget-footer smart-form">

                                                    <div class="btn-group">

                                                        <button class="btn btn-sm btn-primary hidden" type="button">
                                                            <i class="fa fa-times"></i> Cancel
                                                        </button>

                                                    </div>
                                                    <div class="btn-group">

                                                        <button class="btn btn-sm btn-success" type="button" id="btn_submit">
                                                            <i class="fa fa-check"></i> Save
                                                        </button>

                                                    </div>

                                                    <label class="checkbox pull-left hidden">
                                                        <input type="checkbox" checked="checked" name="autosave"
                                                               id="autosave">
                                                        <i></i>Auto Save
                                                    </label>

                                                </div>

                                            </div>
                                            <!-- end widget content -->

                                        </div>
                                        <!-- end widget div -->

                                    </div>
                                    <!-- end widget -->


                                </div>
                            </div>


                        </fieldset>

                    </form>

                </div>

            </div>
        </div>

    </tiles:putAttribute>
</tiles:insertDefinition>
<script src="<%=request.getContextPath()%>/static/assets/smartAdmin/js/plugin/summernote/summernote.min.js"></script>

<script type="text/javascript">

    // DO NOT REMOVE : GLOBAL FUNCTIONS!

    $(document).ready(function() {

        pageSetUp();

        /*
         * SUMMERNOTE EDITOR
         */

        $('.summernote').summernote({
            height : 180,
            focus : false,
            tabsize : 2
        });


        $("#btn_submit").unbind("click").bind("click",function(){

            var sHTML = $('.summernote').code();

            alert(sHTML);

        });


    })

</script>