<%--
  Created by IntelliJ IDEA.
  User: xuwentang
  Date: 2017/8/21
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
    <title>商品查询列表</title>
    <link rel="stylesheet" href="<%= path%>/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="<%= path%>/bootstrap/ccs/bootstrap-theme.css">
</head>
<body>

<div class="container">
    <form action="<%= path%>/item/queryItem" method="post">

        <p>查询条件：</p>
        <table class="table table-bordered">
            <tr>
                <td>
                    <input type="submit" value="查询" />
                </td>
            </tr>
        </table>

        <table class="table table-bordered">
            <tr>
                <td>商品名称</td>
                <td>商品价格</td>
                <td>生产日期</td>
                <td>商品描述</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${itemsList }" var="item">
                <tr>
                    <td>${item.name }</td>
                    <td>${item.price }</td>
                    <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>${item.detail }</td>
                    <td><a href="<%= path%>/item/editItem?id=${item.id}">修改</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>

<script type="text/javascript" src="<%= path%>/bootstrap/js/bootstrap.js"></script>
</body>
</html>
