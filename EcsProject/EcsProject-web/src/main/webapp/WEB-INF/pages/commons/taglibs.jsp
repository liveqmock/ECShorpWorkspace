<%@page pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%-- ctx context path --%>
<c:set var="ctx" value="${rc.getContextPath()}" />
<c:set var="res" value="http://static.ecshop/" />
<script type="text/javascript">
	var res="${res}";
	var ctx="${ctx}";
</script>
