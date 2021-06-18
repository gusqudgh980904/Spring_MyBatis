<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
<form action="select_menu.do">
<input type="hidden" name="page" value="greater_than"/>
<strong>연봉을 많이받는 사원조회</strong>
<label>연봉</label><input type="text" name="sal"/><br/>
<input type="submit" value="조회">
</form>


<form action="select_menu.do">
<input type="hidden" name="page" value="less_than"/>
<strong>연봉을 적게받는 사원조회</strong>
<label>연봉</label><input type="text" name="sal"/><br/>
<input type="submit" value="조회">
</form>
</div>