<%--
  Created by IntelliJ IDEA.
  User: zmzy
  Date: 2016/12/5
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="resources/jquery-easyui-1.5/themes/default/easyui.css">
    <script src="resources/jquery-easyui-1.5/jquery.min.js"></script>
    <script src="resources/jquery-easyui-1.5/jquery.easyui.min.js"></script>
</head>
<body>
<h2>DataGrid显示数据</h2>
<table class="easyui-datagrid" title="用户列表" style="width:700px;height:250px"
       data-options="singleSelect:true,collapsible:true,url:'http://localhost:10086/user/list?json',method:'get',pagination:true,
				pageSize:10">
    <thead>
    <tr>
        <th data-options="field:'id',width:80">编号</th>
        <th data-options="field:'nickname',width:100">昵称</th>
    </tr>
    </thead>
</table>
</body>
</html>
