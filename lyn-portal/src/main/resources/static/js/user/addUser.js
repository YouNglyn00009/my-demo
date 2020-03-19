$(function () {
    $("#user_addUser").click(function() {
        var name = $("#user_name").val();
        var pwd = $("#user_pwd").val();
        $.ajax({
            type: "post",
            data: {
                name: name,
                pwd: pwd
            },
            dataType: "json",
            url: "/user/addUser",
            success: function(data) {
                alert(data.msg);
            },
            error: function() {
                alert("add user error");
            }
        })
    })
})