<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <script src="jquery-1.4.2.js">
        </script>
        <script>
            function Userinfo(username, password){
                this.username = username;
                this.password = password;
            }
            
            function sendAjax(){
                var userinfo = new Userinfo("中国", "中国人");
                var jsonString = JSON.stringify(userinfo);
                $.post("test.spring?t=" + new Date().getTime(), {
                    "jsonString": jsonString
                });
            }
        </script>
    </head>
    <body>
        <input type="button" value="sendAjax" onclick="javascript:sendAjax()">
    </body>
</html>