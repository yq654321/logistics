$(function(){
    $('#Addbillhandout').bootstrapTable({
        url:'query.do',
        pagination:true,
        selectOnCheck : false,
        checkOnSelect : false,
        pageNumber:1,
        pageSize:10,
        pageList:[10,20,30,50],
        smartDisplay:true,
        search:true,
        strictSearch:false,
        showRefresh:true,
        showToggle:true,
        showPaginationSwitch:true,
        clickToSelect:true,
        maintainSelected:true,
        singleSelect:true,
        columns: [{
            field : "ck",
            checkbox:true,
        },{
            title: '单据ID',
            field: 'bullcode_id',
            sortable : true,
            width : 100,
            align:'center'
        }, {
            title: '单据类型',
            field: 'bulltype',
            sortable : true,
            width : 100,
            align:'center',
            editor:{
                type:'textbox',
                options:{
                    required : true,
                    missingMessage : '请输入单据类型!',
                }
            }
        }, {
            title: '单据开始编号',
            field: 'billstartcode',
            align:'center'
        },{
            title: '单据结束编号',
            field: 'billendcode',
            align:'center'
        },{
            title: '领票人',
            field: 'receivebillperson',
            align:'center'
        },{
            title: '接货点',
            field: 'acceptstation',
            align:'center'
        }, {
                title : "领票时间",
                field : "receivebilltime",
                sortable : true,
                width : 100,
                align : 'center',
                editor:{
                    type:'datetimebox',
                }
            },{
            title: '分发人',
            field: 'releaseperson',
            align:'center'
        },{
            title : "填写日期",
            field : "writedate",
            sortable : true,
            width : 100,
            align : 'center',
            editor:{
                type:'datetimebox',
            }
        },{
            title: '单据状态',
            field: 'billstate',
            align:'center'
        }]

    })

});
