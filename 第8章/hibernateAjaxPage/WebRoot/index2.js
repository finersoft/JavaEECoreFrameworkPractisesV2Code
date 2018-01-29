$(document).ready(function(){
    $("#gotoPage").val(1);
    
    var pageEntity = getUserinfoPageJSON();
    
    initUserinfoListTable(pageEntity);
    initGotoPageA(pageEntity);
    initSelectDrop(pageEntity);
});


function QueryEntity(username, password, beginAge, endAge, beginDate, endDate, gotoPage){
    this.username = username;
    this.password = password;
    this.beginAge = beginAge;
    this.endAge = endAge;
    this.beginDate = beginDate;
    this.endDate = endDate;
    this.gotoPage = gotoPage;
}

function getPageEntityAJAX(queryEntity){
    var returnJSONString = $.ajax({
        "url": "test?t=" + new Date().getTime(),
        "type": "post",
        "async": false,
        "data": {
            "username": queryEntity.username,
            "password": queryEntity.password,
            "beginAge": queryEntity.beginAge,
            "endAge": queryEntity.endAge,
            "beginDate": queryEntity.beginDate,
            "endDate": queryEntity.endDate,
            "gotoPage": queryEntity.gotoPage
        }
    }).responseText;
    return returnJSONString;
}

function getUserinfoPageJSON(){
    var username = $("#username").val();
    var password = $("#password").val();
    var beginAge = $("#beginAge").val();
    var endAge = $("#endAge").val();
    var beginDate = $("#beginDate").val();
    var endDate = $("#endDate").val();
    var gotoPage = $("#gotoPage").val();
    
    var queryEntity = new QueryEntity(username, password, beginAge, endAge, beginDate, endDate, gotoPage);
    
    var returnJSONString = getPageEntityAJAX(queryEntity);
    var jsonObject = JSON.parse(returnJSONString);
    return jsonObject;
}

function initGotoPageA(pageEntity){
    var gotoPageMap = pageEntity.gotoPageMap;
    var first = gotoPageMap.first;
    var prev = gotoPageMap.prev;
    var next = gotoPageMap.next;
    var last = gotoPageMap.last;
    
    $("#firstA").attr("href", "javascript:gotoPage(" + first + ")");
    $("#prevA").attr("href", "javascript:gotoPage(" + prev + ")");
    $("#nextA").attr("href", "javascript:gotoPage(" + next + ")");
    $("#lastA").attr("href", "javascript:gotoPage(" + last + ")");
    
}

function initSelectDrop(pageEntity){
    var username = $("#username").val();
    var password = $("#password").val();
    var beginAge = $("#beginAge").val();
    var endAge = $("#endAge").val();
    var beginDate = $("#beginDate").val();
    var endDate = $("#endDate").val();
    var gotoPage = $("#gotoPage").val();
    
    var pageNumList = pageEntity.gotoPageMap.pageNumList;
    
    for (var i = 0; i < pageNumList.length; i++) {
        var eachPageNum = pageNumList[i];
        var newOption = $("<option></option>");
        $(newOption).val(eachPageNum);
        $(newOption).text(eachPageNum);
        
        $("#pageNumSelect").append(newOption);
    }
    
}

function initUserinfoListTable(pageEntity){
    var userinfoList = pageEntity.pageDataList;
    for (var i = 0; i < userinfoList.length; i++) {
        var eachUserinfo = userinfoList[i];
        var id = eachUserinfo.id;
        var username = eachUserinfo.username;
        var password = eachUserinfo.password;
        var age = eachUserinfo.age;
        var insertdate = eachUserinfo.insertdate;
        
        var rowString = id + "__" + username + "__" + password + "__" + age + "__" + insertdate;
        
        $("#userinfoListTable").append(rowString);
        $("#userinfoListTable").append("<br/>");
    }
}

function beginQuery(){
    $("#userinfoListTable").text("");
    $("#gotoPage").val(1);
    $("#pageNumSelect").empty();
    
    var pageEntity = getUserinfoPageJSON();
    initUserinfoListTable(pageEntity);
    initGotoPageA(pageEntity);
    initSelectDrop(pageEntity);
}

function gotoPage(gotoPageValue){
    $("#userinfoListTable").text("");
    $("#gotoPage").val(gotoPageValue);
    
    var pageEntity = getUserinfoPageJSON();
    
    initUserinfoListTable(pageEntity);
    initGotoPageA(pageEntity);
    $("#pageNumSelect").val(gotoPageValue);
}
