<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <script type="text/javascript">
            function gotoPage(gotoPageValue){
                document.getElementById("gotoPageHidden").value = gotoPageValue;
                document.getElementById("myform").submit();
            }
        </script>
    </head>
    <body>
        <form id="myform" action="test" method="get">
            <input type="hidden" id="gotoPageHidden" name="gotoPage"/>username:<input type="text" name="username" value="${pageEntity.queryUIParamMap.username}"/>
            <br/>
            password:<input type="text" name="password" value="${pageEntity.queryUIParamMap.password}"/>
            <br/>
            beginAge:<input type="text" name="beginAge" value="${pageEntity.queryUIParamMap.beginAge}"/>
            <br/>
            endAg:<input type="text" name="endAge" value="${pageEntity.queryUIParamMap.endAge}"/>
            <br/>
            beginDate:<input type="text" name="beginDate" value="${pageEntity.queryUIParamMap.beginDate}"/>
            <br/>
            endDate:<input type="text" name="endDate" value="${pageEntity.queryUIParamMap.endDate}"/>
            <br/>
            <input type="submit" value="submit">
            <br/>
        </form>
        <br/>
        <c:forEach var="eachUserinfo" items="${pageEntity.pageDataList}">
            ${eachUserinfo.id}__
            ${eachUserinfo.username}__
            ${eachUserinfo.password}__
            ${eachUserinfo.age}__
            ${eachUserinfo.insertdate}
            <br/>
        </c:forEach>
        <br/>
        <div>
            <a href="javascript:gotoPage(${pageEntity.gotoPageMap.first})">首页</a>__<a href="javascript:gotoPage(${pageEntity.gotoPageMap.prev})">上一页</a>__<a href="javascript:gotoPage(${pageEntity.gotoPageMap.next})">下一页</a>__<a href="javascript:gotoPage(${pageEntity.gotoPageMap.last})">末页</a>__
            <select onchange="javascript:gotoPage(this.value)">
                <c:forEach var="eachPageNum" items="${pageEntity.gotoPageMap.pageNumList}">
                    <c:if test="${param.gotoPage==eachPageNum}">
                        <option value="${eachPageNum}" selected="selected">${eachPageNum}</option>
                    </c:if>
                    <c:if test="${param.gotoPage!=eachPageNum}">
                        <option value="${eachPageNum}">${eachPageNum}</option>
                    </c:if>
                </c:forEach>
            </select>
        </div>
    </body>
</html>
