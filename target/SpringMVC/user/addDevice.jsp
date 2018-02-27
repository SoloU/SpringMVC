<%--
  Created by IntelliJ IDEA.
  User: Vesper
  Date: 2017/9/13
  Time: 下午3:11
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
    <title>添加新设备</title>

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
    <h1>添加新设备</h1>
    <hr/>

    <form action="addDevice" method="post">
        <div class="form-group">
            <label for="brand">品牌:</label>
            <input type="text" class="form-control" id="brand" name="brand" placeholder="Enter brand"/>
        </div>
        <div class="form-group">
            <label for="model">型号:</label>
            <input type="text" class="form-control" id="model" name="model" placeholder="Enter model:"/>
        </div>
        <div class="form-group">
            <label for="dpi">DPI:</label>
            <input type="text" class="form-control" id="dpi" name="dpi" placeholder="Enter dpi:"/>
        </div>
        <div class="form-group">
            <label for="RAM">RAM:</label>
            <input type="text" class="form-control" id="RAM" name="RAM" placeholder="Enter RAM:"/>
        </div>
        <div class="form-group">
            <label for="CPU">CPU:</label>
            <input type="text" class="form-control" id="CPU" name="CPU" placeholder="Enter CPU:"/>
        </div>
        <div class="form-group">
            <label for="version">系统版本号:</label>
            <input type="text" class="form-control" id="version" name="version" placeholder="Enter version:"/>
        </div>
        <div class="form-group">
            <label for="owner">借用人:</label>
            <input type="text" class="form-control" id="owner" name="owner" placeholder="Enter owner:"/>
        </div>
        <div class="form-group">
            <label for="date">入库日期:</label>
            <input type="text" class="Wdate" id="date" name="date" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'%y-%M-%d',maxDate:'%y-%M-%ld'})"/>
        </div>
        <div class="form-group">
            <label for="department">所属部门:</label>
            <input type="text" class="form-control" id="department" name="department" placeholder="Enter department:"/>
        </div>
        <div class="form-group">
            <label for="location">Base:</label>
            <input type="text" class="form-control" id="location" name="location" placeholder="Enter Base:"/>
        </div>
        <div class="form-group">
            <label for="note">备注:</label>
            <input type="text" class="form-control" id="note" name="note" placeholder="Enter note:"/>
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
<script src="js/My97DatePicker/WdatePicker.js"></script>
</html>
