<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/jquery.pagination.css">
  <title>pagination</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/pagination.jsp">动态分页</a>
<div id="page1" class="m-pagination"></div>

<!-- Javascripts -->
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/jquery.pagination-1.2.7.min.js"></script>

<script type="text/javascript">
  $("#page1").page({pageSize: 1, total: 11});
</script>
</body>
</html>
