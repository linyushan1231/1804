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
	<form action="update" method="post">
		<input type="hidden" name="mid" value="${meeting.mid}"><br>
		会议编号:<input type="text" name="code" value="${meeting.code}"><br>
		会议名称:<input type="text" name="name" value="${meeting.name}"><br>
		会议日期:<input type="date" name="start_time" value="${meeting.start_time}">至
				<input type="date" name="end_time" value="${meeting.end_time}"><br>
		会议类型:<select id="tname" name="tid" value="${meeting.tid}">
				<option value="1">月例会</option>
				<option value="2">学术发布</option>
				<option value="3">技术交流</option>
				</select><br>	
		<input type="submit" value="添加">
	</form>
</body>
</html>