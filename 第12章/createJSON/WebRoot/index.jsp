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
            
            function test1(){
                var userinfo = new Userinfo("中国", "中国人");
                var jsonString = JSON.stringify(userinfo);
                $.ajax({
                    "type": "post",
                    "url": "test1.spring?t=" + new Date().getTime(),
                    "data": jsonString,
                    "contentType": "application/json",
                    "dataType": "json",
                    "success": function(data){
                        alert(data.username + " " + data.password);
                    }
                });
            }
        </script>
    </head>
    <body>
        <input type="button" value="sendAjax1" onclick="javascript:test1()">
    </body>
</html>