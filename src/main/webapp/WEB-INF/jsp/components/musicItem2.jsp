<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Music Item</title>
</head>
<body>
<div class="container">

    <div class="jumbotron">
        <div class="row">
            <div class="col-xs-6 col-md-3 col-xs-push-6 col-md-push-9">
                <div class="thumbnail" style="padding: 0px; margin: 0px;">
                    <img src="${musicInfoList[0].imageAddress}" alt="...">
                </div>
            </div>
            <div class="col-xs-6 col-md-9 col-xs-pull-6 col-md-pull-3">
                <p class="h1">${musicInfoList[0].name}</p>
                <p class="h4">${musicInfoList[0].singer}</p>
                <a href="<%
//                        music = musicInfoList.get(0);
//                        out.print("downloadMusic.html?musicName=" + music.getSongName());
//                        musicInfoList.remove(0);
//                    }
                %>">Download</a>
            </div>
        </div>
    </div>

</div>
</body>
</html>
