<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/29
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../statics/bootstrap/css/bootstrap.css">
    <script src="../../statics/bootstrap/js/jquery-3.2.1.min.js"></script>
    <script src="../../statics/bootstrap/js/bootstrap.min.js"></script>
    <title>Title</title>

    <!--<script language="javascript">
    var t = null;
   t = setTimeout(time,1000);//开始执行
   function time()
   {
      clearTimeout(t);//清除定时器
      dt = new Date();
var y=dt.getYear()+1900;
var mm=dt.getMonth()+1;
var d=dt.getDate();
var weekday=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
var day=dt.getDay();
          var h=dt.getHours();
          var m=dt.getMinutes();
          var s=dt.getSeconds();
if(h<10){h="0"+h;}
if(m<10){m="0"+m;}
if(s<10){s="0"+s;}
          document.getElementById("timeShow").innerHTML =  "现在的时间为："+y+"年"+mm+"月"+d+"日"+weekday[day]+"
"+h+":"+m+":"+s+"";
          t = setTimeout(time,1000); //设定定时器，循环执行
   }
 </script>-->

    <style>
        .text {
            line-height: 60px;
        }

        li {
            list-style-type: none;
        }
    </style>

</head>

<body>


<div class="navbar navbar-default" id="navbar">
    <script type="text/javascript">
        try {
            ace.settings.check('navbar', 'fixed')
        } catch (e) {
        }
    </script>

    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <!--<i class="icon-leaf"></i>-->
                    物流后台管理系统
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->

        <div class="navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="light-blue">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">

                        <span class="user-info">
									<small>欢迎光临</small>
								<div></div>
								</span>
                        <!--	<i class="icon-caret-down"></i>-->
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="#">
                                <i class="icon-cog"></i>
                                设置
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <i class="icon-user"></i>
                                个人资料
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="login.html">
                                <i class="icon-off"></i>
                                退出
                            </a>
                        </li>
                    </ul>
                </li>
            </ul><!-- /.ace-nav -->
        </div><!-- /.navbar-header -->
    </div><!-- /.container -->
</div>

<div class="row">
    <div class="col-sm-2 co-md-2"
         style="background: #d1d6d8; height: 700px;">
        <div class="panel-group" id="accordion" role="tablist"
             aria-multiselectable="true" style="color: #5BC0DE;">

        </div>
        <div class="sidebar-collapse" id="sidebar-collapse">
            <i class="icon-double-angle-left" data-icon1="icon-double-angle-left"
               data-icon2="icon-double-angle-right"></i>
        </div>
    </div>
    <!-- 标签页 -->
    <div class="col-sm-10 co-md-10"
         style="background: #f6f7f7; height: 700px;">
        <div>
            <ul class="nav nav-tabs" id="tab_content" role="tablist">
                <li role="presentation" class="active"><a href="#home"
                                                          aria-controls="home" role="button" data-toggle="tab">首页 <span
                        class="glyphicon glyphicon-remove tab_close"></span>
                </a></li>

            </ul>

            <div class="tab-content" id="panel_content">
                <div role="tabpanel" class="tab-pane active" id="home">
                    <iframe src="" style="height: 650px; width: 99%"></iframe>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

</body>
<script>
    $(function () {
        $.ajax({
            url: 'getconfig.do',
            method: 'get',
            dataType: 'JSON',
            success: function (data) {
                var html = "";
                $.each(data, function (configson_id, userEntity) {//所有的数据
                    if (userEntity.configson_id == 99) {
                        html += "<div class='panel panel-default'>";
                        html += "<div class='panel-heading'>";
                        html += "<h4 class='panel-title'>";
                        html += "<a role='button' data-toggle='collapse' data-parent='#accordion' href='#" + configson_id + "'>";
                        html += userEntity.config_menu_name;
                        html += "</a></h4></div> ";
                        html += "<div id='" + configson_id + "' class='panel-collapse collapse ' role='tabpanel' aria-labelledby='headingOne'>";
                        html += "<div class='panel-body' style='color:  #2AABD2; font-size: 12px;'>";
                        html += "<nav class='nav nav-pills nav-stacked'>";
                        html += "<li>";
                        $.each(data, function (cid, userEntitys) {
                            if (userEntity.config_menu_id == userEntitys.configson_id) {
                                html += "<a role='button' class='custom2'>" + userEntitys.config_menu_name + "</a>";
                            }
                        })
                        html += "</li></nav></div></div>";
                        html += "</div>";
                    }
                });


                $(".custom2").click(function () {
                    var name = $(this).text();//当前点击所选中的文字
                    var nodes = $("#tab_content").children();//标签页所有的子节点
                    var contentTab = $("#panel_content").children();//所有的面板
                    var isFlag = false;
                    console.log("name");
                    console.log(name);
                    console.log("nodes");
                    console.log(nodes);
                    console.log("contentTab");
                    console.log(contentTab);

                    $.each(contentTab, function (i, o) {//遍历面板
                        $(o).removeClass("active")//移除默认选中的面板

                    });

                    $.each(nodes, function (index, object) {//遍历标签所有的子节点
                        $(object).removeClass("active");//移除默认选中的Tab
                        var text = $(object).text();//得到标签类的内容
                        if (text == name) {//如果点击的页面已经被打开
                            isFlag = true;//已经打开
                            $(object).tab('show');//选中打开的页面
                            $("#" + text).addClass("active")//设置选中的tab为优先
                            return;
                        }
                    });


//                    $.each(data, function (i, objects) {
//                        if (name == objects.pname) {
//                            if (!isFlag) {//判断是否打开界面窗口
//                                isFlag = true;//已经打开
//                                var tab_html = "<li role=\"presentation\"><a href=\"#" + name + "\" aria-controls=\"" + name + "\" role=\"tab\" data-toggle=\"tab\">" + name + "<span class=\"glyphicon glyphicon-remove tab_close\" ></span></a></li>";
//                                var panel_html = "<div role=\"tabpanel\" class=\"tab-pane\" id=\"" + name + "\"><iframe src='" + objects.power_url + "'style='height: 650px; width: 99%'></iframe></div>";
//                                $("#tab_content").append(tab_html);//追加html
//                                $("#panel_content").append(panel_html);
//                                $(".tab_close").click(function () {
//                                    var parent = $(this).parent();//得到当前点击的元素的父类
//                                    console.log(parent);
//                                    parent.remove();//移除得到的父元素
//                                    var targetId = parent.attr("href");//得到父元素的ref标签
//                                    var tabContext = $(targetId);//得到对应的面板
//                                    console.log(tabContext);
//                                    tabContext.remove();
//                                })
//                            }
//                        }
//                    });
//
//                    $.each(nodes, function (index, object) {//遍历标签所有的子节点
//                        $(object).removeClass("active");//移除默认选中的Tab
//                        var text = $(object).text();//得到标签类的内容
//                        if (text == name) {//如果点击的页面已经被打开
//                            isFlag = true;//已经打开
//                            $(object).tab('show');//选中打开的页面
//                            $("#" + text).addClass("active")//设置选中的tab为优先
//                            return;
//                        }
//                    });

                })
                $("#accordion").html(html);
            }


        });


        //关闭tabf
        $(".tab_close").click(function () {
            var parent = $(this).parent();//得到当前点击的元素的父类
            console.log(parent);
            parent.remove();//移除得到的父元素
            var targetId = parent.attr("href");//得到父元素的ref标签
            var tabContext = $(targetId);//得到对应的面板
            console.log(tabContext);
            tabContext.remove();
        })


    })
</script>

</html>
