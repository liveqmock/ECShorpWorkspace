<%@page pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/commons-jsp/taglibs.jsp"%>
<html>
	<head>
		<%@include file="/WEB-INF/pages/commons-jsp/head.jsp" %>
		<link href="${res}/static/css/wy/style.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
	<section class="content" id="mainSection">
	<div id="mMaskD" class="mainBody-wp">
		<header>
			页头
		</header>
		<form:form action="${ctx}/reg" method="post" name="registerForm"  id="registerForm" modelAttribute="registerForm">
			<form:input type="hidden" name="regType"  id="regType" value="" path="regType"/>
			<form:errors path="vcode"></form:errors>
			<div id="mMaskD" class="mainBody-wp">
				<div class="mainBody">
					<noscript>
						<div class="tips-big">
							<b class="ico ico-warn-big"></b>
							您的浏览器禁止使用JS，无法正常注册，请<a href="http://help.163.com/09/1216/16/5QLUL0H500753VB8.html" target="_blank">根据提示解除限制</a>后再注册。
						</div>
					</noscript>
					<div id="regMain" class="regForm">
						<dl id="nameDl" class="regForm-item mainBody-hasFocus-focusArea">
							<dt class="regForm-item-tit"><span class="txt-impt">*</span>帐号：</dt>
							<dd class="regForm-item-ct">
								<form:input path="regName" id="regName" name="regName" type="text" class="ipt norWidthIpt" style="ime-mode:disabled;color:#999;font-weight:normal" autocomplete="off" value="${regForm.regName}"/>
								<div id="nameTips" class="tips">
									<span class="txt-tips"></span>
								</div>
							</dd>
						</dl>
						<dl id="mainPwdDl" class="regForm-item">
							<dt class="regForm-item-tit"><span class="txt-impt">*</span>密码：</dt>
							<dd class="regForm-item-ct">
								<form:input path="mainPwd" id="mainPwd" name="mainPwd" type="password" class="ipt norWidthIpt" style="ime-mode:disabled"/>
								<div id="mainPwdTips" class="tips" style="position:relative">
									<div id="mainPwdStatus" class="pswState pswState-poor" style="display:none;">
										<span class="s1">弱</span>
										<span class="s2">中等</span>
										<span class="s3">强</span>
									</div>
									<span class="txt-tips"></span>
								</div>
							</dd>
						</dl>
						<dl id="mainCfmPwdDl" class="regForm-item">
							<dt class="regForm-item-tit"><span class="txt-impt">*</span>确认密码：</dt>
							<dd class="regForm-item-ct">
								<form:input path="mainCfmPwd" id="mainCfmPwd" disabled="disabled" name="mainCfmPwd" type="password" class="ipt norWidthIpt" style="ime-mode:disabled"/>
								<div id="mainCfmPwdTips" class="tips">
									<span class="txt-tips"></span>
								</div>
							</dd>
						</dl>
						<dl id="vcodeMobile" class="regForm-item vCodeArea" style="display:none">
							<dt class="regForm-item-tit"><span class="txt-impt">*</span>手机验证码：</dt>
							<dd class="regForm-item-ct">
								<form:input path="vcodeMobile" id="vcodeMobile" name="vcodeMobile" type="text" class="ipt" autocomplete="off"/>
								<div class="btns">
									<a id="sendAcodeBtn" href="javascript:void(0);" class="btn" hidefocus="true"><strong id="sendAcodeStg">免费获取验证码</strong></a>
									<span id="acodeSentSpan" class="txt-succ" style="display:none;">&nbsp;&nbsp;短信验证码已发送</span>
									<div id="vcodeMobileTips" class="tips">
										<span class="txt-tips">请填写图片中的字符，不区分大小写</span>
									</div>
								</div>
							</dd>
						</dl>
						<dl id="vcodeDl" class="regForm-item vCodeArea">
							<dt class="regForm-item-tit"><span class="txt-impt">*</span>验证码：</dt>
							<dd class="regForm-item-ct">
								<form:input path="vcode" id="vcodeIpt" name="vcode" type="text" class="ipt" maxlength="4" autocomplete="off"/>
								<img id="vcodeImg" class="vCode" style="cursor:pointer;" src="" alt="验证码"><a id="vcodeA" href="javascript:void(0);" class="switchvCode" tabindex="-1">看不清楚？换张图片</a>
								<div id="vcodeTips" class="tips">
									<span class="txt-tips">请填写图片中的字符，不区分大小写</span>
								</div>
							</dd>
						</dl>
						<dl class="regForm-item">
							<dd class="regForm-item-ct">
								<a id="mainRegA" href="javascript:void(0);" class="btnReg" >同意协议并注册</a>
								<a id="mainRegA_d" href="javascript:void(0);" class="btnRegDisable"  style="display:none">同意协议并注册</a>
							</dd>
						</dl>
						<dl id="mainAcceptDl" class="regForm-item">
							<dd class="regForm-item-ct txt-tips">
								<label></label><a>服务条款</a>
								<div id="mainAcceptTips"></div>
							</dd>
						</dl>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			
		</form:form>
	<footer>
		页尾
	</footer>
	</div>
	</section>
	<script type="text/javascript" src="${res}/static/js/vutils.js"></script>
	<script type="text/javascript" src="${res}/static/js/reg.js"></script>
	</body>	
</html>