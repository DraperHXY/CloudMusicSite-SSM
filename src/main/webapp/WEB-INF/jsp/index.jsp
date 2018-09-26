<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to CloudMusicSite</title>
    <link rel="shortcut icon" href="/CloudMusicSite/img/icon/logo.ico">
</head>
<body>

<%@ include file="header.jsp" %>

<c:forEach items="${musicInfoList}" var="list">

    <div class="container">

        <div class="jumbotron">
            <div class="row">
                <div class="col-xs-6 col-md-3 col-xs-push-6 col-md-push-9">
                    <div class="thumbnail" style="padding: 0px; margin: 0px;">
                        <img src="${list.imageAddress}" alt="..."/>
                    </div>
                </div>
                <div class="col-xs-6 col-md-9 col-xs-pull-6 col-md-pull-3">
                    <p class="h1">${list.name}</p>
                    <p class="h4">${list.singer}</p>
                    <a href="/download/music/${list.name}">Download</a>
                </div>
            </div>
        </div>

    </div>
</c:forEach>

<%@include file="footer.jsp" %>

</body>
</html>