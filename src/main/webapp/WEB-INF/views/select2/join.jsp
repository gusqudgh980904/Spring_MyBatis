<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<div>
전체게시물의 수:<c:out value="${totalCnt}"/><br/>
한 화면의 보여줄 게시물의 수:<c:out value="${pageScale}"/>건<br/>
총 페이지 수:<c:out value="${totalPage}"/>개<br/>
시작번호:<c:out value="${startNum}"/><br/>
끝번호:<c:out value="${endNum}"/><br/>

<div>
<table class="table">
	<thead>
		<tr>
			<th style="width:50px">번호</th>
			<th style="width:120px">부서번호</th>
			<th style="width:400px">부서명</th>
			<th style="width:100px">지역</th>
			<th style="width:150px">사원번호</th>
			<th style="width:150px">사원명</th>
			<th style="width:150px">업무</th>
			<th style="width:150px">연봉</th>
			<th style="width:150px">입사일</th>
		</tr>
	</thead>
	<tbody>
		<c:if test="${empty empList}">
		<tr>
		<td colspan="9">사원정보가 존재하지 않습니다</td>
		</tr>
		</c:if>
	<c:forEach var="jd" items="${empList}">
	<c:set var="i" value="${i+1}"/>
		<tr>
			<td><c:out value="${i}"/></td>
			<td><c:out value="${jd.deptno}"/></td>
			<td><c:out value="${jd.dname}"/></td>
			<td><c:out value="${jd.loc}"/></td>
			<td><c:out value="${jd.empno}"/></td>
			<td><c:out value="${jd.ename}"/></td>
			<td><c:out value="${jd.job}"/></td>
			<td><c:out value="${jd.sal}"/></td>
			<td><c:out value="${jd.hiredate}"/></td>
		</tr>
	</c:forEach>
	</tbody>

</table>

</div>


<div>
	<c:forEach var="pageNum" begin="1" end="${totalPage}" step="1">
	[<a href="http://localhost/spring_mybatis/select/select_menu.do?page=subquery&currentPage=${pageNum}"><c:out value="${pageNum}"/></a>]
	</c:forEach>
</div>



</div>