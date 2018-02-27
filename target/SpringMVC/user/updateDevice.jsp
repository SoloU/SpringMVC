<%--
  Created by IntelliJ IDEA.
  User: Vesper
  Date: 2017/9/13
  Time: 下午3:09
  To change this template use File | Settings | File Templates.
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
    <title>修改设备信息</title>

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
    <h1>修改设备信息</h1>
    <hr />

    <form action="updateDevice" method="post">
        <div class="form-group">
            <label for="id">ID:</label>
            <input type="text" class="form-control" id="id" disabled value="${device.id }" />
            <input type="hidden" name="id" value="${device.id }">
        </div>
        <div class="form-group">
            <label for="brand">品牌:</label>
            <input type="text" class="form-control" id="brand" name="brand" value="${device.brand }" />
        </div>
        <div class="form-group">
            <label for="model">型号:</label>
            <input type="text" class="form-control" id="model" name="model" value="${device.model }" />
        </div>
        <div class="form-group">
            <label for="dpi">DPI:</label>
            <input type="text" class="form-control" id="dpi" name="dpi" value="${device.dpi }" />
        </div>
        <div class="form-group">
            <label for="RAM">RAM:</label>
            <input type="text" class="form-control" id="RAM" name="RAM" value="${device.RAM }" />
        </div>
        <div class="form-group">
            <label for="CPU">型号:</label>
            <input type="text" class="form-control" id="CPU" name="CPU" value="${device.CPU }" />
        </div>
        <div class="form-group">
            <label for="version">系统版本号:</label>
            <input type="text" class="form-control" id="version" name="version" value="${device.version }" />
        </div>
        <div class="form-group">
            <label for="owner">借用人:</label>
            <input type="text" class="form-control" id="owner" name="owner" value="${device.owner }" />
        </div>
        <div class="form-group">
            <label for="date">入库时间:</label>
            <input type="text" class="form-control" id="date" name="date" value="${device.date }" />
        </div>
        <div class="form-group">
            <label for="department">所属部门:</label>
            <input type="text" class="form-control" id="department" name="department" value="${device.department }" />
        </div>
        <div class="form-group">
            <label for="location">Base:</label>
            <input type="text" class="form-control" id="location" name="location" value="${device.location }" />
        </div>
        <div class="form-group">
            <label for="note">备注:</label>
            <input type="text" class="form-control" id="note" name="note" value="${device.note }" />
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">更新</button>
            <a href="deviceManage" type="button" class="btn btn-sm btn-success">返回</a>
        </div>
    </form>
</div>

</body>
<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/My97DatePicker/WdatePicker.js"></script>
</html>
