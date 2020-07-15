$(function () {
    userList();
})
function userList(){
    $.ajax({
        type: "POST",
        url: '/manage/userManage/userList',
        data: {
        },
        dataType: "json",
        error: function(data) {
            alert("请求失败");
        },
        success: function(data){
            console.log(data);
            if(data.status == 0){
                var list = data.data.users;
                list.forEach(function (u) {
                    $("#tab").append("<tr><td>" + u.name + "</td><td>" + u.password + "</td></tr>")
                })
            }else{
                alert(data.msg)
            }
        }
    });
}