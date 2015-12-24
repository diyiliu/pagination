<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.pagination.css">
    <title>分页</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    </thead>
    <tbody id="tbody"></tbody>
</table>

<div id="page" class="m-pagination"></div>
<!-- Javascripts -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.pagination-1.2.7.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jsrender.min.js"></script>

<script id="trTmpl" type="text/x-jsrender">
    <tr>
       <td>{{:ID}}</td>
       <td>{{:NAME}}</td>
       <td>{{:AGE}}</td>
    </tr>
</script>

<script type="text/javascript">
    $("#page").page({
        pageSize: 2,
        pageBtnCount: 7,
        remote: {
            url: '${pageContext.request.contextPath}/user/paging.htm',
            params: {query: "test"},
            success: function (result, pageIndex) {
                console.log(result);
                $("#eventLog3").append(' remote callback : ' + result);
                //绑定数据
                $("#tbody").empty().html($("#trTmpl").render(result.data));
            }
        }
    }).on("pageClicked", function (event, pageIndex) {
        $("#eventLog").append('EventName = pageClicked , pageIndex = ' + pageIndex + '');
    });
</script>
</body>
</html>
