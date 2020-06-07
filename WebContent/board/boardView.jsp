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
    <script src="js/board.js"></script>
    <style>
        td {
            text-align: left !important;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <h2>게시글 상세보기</h2>
        
            <table>
                <tr>
                    <th>제목</th>
                    <td>${boardone.title }</td>
                </tr>
                <tr>
                    <th>작성자</th>
                    <td>${boardone.name }</td>
                </tr>
                <tr>
                    <th>작성시간</th>
                    <td>${boardone.writeDate }</td>
                </tr>
                <tr>
                    <th>조회수</th>
                    <td>${boardone.readCount }</td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><pre>${boardone.content }</pre></td>
                </tr>
            </table>
            <input class="btn" type="submit" value="새글 작성" onclick="location.href='BoardServlet?command=board_write_form'">
            <input class="btn" type="reset" value="글 수정" onclick="openWindow(${boardone.num})">
            <input class="btn" type="button" value="글 삭제" onclick="openWindow(${boardone.num})">
            <input class="btn" type="button" value="목록으로" onclick="location.href='BoardServlet?command=board_list'">
        
    </div>
</body>
</html>