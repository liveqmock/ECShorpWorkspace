<!DOCTYPE html >
<html>
<head>
<script type="text/javascript"  src="${rc.getContextPath()}/resources/common/js/jquery-1.6.2.min.js" ></script>
<script type="text/javascript"  src="${rc.getContextPath()}/resources/common/js/jquery_form.js" defer="defer"></script>
<#include "/common/commoncss.ftl">
<title>走秀网后台评论管理系统</title>
</head>
<frameset rows="58,*" cols="*" frameborder="no" border="0" framespacing="0">
	<frame src="${rc.getContextPath()}/admin/menu/menu_top" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" title="topFrame"/>
	<frameset cols="180,*" frameborder="no" border="0" framespacing="0">
		<frame src="${rc.getContextPath()}/admin/menu/menu_left" name="leftFrame" scrolling="auto" noresize="noresize" id="leftFrame" title="leftFrame" />
		<frameset cols="10,*" frameborder="no" border="0" framespacing="0">
			<frame src="${rc.getContextPath()}/admin/menu/menu_center" name="centerFrame" scrolling="no" id="centerFrame" title="centerFrame" />
			<frameset rows="*,26" cols="*" frameborder="no" border="0" framespacing="0">
				<frame src="${rc.getContextPath()}/admin/menu/menu_main" name="mainFrame" id="mainFrame" title="mainFrame" />
				<frame src="${rc.getContextPath()}/admin/menu/menu_bottom" name="bottomFrame" scrolling="no" id="bottomFrame" title="bottomFrame" />
			</frameset>
		</frameset>
	</frameset>
</frameset>
<body>
</body>
</html>