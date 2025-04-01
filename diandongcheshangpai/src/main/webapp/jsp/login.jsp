<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/assets2/js/jquery.min.js"></script>

    <!--  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets2/css/style.css"> -->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/assets2/css/loader-style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/assets2/css/bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/assets2/css/signin.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- Fav and touch icons -->
    <link rel="shortcut icon"
          href="${pageContext.request.contextPath}/resources/assets2/ico/minus.png">
</head>
<style>
    html {
        width: 100%;
        height: 100%;
    }
    body {
        background-image: url(http://codegen.caihongy.cn/20210203/f93fe1b72610452dab696d7aa5d26695.jpg) !important;
        height: 100vh;
        background-position: center center;
        background-size: cover;
        background-repeat: no-repeat;
        overflow: hidden !important;
        width: 100%;
        height: 100%;
    }
    .container {
        padding: 0;
        margin: 0;
        display: flex;
        height: 100%;
        width: 100%;
        justify-content: center;
        align-items: center;
    }

    #login-wrapper {
        display: flex;
        flex-direction: column;
        position: inherit;
        height: auto;
        width: 400px;
        margin: 0;
        padding: 20px 0px 20px 0;
        border-radius: 6px 6px 6px 6px;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,.3);
        background-color: rgba(255, 251, 240, 1);
        box-shadow: 0 0 4px rgba(30, 144, 255, .8);
    }

    #login-wrapper h1 {
        line-height: 60px;
        width: 100%;
        color: rgba(21, 20, 20, 1);
        font-size: 20px;
        margin: 0px 0px;
        padding: 0 10px;
        border-radius: 0;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,.3);
        background-color: rgba(30, 144, 255, 0);
        box-shadow: 0 0 6px rgba(30, 144, 255, 0);
        text-align: center;
    }

    #loginForm .form-group-l-r {
        display: flex;
        flex-wrap: wrap;
    }

    #loginForm .form-group {
        display: flex;
        align-items: center;
        flex-wrap: wrap;
        height: auto;
        width: 80%;
        margin: 0 auto;
        padding: 0 0 10px 0;
        border-radius: 0;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,1);
        background-color: rgba(255, 251, 240, 1);
        box-shadow: 0 0 6px rgba(255,0,0,0);
    }

    #loginForm .form-group .label {
        width: 72px;
        line-height: 44px;
        margin: 0;
        color: rgba(114, 94, 130, 1);
        font-size: 16px;
        padding: 0;
        border-radius: 0;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,0);
        background-color: transparent;
        box-shadow: 0 0 6px rgba(255,0,0,0);
        text-align: left;
    }

    #loginForm .form-group .form-control-i {
        width: 100%;
        height: 44px;
        margin: 0;
        color: rgba(114, 94, 130, 1);
        font-size: 14px;
        padding: 0 10px;
        border-radius: 8px;
        border-width: 0;
        border-style: solid;
        border-color: #ccc;
        background-color: #fff;
        box-shadow: 0 0 6px rgba(30, 144, 255, .5);
        text-align: left;
    }

    #loginForm .form-group .form-control-i:focus {
        outline: 0 none;
    }

    #loginForm .form-group-r {
        display: flex;
        align-items: center;
        width: 80%;
        height: 44px;
        margin: 0 auto;
        padding: 0;
        border-radius: 0;
        border-width: 0;
        border-style: solid;
        border-color: rgba(0,0,0,1);
        background-color: rgba(255, 251, 240, 1);
        box-shadow: 0 0 6px rgba(255,0,0,0);
    }

    #loginForm .form-group-r .checkbox {
        margin: 0 10px 0 0;
        padding: 0;
        display: flex;
        align-items: center;
    }

    #loginForm .form-group-r .checkbox label {
        color: #606266;
        font-size: 14px;
        margin: 0;
        margin-top: -1px;
    }

    #loginForm .form-group-r .checkbox.active label {
        color: rgba(114, 94, 130, 1);
        font-size: 14px;
    }

    #loginForm .form-group-r .checkbox input {
        margin: 0;
        margin-right: 4px;
    }

    #loginForm button.pull-right {
        outline: none;
        width: 100%;
        height: 44px;
        margin: 10px 3% 10px 7%;
        color: rgba(18, 18, 18, 1);
        font-size: 16px;
        padding: 0 10px;
        border-radius: 4px;
        border-width: 0;
        border-style: solid;
        border-color: #ccc;
        background-color: rgba(30, 144, 255, .8);
        box-shadow: 0 0 0px rgba(255, 0, 0, .5);
    }

    #loginForm a.btn-register {
        display: inline-block;
        width: 100%;
        height: 44px;
        margin: 10px 3% 13px 6%;
        color: #fff;
        font-size: 16px;
        padding: 10px;
        border-radius: 4px;
        border-width: 0;
        border-style: solid;
        border-color: #ccc;
        background-color: rgba(231, 47, 26, 1);
        box-shadow: 0 0 0px rgba(30, 144, 255, .5);
        display: flex;
        justify-content: center;
        align-items: center;
        text-decoration: none;
    }

    #loginForm .codes {
        display: none;
    }

    #loginForm .codes input {
        width: calc(100% - 84px);
        height: 44px;
        margin: 0;
        color: #1e90ff;
        font-size: 14px;
        padding: 0 10px;
        border-radius: 0;
        border-width: 1px;
        border-style: solid;
        border-color: #1e90ff;
        background-color: #fff;
        box-shadow: 0 0 6px rgba(30, 144, 255, 0);
        outline: none;
    }

    #loginForm .codes .nums {
        width: 84px;
        height: 44px;
        margin: 0;
        color: $template2.back.login.code.nums.color;
        font-size: $template2.back.login.code.nums.fontSize;
        padding: 0;
        border-radius: 0;
        border-width: 1px 1px 1px 0;
        border-style: solid;
        border-color: #1e90ff;
        background-color: #f5f5f5;
        box-shadow: 0 0 6px rgba(30, 144, 255, 0);
        outline: none;
    }
