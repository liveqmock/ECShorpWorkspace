<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="res" value="/resscmwebsns"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Scholar 404-error</title> 
	<link href="${res}/css/public.css" rel="stylesheet" type="text/css" />
	<link href="${res}/css/all.css" rel="stylesheet" type="text/css" />
	<link href="${res}/css/public.css" rel="stylesheet" type="text/css" />
	<link href="${res}/css/header.css" rel="stylesheet" type="text/css" />
	<link href="${res}/css/footer.css" rel="stylesheet" type="text/css" />
	<link href="${res}/css/page.css" rel="stylesheet" type="text/css" />
</head>

<body> 
<fmt:bundle basename="resource.jsp500Resource">  
  <div id="box_main">
		<div class="box_border" style="width:976px">
			<div class="wrongtext_box">
				<span class="font_24b"><fmt:message key="error.error404.pageNotExist"/></span><br /><br />
				 <fmt:message key="error.inputRightURLOrEmail"/><a href="mailto:support@scholarmate.com">support@scholarmate.com</a> <fmt:message key="error.linkUs"/><br />
				<fmt:message key="error.error404Click"/><a href="/"><fmt:message key="error.here"/></a><fmt:message key="error.backToHome"/>
			</div>
		</div> 
   </div> 
</fmt:bundle>

</body>
</html>