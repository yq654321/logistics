<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/23
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>单据管理</title>
    <link href="../../statics/bootstrap/css/bootstrap-table.css" rel="stylesheet">
    <link href="../../statics/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../statics/bootstrap/js/jquery.min.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap.min.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap-table.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap-table-zh-CN.js"></script>
    <script src="../../statics/pagejs/billhandout.js"></script>

</head>
<body>

<table class="table table-hover table-bordered table-striped" id="Addbillhandout" style="margin-top: 30px">
    <!-- table start -->

    <div class="heading"> <!--heading 开始 -->
        <div style="margin-left: 100px; margin-top: 30px; "><!-- button的位置 start -->
            <button id="build" type="button" class="btn  btn-success" data-toggle="modal" data-target="#addbill">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
            </button>

            <!--@*修改按钮*@-->
            <button id="btnEdit" type="button" class="btn   btn-warning">
                <span class="glyphicon glyphicon-edit" aria-hidden="true"></span>修改
            </button>

            <!--@*删除按钮---无弹出框*@-->
            <button id="btnDel" type="button" class="btn  btn-danger" data-toggle="modal" data-target="#Deletebill"
                    onclick="">
                <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
            </button>

        </div><!-- button的位置 end -->

    </div><!--heading end-->

</table><!-- table end -->

<!--模态框 -->

<div class="modal fade" id="addbill" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="exampleModalLabel">增加单据</h4>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label class="control-label">单据类型</label>
                        <input type="text" class="form-control" id="bulltype">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" id="subbt" data-dismiss="modal">确认</button>
                <button type="button" class="btn btn-primary">取消</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
