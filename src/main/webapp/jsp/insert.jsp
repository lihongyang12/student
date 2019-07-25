<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/inc/inc.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		<table class="table table-striped table-bordered table-hover">
			<tr align="center">
				<td>姓名：<input type="text" name="sname">
				</td>
			</tr>
			<tr align="center">
				<td>年龄：<input type="text" name="sage">
				</td>
			</tr>

			<tr align="center">
				<td>生日：<input type="text" name="birthday">
				</td>
			</tr>

			<tr align="center">
				<td>老师姓名：<select name="teacher.tid">
						<option>请选择</option>
						<c:forEach items="${tlist}" var="s">
							<option value="${s.tid}">${s.tname }</option>
						</c:forEach>
				</select>
				</td>
			</tr>

			<tr align="center">
				<td>
					<input type="submit" value="提交"> 
					<input type="reset" value="重置">
				</td>
			</tr>
		</form>
		</table>
</body>
</html>