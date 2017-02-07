<%--
  Created by IntelliJ IDEA.
  User: ZF
  Date: 2017/1/20
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    request.getSession().setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>后台登录</title>
    <meta name="author" content="DeathGhost" />
    <link rel="stylesheet" type="text/css" href="${path}/css/style.css" />
    <style>
        body{height:100%;background:#16a085;overflow:hidden;}
        canvas{z-index:-1;position:absolute;}
    </style>
    <script src="${path}/js/jquery.js"></script>
    <script src="${path}/js/verificationNumbers.js"></script>
    <script src="${path}/js/Particleground.js"></script>
    <script src="${path}/js/module/system/main.js"></script>

    <script>
        $(document).ready(function() {
            //粒子背景特效
            $('body').particleground({
                dotColor: '#5cbdaa',
                lineColor: '#5cbdaa'
            });
            //验证码
            createCode();
            //测试提交，对接程序删除即可
//            $(".submit_btn").click(function(){
//                location.href="index.html";
//            });
        });
        var path = "${path}";
    </script>
</head>
<body>
<form name="loginForm" action="${path}/member/main.shtml" method="post">
    <dl class="admin_login">
        <dt>
            <strong>站点后台管理系统</strong>
            <em>Management System</em>
        </dt>
        <dd class="user_icon">
            <input type="text" placeholder="账号" class="login_txtbx" name="username" id="username"/>
        </dd>
        <dd class="pwd_icon">
            <input type="password" placeholder="密码" class="login_txtbx" name="password" id="password"/>
        </dd>
        <dd class="val_icon">
            <div class="checkcode">
                <input type="text" id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
                <canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
            </div>
            <%--<input type="button" value="验证码核验" class="ver_btn" onClick="validate();">--%>
        </dd>
        <dd>
            <input type="button" value="立即登陆" class="submit_btn" onclick="login()"/>
        </dd>
    </dl>
</form>
</body>
</html>
