<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
var XEC = new Object();
XEC.constants={
	<c:forEach items="${constantsMap}" var="item">
	${item.key}:"${item.value}",
	</c:forEach>
	blankErroCode:''
}