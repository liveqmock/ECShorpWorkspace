 $('#list_data').datagrid({  
        title:'应用系统列表',  
        iconCls:'icon-edit',//图标  
        width: 700,  
        height: 'auto',  
        nowrap: false,  
        striped: true,  
        border: true,  
        collapsible:false,//是否可折叠的  
        fit: true,//自动大小  
        url:'listApp.action',  
        //sortName: 'code',  
        //sortOrder: 'desc',  
        remoteSort:false,   
        idField:'fldId',  
        singleSelect:false,//是否单选  
        pagination:true,//分页控件  
        rownumbers:true,//行号  
        frozenColumns:[[  
            {field:'ck',checkbox:true}  
        ]],  
        toolbar: [{  
            text: '添加',  
            iconCls: 'icon-add',  
            handler: function() {  
                openDialog("add_dialog","add");  
            }  
        }, '-', {  
            text: '修改',  
            iconCls: 'icon-edit',  
            handler: function() {  
                openDialog("add_dialog","edit");  
            }  
        }, '-',{  
            text: '删除',  
            iconCls: 'icon-remove',  
            handler: function(){  
                delAppInfo();  
            }  
        }],  
    });  