<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<a>제목</a>
<input type="text" id="title" name="title" value="">

<a>내용</a>
<input type="text" id="content" name="content" value="">

<a>태그</a>
<input type="text" id="tag" name="tag" value="">
<button onclick="addTag()">추가</button>
<div id="tagList"></div>
<button onclick="save()">수정</button>



<%--<a>댓글</a>--%>
<%--<input type="text" name="comment" id="comment">--%>
<%--<button onclick="commentFn()">댓글달기</button>--%>

<%--<div id="commentList"></div>--%>

<script src="/resources/js/tmp3.js"></script>
<script>
    sn = '${sn}'
</script>
</body>
</html>
