<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--session = request.getSession();--%>
<%--String name = (String) session.getAttribute("name");--%>
<%--String credit = String.valueOf(session.getAttribute("credit"));--%>
<%--User user = (User) session.getAttribute("user");--%>
<%--%>--%>


<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="/CloudMusicSite/css/bootstrap.min.css"/>
    <link rel="shortcut icon" href="/img/icon/logo.ico">
    <style>
        body {
            padding-top: 80px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="index.html" class="navbar-brand">CloudMusicSite</a>
            </div>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="index.html">Home</a></li>
                <li><a href="activities.html">Activity</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href="test.html">Test</a></li>
            </ul>


            <ul class="nav navbar-nav navbar-right">
                <li><a href="<%
//                    if(
//                            user == null) {
//                        out.print("signIn.html");
//                    } else {
//                        out.print("SignOut.do");
//                    }
                %>"><%
                    //                    if (user == null) {
//                        out.print("Sign in");
//                    } else {
//                        out.print("Sign out");
//                    }
                %></a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right<%
//                    if(user != null) {
//                        out.print("hidden");
//                    }
                %>
            ">
                <li><a href="SignUp.html" class="<%
//                    if(user != null) {
//                        out.print("hidden");
//                    }
                %>">Sign up</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right<%
//                    if(user == null) {
//                        out.print("hidden");
//                    }
                %>
            ">
                <li><a class="<%
//                    if(user == null) {
//                        out.print("hidden");
//                    }
                %>"><%
                    //                    out.print(name + ",You have " + credit + " credit");
                %>
                </a></li>
            </ul>


        </div><!--/.nav-collapse -->
    </div>
</nav>
</body>
</html>
