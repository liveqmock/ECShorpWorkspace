$(function() {
	var $dialog = $('<div/>');
	var $formBody = $('#form-body');
	$dialog.dialog({
		height : 300,
		width : 500,
		content : $formBody.show(),
		noheader : true,
		buttons : [ {
			id : 'loginBtn',
			disabled : false,
			text : '登陆',
			handler : function() {
				$.post(ctx + '/login.json', $formBody.serialize(), function(rsp) {
					if (rsp.scode=="1") {
						window.location.href="main";
					} else {
						$.messager.alert('提示', rsp.msg);
					}
				}, 'JSON').error(function() {
					$.messager.alert('提示', '系统错误！');
				});
			}
		} ]
	});
	$formBody.after($('#logo').show());
	var $verifyInput = $('<input class="verify-input" maxlength="4"/>');
	$verifyInput.keydown(function() {
		return $formBody.form('validate');
	}).keyup(function() {
		var target = this;
		if (target.value.length === 4) {
			target.disabled = true;
			$(target).blur();
			$.post('commons/verifyCode', {
				code : this.value
			}, function(rsp) {
				if (rsp.status) {
					$('#loginBtn').linkbutton('enable').click();
				} else {
					target.disabled = false;
					$(target).focus().val('');
					$verifyImg.click();
				}
			}, 'JSON').error(function() {
				target.disabled = false;
				$(target).focus().val('');
				$verifyImg.click();
			});
		}
	});
	var $verifyImg = $('<img src="commons/verify" class="verify-img"/>');
	$verifyImg.on('click', function() {
		$(this).attr('src', 'commons/verify?t=' + new Date().getTime());
	});
	$('.dialog-button').prepend($verifyInput).prepend($verifyImg);
	$(window).resize(function() {
		$dialog.dialog('center');
	});
});