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
                    "contentType": "application/json"
                });
            }
            
            function test2(){
                var myArray = new Array();
                myArray[0] = "中国1";
                myArray[1] = "中国2";
                myArray[2] = "中国3";
                myArray[3] = "中国4";
                
                var jsonString = JSON.stringify(myArray);
                $.ajax({
                    "type": "post",
                    "url": "test2.spring?t=" + new Date().getTime(),
                    "data": jsonString,
                    "contentType": "application/json"
                });
            }
            
            function test3(){
                var myArray = new Array();
                myArray[0] = new Userinfo("中国1", "中国人1");
                myArray[1] = new Userinfo("中国2", "中国人2");
                myArray[2] = new Userinfo("中国3", "中国人3");
                myArray[3] = new Userinfo("中国4", "中国人4");
                
                
                var jsonString = JSON.stringify(myArray);
                $.ajax({
                    "type": "post",
                    "url": "test3.spring?t=" + new Date().getTime(),
                    "data": jsonString,
                    "contentType": "application/json"
                });
            }
            
            function test4(){
                var jsonObject = {
                    "username": "accp",
                    "work": [{
                        "address": "address1"
                    }, {
                        "address": "address2"
                    }],
                    "school": {
                        "name": "tc",
                        "address": "pjy"
                    }
                }
                
                var jsonString = JSON.stringify(jsonObject);
                $.ajax({
                    "type": "post",
                    "url": "test4.spring?t=" + new Date().getTime(),
                    "data": jsonString,
                    "contentType": "application/json"
                });
            }
            
            function test5(){
                var userinfo = {
                    "myArray": [{
                        "username1": "usernameValue11"
                    }, {
                        "username2": "usernameValue22"
                    }, ["abc", 123, true, [123, 456]]],
                    "myObject": {
                        "username": "大中国"
                    },
                    "myObject1": {
                        "address": [{
                            "name": "name1"
                        }, {
                            "name": "name2"
                        }]
                    },
                };
                
                var jsonString = JSON.stringify(userinfo);
                $.ajax({
                    "type": "post",
                    "url": "test5.spring?t=" + new Date().getTime(),
                    "data": jsonString,
                    "contentType": "application/json"
                });
            }
        </script>
    </head>
    <body>
        <input type="button" value="sendAjax1" onclick="javascript:test1()">
        <br/>
        <input type="button" value="sendAjax2" onclick="javascript:test2()">
        <br/>
        <input type="button" value="sendAjax3" onclick="javascript:test3()">
        <br/>
        <input type="button" value="sendAjax4" onclick="javascript:test4()">
        <br/>
        <input type="button" value="sendAjax5" onclick="javascript:test5()">
    </body>
</html>