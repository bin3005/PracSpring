<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<table border="1">
		<colgroup>
			<col width="50"/>
			<col width="100"/>
			<col width="300"/>
			<col width="100"/>
		</colgroup>
		
		<tr>
			<th>NO</th>
			<th>WRITER</th>
			<th>TITLE</th>
			<th>DATE</th>
		</tr>
		<c:choose>
		<c:when test="${list == null }">
			<tr>
				<td colspan="4">----글이 없습니다.</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="dto" >
				<tr>
					<td>${dto.myno }</td>
					<td>${dto.myname }</td>
					<td><a href="detail.do?myno=${dto.myno }">${dto.mytitle }</a></td>
					<td>${dto.mydate }</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	<tr>
		<td colspan="4" align="right">
			<input type="button" value="글 작성" onclick="location.href='boardwriteform.do'">
			
		</td>
	</tr>
	</table>
	
</body>
</html>