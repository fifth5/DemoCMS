/**
 * Created by FIFTH on 2015/10/16.
 */


$(document).ready(function(){
    // Validation
    $("#login-form").validate({
        // Rules for form validation
        rules : {
            email : {
                required : true,
                email : true
            },
            password : {
                required : true,
                minlength : 3,
                maxlength : 20
            }
        },

        // Messages for form validation
        messages : {
            email : {
                required : 'Please enter your email address',
                email : 'Please enter a VALID email address'
            },
            password : {
                required : 'Please enter your password'
            }
        },

        submitHandler:function(form){
            $.ajax({
                url:basePath+"/console/checkUser",
                data:$("#login-form").serialize(),
                type:"POST",
                dataType: "json",
                success:function(data){
                    if(data.result){
                        form.submit();
                    }else{
                        alert(data.msgCode);
                    }
                }
            });
        },


        // Do not change code below
        errorPlacement : function(error, element) {
            error.insertAfter(element.parent());
        }
    });
});