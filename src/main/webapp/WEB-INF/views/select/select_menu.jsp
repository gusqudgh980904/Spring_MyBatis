<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>

    <!-- bootstrap -->
    <link href="http://localhost/spring_mybatis/common/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery CDN(Contents Delivery Network) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <!-- bootstrap -->
<script src="http://localhost/spring_mybatis/common/bootstrap/js/bootstrap.min.js"></script>

<style type="text/css">

</style>
<script type="text/javascript">

</script>
</head>
<body>
<div>
<table border="1">
	<tr>
		<td><a href="select_menu.do?page=singleColumn">컬럼하나 행하나 조회</a></td>
		<td><a href="select_menu.do?page=multiColumn">컬럼여러개 행하나 조회</a></td>
		<td><a href="select_menu.do?page=scmr">컬럼하나 여러 행 조회</a></td>
		<td><a href="select_menu.do?page=mcmr">컬럼여러개 여러 행 조회</a></td>
		<td><a href="select_menu.do?page=salFrm">크다</a></td>
		<td><a href="select_menu.do?page=salFrm">작다</a></td>
		<td><a href="select_menu.do?page=subquery">subquery</a></td>
		<td><a href="select_menu.do?page=join">join</a></td>
		<td><a href="select_menu.do?page=subquery_join">join&subquery</a></td>
		<td><a href="select_menu.do?page=dynamicTable">동적인테이블명</a></td>
		<td><a href="select_menu.do?page=singleColumn">Dynamic Query</a></td>
	</tr>
</table>
</div>
<div>
<c:if test="${not empty param.page}">
<c:import url="/select/${param.page}.do"/>
</c:if>

</div>
</body>
</html>