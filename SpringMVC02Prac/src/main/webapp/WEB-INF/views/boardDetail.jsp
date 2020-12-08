<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>WRITER</th>
			<td>${dto.myno }</td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows="10" cols="60" readonly="readonly">  ${dto.mycontent }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
					<input type="button" value="수정" onclick="location.href='boardUpdateForm.do?myno=${dto.myno}'">
					<input type="button" value="삭제" onclick="location.href='boardDelete.do?myno=${dto.myno}'">
					<input type="button" value="목록" onclick="location.href='list.do'">
			</td>
		</tr>
	
	</table>
	
</body>
</html>