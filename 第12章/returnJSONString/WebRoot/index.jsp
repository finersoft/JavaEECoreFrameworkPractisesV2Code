<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <script src="jquery-1.4.2.js">
        </script>
        <script>
            
            function test1(){
                $.ajax({
                    "type": "post",
                    "url": "test1.spring?t=" + new Date().getTime(),
                    "success": function(data){
                        var jsonObject = JSON.parse(data);
                        alert(jsonObject.username + " " + jsonObject.password);
                        
                        var listString = jsonObject.xxxx;
                        for (var i = 0; i < listString.length; i++) {
                            alert(listString[i]);
                        }
                        
                    }
                });
            }
        </script>
    </head>
    <body>
        <input type="button" value="sendAjax1" onclick="javascript:test1()">
    </body>
</html>