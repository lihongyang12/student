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
				<input type = "hidden" name = "sid" value="${student.sid }">
				<td>姓名：<input type="text" name="sname" value="${student.sname }">
				</td>
			</tr>
			<tr align="center">
				<td>年龄：<input type="text" name="sage" value="${student.sage }">
				</td>
			</tr>

			<tr align="center">
				<td>生日：<input type="text" name="birthday" value="${student.birthday }">
				</td>
			</tr>

			<tr align="center">
				<td>老师姓名：<select name="tid">
						<option>请选择</option>
						<c:forEach items="${tlist}" var="s">
							<option value="${s.tid}"
							<c:if test="${s.tid==studnet.tid}">selected</c:if>>
								${s.tname }</option>
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