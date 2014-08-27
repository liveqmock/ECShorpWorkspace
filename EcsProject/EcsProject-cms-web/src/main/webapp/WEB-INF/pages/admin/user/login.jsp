<%@page pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/commons-jsp/taglibs.jsp"%>
<html>
	<head>
	<%@include file="/WEB-INF/pages/commons-jsp/head.jsp" %>
		<link href="${res}/static/css/wy/login.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div id="loginBlock" class="login tab-1">
			<div class="loginForm" style="padding:80px 0px 0px 0px;">
				<form id="loginForm" name="loginForm" method="POST" action="${ctx}/login" autocomplete="off" onsubmit="return submitLogin();">
					<input type="hidden" name="loginType" id="loginType" value=""/>
					<input type="hidden" name="serviceUrl" id="serviceUrl" value="${serviceUrl}"/>
					<div id="accInputLine" class="loginFormIpt showPlaceholder showPlaceholder showPlaceholder">
						<b class="ico ico-uid"></b>
						<input class="loginFormTdIpt" tabindex="1" title="请输入帐号" id="accountInput" name="userName" type="text" maxlength="50" value="${userName}" style="width:205px;">
						<div id="mobtips" style="display:;"></div>
						<label for="accountInput" class="placeholder" id="accPlaceholder">邮箱帐号或手机号</label>
					</div>
					<div id="pwdInputLine" class="loginFormIpt showPlaceholder showPlaceholder showPlaceholder">
						<b class="ico ico-pwd"></b>
						<input class="loginFormTdIpt" tabindex="2" title="请输入密码" id="pwdInput" name="password" type="password">
						<label for="pwdInput" class="placeholder" id="pwdPlaceholder">密码</label>
					</div>
					<div class="loginFormCheck">
						<!--div id="lfAutoLogin" class="loginFormCheckInner">
							<b class="ico ico-checkbox"></b>
							<label id="remAutoLoginTxt" for="remAutoLogin">
								<input tabindex="3" title="十天内免登录" class="loginFormCbx" type="checkbox" id="remAutoLogin">
								十天内免登录</label>
							<div id="whatAutologinTip">为了您的信息安全，请不要在网吧或公用电脑上使用此功能！
							</div>
						</div-->
						<div class="forgetPwdLine">						
							<a class="forgetPwd" href="${ctx}/retakePassword?from=login" target="_blank" title="找回密码">忘记密码了?</a>
						</div>

					</div>
					<div class="loginFormBtn">
						<button id="loginBtn" class="btn btn-login formSubmit" tabindex="6" type="submit">登&nbsp;&nbsp;录</button>
						<a id="lfBtnReg" class="btn btn-reg" href="${ctx}/reg?from=login" target="_blank" tabindex="7">注&nbsp;&nbsp;册</a>
					</div>
				</form>
			</div>
		</div>
	<script type="text/javascript" src="${res}/static/js/vutils.js"></script>	
	<script type="text/javascript" src="${res}/static/js/login.js"></script>	
	</body>
</html>