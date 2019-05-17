<%-- 
    Document   : Login
    Created on : 01-05-2019, 14:57:12
    Author     : shpattt
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/FOG/Logincss.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="login-box">

            <form action="CustomerServlet" method="get">
                <h1> Register </h1>
                <div class="textbox">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <input type="text" placeholder="Email" name="email" value="">
                </div>
                <div class="textbox">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                    <input type="password" placeholder="Password" name="pass" value="">
                </div>
                
                <div class="textbox">
                    <i class="fa fa-lock" aria-hidden="true"></i>
                    <input type="Retype password" placeholder="Retype Password" name="pass" value="">
                </div>
                <input class="btn" type="submit" name="" value="Register">

                <input type="hidden" name="from" value="login">
            </form>

        </div>
    </body>
</html>
