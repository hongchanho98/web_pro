<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>


<%@ include file="/inc/asset.jsp"%>

<style>
</style>
</head>
<body>
	<!-- ex10_pagecontext_two.jsp -->
	<div class="container">
		<h1 class="page-header">두번쨰 페이지</h1>
		
		<div>num: <%=request.getParameter("num") %></div>
		
		<%-- <div>num2: <%=request.getParameter("num2") %></div> --%>
		
		<div>num2: <%=request.getAttribute("num2") %></div>
		
	</div>

	<script>
		
	</script>
</body>
</html>













