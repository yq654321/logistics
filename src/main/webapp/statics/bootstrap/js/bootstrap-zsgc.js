var f = true;
//状态
var state = "";
//修改前的值
var Users = {};

function update_front(row) {
    var visibleColumns = $("#table").bootstrapTable('getVisibleColumns');
    $(Users).prop("parentId", row.parentId);
    $.each(visibleColumns, function (i, column) {
        if (column.field == 0) {

        }
        else {
            var columnName = column.field;
            var rValue = eval("row." + column.field);
            if (rValue != undefined) {
                $(Users).prop(columnName, rValue);
            }
            else {
                $(Users).prop(columnName, "-");
            }
        }
    });
}

//提交的数据
function submit_data() {
    var visibleColumns = $("#table").bootstrapTable('getVisibleColumns');
    var data = {};
    $.each(visibleColumns, function (i, v) {
        console.log($('#' + v.field).val());
        $(data).prop(v.field, $('#' + v.field).val())
    });
    console.log(data);
    return data;
}

//增加
function add() {
    if (f) {
        var visibleColumns = $("#table").bootstrapTable('getVisibleColumns');
        var strAppend = '<tr id="save">';
        $.each(visibleColumns, function (i, column) {
            var _edit = column.edit;
            if (column.field == 0) {
                strAppend += '<td></td>';
            }
            else if (_edit == undefined) {
                strAppend += '<td><input class="form-control" type="text" value="0" id="' + column.field + '" disabled/></td>';
            }
            else if (_edit.type == "text") {
                strAppend += '<td><input type="text" class="form-control" id="' + column.field + '" /></td>';
            }
            else if (_edit.type == "checkbox") {
                var _edit_type_options = _edit.options;
                strAppend += '<td><select style="width: 66px;height: 33px" class="form-control" id="' + column.field + '">';
                $.each(_edit_type_options, function (value, text) {
                    strAppend += '<option value=' + value + '>' + text + '</option>';
                });
                strAppend += '</select></td>';
            }
        });
        $("#table").append(strAppend + '</tr>');
        f = false;
        state = "add";
    }
    else {
        toastr.warning('请完成当前操作');
    }
}

//修改
function update() {

    var row = $("#table").bootstrapTable("getSelections")[0];
    if (row == undefined) {
        toastr.warning('请选择要修改的行！！！');

        return;
    }
    if (!f) {
        toastr.warning('请完成当前操作！！！');
        return;
    }

    var visibleColumns = $("#table").bootstrapTable('getVisibleColumns');
    update_front(row);
    var columns = {};
    $.each(visibleColumns, function (i, column) {
        console.log(column+"1111111111");
        if (column.field == 0) {
        }
        else {
            var _edit = column.edit;
            var columnName = column.field;
            var rValue = eval("row." + column.field);
            if (_edit == undefined) {
                $(columns).prop(columnName, "<input class=\"form-control\" type='text' value=\"" + rValue + "\" id=\"" + column.field + "\" readonly>");
            }
            else {
                var _edit_type = _edit.type;
                if (_edit_type == "text") {
                    $(columns).prop(columnName, "<input type='text' class=\"form-control\" value=\"" + rValue + "\" id=\"" + column.field + "\">");
                }
                else if (_edit_type == "checkbox") {
                    var _edit_type_options = _edit.options;
                    var _edit_type_options_value = '<select style="width: 66px;height: 33px" class="form-control" id="' + column.field + '">';
                    $.each(_edit_type_options, function (value, text) {
                        _edit_type_options_value += '<option value=' + value + '>' + text + '</option>';
                    });
                    _edit_type_options_value += '</select>';
                    $(columns).prop(columnName, _edit_type_options_value)
                }
                else if (_edit_type == "combogrid") {
                    var combogrid_content_start = '<div class="input-group"><input id="' + column.field + '" type="text" class="form-control" aria-label="..."> <div class="input-group-btn" id="div_' + column.field + '"> <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">&nbsp; <span class="caret"></span></button></div></div>';
                    $(columns).prop(columnName, combogrid_content_start);
                    var _edit_utl = _edit.url;
                    var _edit_columns = _edit.columns;
                    var _combogrid_table_context = '<table class="table table-bordered table-hover dropdown-menu dropdown-menu-right table-responsive"><thead><tr>';
                    $.each(_edit_columns, function (c, _edit_column) {
                        $.each(_edit_column, function (index, content) {
                            _combogrid_table_context += '<th class="active">' + content.title + '</th>';
                        });
                    });
                    _combogrid_table_context += '</thead><tbody>';
                    //
               /*     $.ajax({
                        url: "111.do",
                        type: 'post',
                        dataType: 'JSON',
                        success: function (data) {
                            $.each(data, function (index, obj) {
                                _combogrid_table_context += '<tr>';
                                $.each(_edit_columns, function (c, _edit_column) {
                                    $.each(_edit_column, function (index, content) {
                                        $.each(obj, function (name_space, value) {
                                            if (content.field == name_space) {
                                                _combogrid_table_context += '<td>' + value + "</td>";
                                            }
                                        });
                                    });
                                });
                                _combogrid_table_context += '</tr>';
                            });
                            _combogrid_table_context += '</tbody></table>';
                            $("#div_" + column.field).append(_combogrid_table_context);
                        }
                    });*/
                }
            }
        }
    });
    var rows = $("#table").bootstrapTable("updateRow", {
        index: row.parentId,
        row: columns
    });
    f = false;
    state = "update";
}


function save() {
    var datass = submit_data();
    if (!f) {
        if (state == "add") {
            save_add(datass);
            $("#save").remove();
            f = true;
        }
        else if (state == "update") {
            save_update(datass);
            var rows = $("#table").bootstrapTable("updateRow", {
                index: Users.parentId,
                row: datass
            });
            f = true;
            state = "";
        }


    }
    else {
        toastr.warning('请完成当前操作');
    }
}

function dels() {
    var datass = submit_data();
    del(datass);


}

//取消
function cancel() {
    if (state == "add") {
        $("#save").remove();
        f = true;
        state = "";
    }
    else if (state == "update") {
        var rows = $("#table").bootstrapTable("updateRow", {
            index: Users.parentId,
            row: Users
        });
        console.log(Users);
        f = true;
        state = "";
    }
}