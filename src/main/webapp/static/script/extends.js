/**
 * 
 */

var BASE_PATH;
$(function(){
    BASE_PATH = system.rootPath;

});

jQuery.getPath=function(path){
    var postURL = BASE_PATH+path;
    return postURL;
}

jQuery.loadData = function (url,data,type) {
/*
    $.ajax({
        type: type,
        url: url ,
        data: data ,
        success: success ,
        dataType: dataType
    });

    return results;
*/
}