<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
  <div align="center">
		<form action="${pageContext.request.contextPath}/login.do"
			method="post">
			<table>
				<tr>
					<td>用户名:</td>
					<td><input name="username" /></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input name="password" /></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input type="submit" value="登入" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>