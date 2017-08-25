<%--
  Created by IntelliJ IDEA.
  User: Chao.Cui.VWED
  Date: 2017/8/5
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>用户信息列表</title>
</head>
<body>
<c:if test="${!empty measureDataList}">
  <c:forEach var="measureData" items="${measureDataList}">
    姓名：${measureData.PartNumber} &nbsp;&nbsp;手机号：${measureData.Station} &nbsp;&nbsp;邮箱：${user.Variety} &nbsp;&nbsp;<br>
  </c:forEach>
</c:if>
</body>
</html>
