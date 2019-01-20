<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/server/manageServer/editServerManage.js"/>
<form id="editServerTypeForm"  method="post">
    <div id="editServerManage">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    服务办理
                </h4>
            </div>
            <div class="modal-body"><%--主体--%>
                <input type="hidden" value="${server.rZtid}" id="rZtid"/>
                <input type="hidden" value="${server.rBlid}" id="rBlid">
                <input type="hidden" name="rSerid" id="rSerid" value="${server.id}"><%--服务id--%>
                <div class="row">
                    <div class="form-group col-lg-4">
                        <label >服务类型</label>
                        <input  type="text" class="form-control" id="addServerTypeSelect" name="rFwlx" value="${server.rFwlx}"readonly/>
                    </div>
                    <div class="form-group col-lg-4">
                        <label >诉求时间</label>
                        <!--指定 date标记-->
                        <div class='input-group date' id="datetimepicker2s">
                            <input type='text' class="form-control" readonly id="datetimepicker2" name="rSqsj" value="${server.rSqsj}"/>
                            <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                        </div>

                    </div>
                    <div class="form-group col-lg-4">
                        <label >申请人</label>
                        <input  type="text" class="form-control" id="typeSqr" name="rSqr" value="${server.rSqr}"readonly/>
                    </div>

                </div>
                <div class="row">
                    <div class="form-group col-lg-4">
                        <label >联系电话</label>
                        <input  type="text" class="form-control" id="lxdh" name="rLxdh" value="${server.rLxdh}"readonly/>
                    </div>
                    <div class="form-group col-lg-4">
                        <label>服务所属公司</label>
                        <input type="hidden" name="rBldw" value="${server.rGsid}">
                        <input  type="text" class="form-control" id="rssgs"  value="${server.rSsgs}" readonly/>
                    </div>
                    <div class="form-group col-lg-4">
                        <label>服务所属联系方式</label>
                        <input  type="text" class="form-control" id="lxfs"  value="${server.rLxfs}" readonly/>
                    </div>

                </div>
                <div>
                    <div class="row">
                        <div class="form-group col-lg-4">
                            <label >办理时间</label>
                            <!--指定 date标记-->
                            <div class='input-group date' id="rblsj">
                                <input type='text' class="form-control" readonly id="rblsjvalue" value="${server.rBlsj}"/>
                                <span class="input-group-addon" >
                                 <span class="glyphicon glyphicon-calendar" ></span>
                                 </span>
                            </div>

                        </div>
                        <div class="form-group col-lg-4">
                            <label >结束时间</label>
                            <!--指定 date标记-->
                            <div class='input-group date' id="rjssj">
                                <input type='text' class="form-control" readonly id="rjssjvalue" value="${server.rJssj}"/>
                                <span class="input-group-addon" >
                                 <span class="glyphicon glyphicon-calendar" ></span>
                                 </span>
                            </div>


                            </div>
                        <div class="form-group col-lg-4">
                            <label >办理结果</label>
                            <!--指定 date标记-->
                            <input type='text' class="form-control" readonly  value="${server.rBljg}"/>

                        </div>
                    </div>

            <div class="row">


            </div>
                <%--按钮组--%>
                <div class="modal-footer">
                 <%--   <a  class="btn btn-primary" id="addServerTypeBtn_submit">
                        提交
                    </a>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>--%>
                </div>

                <table id="manageServer">
                    <div id="toolbar">
                        <script>
                            function  resetFrom() {
                                $("#serverForm")[0].reset();//表单重置
                            }
                        </script>
                        <button type="button" class="btn btn-default" onclick="bigenServerMange();">开始办理</button>
                        <button type="button" class="btn btn-default" onclick="manageBack();">退回重审</button>
                    </div>
                </table>
            </div><!-- /.modal-content -->
        </div>
</form>
