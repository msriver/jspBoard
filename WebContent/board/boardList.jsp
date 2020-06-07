<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/board.css">
</head>
<body>
    <div id="wrap">
    	<h2>게시글 리스트</h2>
    	<table>
    		<tr>
    			<td colspan="5" style="border:white;text-align:right;"><a href="BoardServlet?command=board_write_form">글 작성하기</a></td>
    		</tr>
    		<tr>
    			<th>글번호</th>
    			<th>글제목</th>
    			<th>작성자</th>
    			<th>작성날짜</th>
    			<th>조회수</th>
    		</tr>
			<c:forEach var="posting" items="${list }">
				<tr>
					<td>${posting.num }</td>
					<td><a href="BoardServlet?command=board_view&num=${posting.num }">${posting.title }</a></td>
					<td>${posting.name }</td>
					<td>${posting.writeDate }</td>
					<td>${posting.readCount }</td>
				</tr>
			</c:forEach>
    	</table>
    </div>
</body>
</html>