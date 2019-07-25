<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/resources/inc/inc.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	function toadd(){
		location="toadd";
	}
	
	function del(sid){
		location="del?sid="+sid;
	}
	function toupdate(sid){
		location="toupdate?sid="+sid;
	}
</script>
<body>
	<table class="table table-bordered table-hover table-stripe table-condensed">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>生日</td>
			<td>老师编号</td>
			<td>老师姓名</td>
			<td>
				<button class="btn btn-primary btn-link" onclick="toadd()">添加</button>
			</td>
		</tr>
		
		<c:forEach items="${slist}" var="a" >
			<tr>
			<td>${a.sid }</td>
			<td>${a.sname }</td>
			<td>${a.sage }</td>
			<td>${a.birthday }</td>
			<td>${a.teacher.tid }</td>
			<td>${a.teacher.tname }</td>
			<td>
					<button type="button" class="btn btn-danger btn-lg" onclick="del('${a.sid}')">删除</button>
					<button type="button" class="btn btn-danger btn-lg" onclick="toupdate('${a.sid}')">修改</button>
			</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>