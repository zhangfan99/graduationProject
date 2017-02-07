
function login(){
    if (!$("#username").val()){
        alert("用户名不可为空");
    }
    if (!$("#password").val()){
        alert("密码不可为空");
    }
    if (!$("#J_codetext").val()){
        alert("验证码不可为空");
    }
    //var validate = validate();
    //if (!validate){
    //    alert("验证码错误");
    //    return;
    //}
    $("form[name='loginForm']").submit();
}