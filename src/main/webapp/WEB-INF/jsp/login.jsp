<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>物业系统登陆</title>
    <%@include file="/common/head.jsp" %>
    <%@include file="/WEB-INF/head.jsp"%>

    <link rel="stylesheet" href="css/main.css"/>
    <script type="text/javascript" src="js/fun.base.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script src="js/login.js"></script>
</head>
<body>

<div class="login" style="height: 100%">
    <div class="box png">
        <div class="input">
            <div class="log">
                <form id="loginform_user">
                    <div class="name">
                        <label>用户名</label><input type="text" name="rUsername" class="text" id="value_1" placeholder="请输入用户名" name="value_1" tabindex="1">
                    </div>
                    <div class="pwd">
                        <label>密　码</label><input type="password" name="rPassword" class="text" id="value_2" placeholder="请输入密码" name="value_2" tabindex="2">
                        <input type="button" class="submit" tabindex="3" value="登录" id="login_submit">
                        <div class="check"></div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="air-balloon ab-1 png"></div>
    <div class="air-balloon ab-2 png"></div>
</div>

</body>
</html>
