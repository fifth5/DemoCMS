
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
        var content = $('.summernote').code();
        var title = $("input[name='content']").val(content);
        $(".form-horizontal").submit();
    });


})
