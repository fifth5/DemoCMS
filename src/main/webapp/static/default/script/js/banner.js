/**
 * 
 */
$(function(){
        $(onPageLoad);

        function onPageLoad(){
                var bannerList = getBannerList();
                //alert(bannerList);
                for(var key in bannerList){
                        //alert(bannerList[key].bannerName);
                }

        }



        function queryBannerList(){
                var postURL = $.getPath("/content/banner/bannerList.json");
                $.ajax({
                        type: "GET",
                        url: postURL,
                        success: function(data){
                               // alert(data);
                        }
                });
        }


});
