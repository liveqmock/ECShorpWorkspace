$(function() {
	$('#centerTab').tabs({
		tools:[{
			iconCls:'icon-back',
			handler: function(){
				$.messager.confirm('注销提示', '你确定注销吗?', function(r){
					if(r){
						window.location = root+'/login/doLogout.jhtml';
					}
				});
			}
		}]
	});

    //刷新
    $("#m-refresh").click(function(){
        var currTab = $('#tabs').tabs('getSelected');    //获取选中的标签项
        var url = $(currTab.panel('options').content).attr('src');    //获取该选项卡中内容标签（iframe）的 src 属性
        /* 重新设置该标签 */
        $('#tabs').tabs('update',{
            tab:currTab,
            options:{
                content: createTabContent(url)
            }
        })
    });
   
    //关闭所有
    $("#m-closeall").click(function(){
        $(".tabs li").each(function(i, n){
            var title = $(n).text();
            $('#tabs').tabs('close',title);   
        });
    });
   
    //除当前之外关闭所有
    $("#m-closeother").click(function(){
        var currTab = $('#tabs').tabs('getSelected');
        currTitle = currTab.panel('options').title;   
       
        $(".tabs li").each(function(i, n){
            var title = $(n).text();
           
            if(currTitle != title){
                $('#tabs').tabs('close',title);           
            }
        });
    });
   
    //关闭当前
    $("#m-close").click(function(){
        var currTab = $('#tabs').tabs('getSelected');
        currTitle = currTab.panel('options').title;   
        $('#tabs').tabs('close', currTitle);
    });
    
});

/**
 * 创建新选项卡
 * @param tabId    选项卡id
 * @param title    选项卡标题
 * @param url      选项卡远程调用路径
 */
function addTab(tabId,title,url){
    if ($('#centerTab').tabs('exists', title)) {
         $('#centerTab').tabs('select', title);
    } else {
    	//如果当前id的tab不存在则创建一个tab
    	if($("#"+tabId).html()==null){
	    	var name = 'iframe_'+tabId;
	         var content = '<iframe name="'+name+'"id="'+tabId+'"src="'+url+'" width="100%" height="100%" frameborder="0" scrolling="auto" ></iframe>';
	         $('#centerTab').tabs('add', {
	              title : title,
	              content : content,
	              closable : true
	         });
    	}
    }
}
