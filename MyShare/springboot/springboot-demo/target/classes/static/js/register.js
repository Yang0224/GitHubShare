
function regist(){
    var name = $("#name").val();
    var password = $("#password").val();
    $.ajax({
        type: "POST",
        url: '/manage/userManage/registUser',
        data: {
            'name' : name,
            'password' : password
        },
        dataType: "json",
        error: function(data) {
            alert("请求失败");
        },
        success: function(data){
            console.log(data);
            if(data.status == 0){
                window.location = "/manage/userManage/list"
            }else{
                alert(data.msg)
            }
        }
    });
}