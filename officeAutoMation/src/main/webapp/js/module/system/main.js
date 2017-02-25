
function login(){
    if (!$("#username").val()){
        alert("用户名不可为空");
        return;
    }
    if (!$("#password").val()){
        alert("密码不可为空");
        return;
    }
    if (!$("#J_codetext").val()){
        alert("验证码不可为空");
        return;
    }
    //var validate = validate();
    //if (!validate){
    //    alert("验证码错误");
    //    return;
    //}
    $("form[name='loginForm']").submit();
}