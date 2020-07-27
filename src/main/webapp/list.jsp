<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
	<table>
		<tr>
			<td colspan="10">
				<a href="add.jsp">添加</a>
			</td>
		</tr>
		<tr>
			<th>序号</th>
			<th>会议编号</th>
			<th>会议名称</th>
			<th>开始日期</th>
			<th>结束日期</th>
			<th>会议类型</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${glist.list}" var="s">
			<tr>
				<td>${s.mid}</td>
				<td>${s.code}</td>
				<td>${s.name}</td>
				<td>${s.start_time}</td>
				<td>${s.end_time}</td>
				<td>${s.tname}</td>
				<td>${s.creat_time}</td>
				<td><a href="selOne?mid=${s.mid}">修改</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				第${glist.pageNum}/${glist.pages}页
				<a href="list?pageNum=${glist.firstPage}">首页</a>
				<a href="list?pageNum=${glist.prePage}">上一页</a>
				<a href="list?pageNum=${glist.nextPage}">下一页</a>
				<a href="list?pageNum=${glist.pages}">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>