</style>
<body>
<!-- Preloader -->
<!-- <div id="preloader">
    <div id="status">&nbsp;</div>
</div> -->

<div class="container">

    <div class="" id="login-wrapper">
        <h1>登陆</h1>
        <form id="loginForm" action="" method="post">
            <div class="form-group">
                <label class="label">用户名</label> <input type="text" id="username" name="username" placeholder="用户名"
                                                        class="form-control-i" required>
            </div>
            <div class="form-group">
                <label class="label">密码</label> <input type="password" name="password" placeholder="密码"
                                                       class="form-control-i" required>
            </div>

            <div class="form-group">
                <label class="label">验证码</label>
                <input id="code1" type="text" value="" placeholder="请输入验证码" class="form-control-i">
                <canvas id="canvas" width="100" height="30"></canvas>
            </div>
            <div class="form-group-r">
                <div class="checkbox">
                    <label>
                        <input type="radio" name="chk" value="管理员" onclick="checkRole('管理员','users')">
                        管理员
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="radio" name="chk" value="用户" onclick="checkRole('用户','yonghu')">
                        用户
                    </label>
                </div>
            </div>

            <div class="form-group-l-r">
                <button class="btn btn btn-primary pull-right" type="submit" onclick="login()">登 录</button>
            </div>
        </form>

        <!-- <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="account-box">

                </div>
            </div>
        </div> -->
    </div>

</div>

<!--  END OF PAPER WRAP -->

<!-- MAIN EFFECT -->
<!--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets2/js/preloader.js"></script>-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/resources/assets2/js/bootstrap.js"></script>
<!--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets2/js/app.js"></script>-->
<!--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets2/js/load.js"></script>-->
<!--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets2/js/main.js"></script>-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>

<!--<script src="http://maps.googleapis.com/maps/api/js?sensor=false" type="text/javascript"></script> -->
<!--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets2/js/map/gmap3.js"></script> -->
<script type="text/javascript">

    <%@ include file="utils/menu.jsp"%>
    <%@ include file="static/yanzhengma.js"%>
    <%@ include file="utils/baseUrl.jsp"%>
    var role = "";
    var accountTableName = "";
    var codes = [{
        num: 1,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }, {
        num: 2,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }, {
        num: 3,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }, {
        num: 4,
        color: '#000',
        rotate: '10deg',
        size: '16px'
    }]



    function checkRole(roleName, tableName) {
        role = roleName;
        accountTableName = tableName;
    }

    function login() {
        debugger
        var val = $("#code1").val().toLowerCase();
        var num = show_num.join("");   //用于把数组中的所有元素放入一个字符串。
        if(val==''){
            return alert('请输入验证码！');
        }else if(val != num){
            return alert('验证码错误！请重新输入！');
        }
        $('#loginForm').attr('action', baseUrl + accountTableName + '/login?role='+role);
        $("#loginForm")
            .ajaxForm(
                function (res) {
                    debugger
                    if (role == "" || role == null) {
                        alert("请选择角色后再登录");
                    } else {
                        if (res.code == 0) {
                            alert("登录成功");
                            var username = $('#username').val();
                            window.sessionStorage.setItem('accountTableName', accountTableName)
                            window.sessionStorage.setItem('username', username);
                            window.sessionStorage.setItem('token',res.token);
                            window.sessionStorage.setItem('role',role);
                            window.sessionStorage.setItem('userId',res.userId);
                            window.location.href = "${pageContext.request.contextPath}/index.jsp";
                        } else {
                            return alert('账号、密码或权限不正确');
                        }
                    }

                });
    }

    function ready() {
        draw(show_num);
        $("#canvas").on('click',function(){
            draw(show_num);
        })
    }

    document.addEventListener("DOMContentLoaded", ready);
</script>

</body>

</html>
