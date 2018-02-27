<%--
  author Tency

  Date 2016/11
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>新增统计数据</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>Add User</h1>
    <hr/>

    <form action="addTjData" method="post" >
        <div class="form-group">
            <label for="biz_Type">业务类型:</label>
            <select id="biz_Type" name="biz_Type">
                <option value="1">代码行数</option>
                <option value="2">千行代码bug率</option>
                <option value="3">自测通过率</option>
                <option value="4">bug重开率</option>
                <option value="5">次数crash率</option>
                <option value="6">用户crash率</option>
                <option value="7">线上问题</option>
                <option value="8">线上故障数</option>
                <option value="9">总体登录成功率</option>
                <option value="10">手机号登录成功率</option>
                <option value="11">微博登录成功率</option>
                <option value="12">微信登录成功率</option>
                <option value="13">QQ登录成功率</option>
                <option value="14">新用户次日Push到达率</option>
                <option value="15">直播开播push到达率</option>
                <option value="16">送礼物成功率</option>
                <option value="17">钻石购买成功率</option>
                <option value="18">会员购买成功率</option>
                <option value="19">总接口成功率</option>
                <option value="20">密码登录成功率</option>
                <option value="21">开播接口成功率</option>
                <option value="22">送礼接口成功率</option>
                <option value="23">下单接口成功率</option>
                <option value="24">PK游戏房间创建成功率</option>
                <option value="25">PK游戏匹配成功率</option>
                <option value="26">PK游戏开局成功率</option>
                <option value="27">验证码登录成功率</option>
                <option value="28">直播登录成功率</option>
            </select>
        </div>
        <div class="form-group">
            <label for="platform">平台类型:</label>
            <select id="platform" name="platform">
                <option value="0">请选择平台</option>
                <option value="1">安卓</option>
                <option value="2">iOS</option>
            </select>
        </div>
        <div class="form-group">
            <label for="version_code">版本号:</label>
            <input type="text" class="form-control" id="version_code" name="version_code" placeholder="请输入版本号"/>
        </div>
        <div class="form-group">
            <label for="business_num">业务数据:</label>
            <input type="text" class="form-control" id="business_num" name="business_num" placeholder="请输入业务数据"/>
        </div>
        <div class="form-group">
            <label for="week_num">周数:</label>
            <input type="text" class="form-control" id="week_num" name="week_num" placeholder="请输入周数"/>
        </div>
        <div class="form-group">
            <label for="new_add">线上问题新增数:</label>
            <input type="text" class="form-control" id="new_add" name="new_add" placeholder="请输入线上问题新增数"/>
        </div>
        <div class="form-group">
            <label for="fix_num">线上问题修复数:</label>
            <input type="text" class="form-control" id="fix_num" name="fix_num" placeholder="请输入线上问题修复数"/>
        </div>
        <div class="form-group">
            <label for="p1_num">线上P1故障数:</label>
            <input type="text" class="form-control" id="p1_num" name="p1_num" placeholder="请输入线上P1故障数"/>
        </div>
        <div class="form-group">
            <label for="p2_num">线上P2故障数:</label>
            <input type="text" class="form-control" id="p2_num" name="p2_num" placeholder="请输入线上P2故障数"/>
        </div>
        <div class="form-group">
            <label for="business_time">业务数据指标时间:</label>
            <input type="text" class="form-control" id="business_time" name="business_time" placeholder="请输入业务数据指标时间"/>
        </div>
        <div class="form-group">
            <label for="success_rate">数据指标成功率:</label>
            <input type="text" class="form-control" id="success_rate" name="success_rate" placeholder="请输入数据指标成功率"/>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">Add</button>
        </div>
    </form>
</div>

</body>

<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>