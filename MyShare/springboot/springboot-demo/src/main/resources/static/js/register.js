
function regist(){
    var name = $("#name").val();
    var password = $("#password").val();
    $.ajax({
        type: "POST",
        url: '/user/regist',
        data: {
            'name' : name,
            'password' : password
        },
        dataType: "json",
        error: function(data) {
            alert("请求失败");
        },
        success: function(data){
            alert(data.msg);
            if(data.status == 0){
                window.location = "/user/list"
            }
        }
    });
}