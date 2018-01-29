<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <script src="jquery-3.1.1.js">
        </script>
        <script src="index2.js">
        </script>
    </head>
    <body>
        <div>
            <input type="hidden" id="gotoPage" value="1"/>username:<input type="text" id="username"/>
            <br/>
            password:<input type="text" id="password"/>
            <br/>
            beginAge:<input type="text" id="beginAge"/>
            <br/>
            endAg:<input type="text" id="endAge" />
            <br/>
            beginDate:<input type="text" id="beginDate"/>
            <br/>
            endDate:<input type="text" id="endDate"/>
            <br/>
            <input type="button" value="查询" onclick="javascript:beginQuery()">
        </div>
        <br/>
        <div id="userinfoListTable">
        </div>
        <br/>
        <div>
            <a id="firstA">首页</a>__<a id="prevA">上一页</a>__<a id="nextA">下一页</a>__<a id="lastA">末页</a>__
            <select id="pageNumSelect" onchange="javascript:gotoPage(this.value)">
            </select>
        </div>
    </body>
</html>
