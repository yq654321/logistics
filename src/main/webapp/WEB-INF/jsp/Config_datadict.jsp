<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/28
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>数据字典</title>
    <link href="../../statics/bootstrap/css/bootstrap-table.css" rel="stylesheet">
    <link href="../../statics/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../statics/bootstrap/js/jquery.min.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap.min.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap-table.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap-table-zh-CN.js"></script>

</head>
<script>
    $(function () {
        $("#tableDiv").bootstrapTable({
            url:'Config_datadict_query4List.do?config_id=99',
            data:'json',
            search:true,
            columns:,


        })
    })
</script>
<body>
<div class="gstable-container">
    <div class="gop">
        <div style="height: 70px">
            <div style="float: left; padding-bottom: 10px">
                <button class="btn btn-primary" id="btn-new">
                    <i class="fa fa-plus"></i> 添加
                </button>
                <button class="btn btn-danger" id="btn-del">
                    <i class="fa fa-minus"></i> 删除
                </button>
            </div>
        </div>
    </div>

    <div class="tbOuterDiv">
        <div id="tableDiv"></div>
    </div>
</div>
</body>
</html>
