<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	var what = "${param.what}";
		if(what=="update") {
			window.opener.location.href="BoardServlet?command=board_update_form&num="+${param.num};
		} else if(what=="delete"){
			alert('삭제되었습니다');
			window.opener.location.href="BoardServlet?command=board_delete&num="+${param.num};
		}
		window.close();
	</script>
</body>
</html>