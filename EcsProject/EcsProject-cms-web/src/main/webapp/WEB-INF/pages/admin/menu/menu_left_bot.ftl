<!DOCTYPE html >
<html>
<head>
<#include "/common/commoncss.ftl">
<script type="text/javascript">
	$(document).ready(function() {
		$(".list").hide();
		$("h3.trigger").toggle(function() {
			$(this).addClass("sole");
		}, function() {
			$(this).removeClass("sole");
		});
		$("h3.trigger").click(function() {
			$(this).next(".list").slideToggle("slow,");
		});
	});
</script>
</head>
<body>
<body>
<div class="adminLeft">
    <#if menulist??>
     <#list menulist as menu>
          <h3 class="trigger">${menu.menuName!''}</h3>
          <#if menu.mlist??>
          <ul class="list">
                <#list menu.mlist as _menu>
                   <li><a href="${rc.getContextPath()}${_menu.menuUrl!''}" target="mainFrame">${_menu.menuName!''}</a></li>
                </#list>
          </ul>
          </#if>
        </#list>
    </#if>    
</div>
</body>
</html>