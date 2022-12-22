<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="/tmpInsert">글쓰기</a>
    <div>
        <table>
            <thead>
                <td>제목</td>
            </thead>
            <tbody id="content">

            </tbody>
        </table>
    </div>
    <script src="/resources/js/tmp.js"></script>
</body>
</html>
