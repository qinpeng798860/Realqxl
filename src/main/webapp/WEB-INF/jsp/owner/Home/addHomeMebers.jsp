<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/owner/Home/addHomeMembers.js"/>
<form id="addHomeMembersForm"  method="post">
    <input type="hidden" value="${rYzid}" id="rYzid" name="rYzid"/>
    <div class="modal-content" style="width: 800px" id="addHomeMembersModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myHomeMembersModalLabel">
                新增业主家庭成员
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >成员姓名</label>
                    <input  class="form-control" placeholder="成员姓名" name="rCyxm" value=""/>
                </div>
                <div class="form-group col-lg-4">
                    <label >联系电话</label>
                    <input  class="form-control" placeholder="联系电话" name="rLxdh" value=""/>
                </div>

                <div class="form-group col-lg-4">
                    <label >性别</label>
                    <input  class="form-control" placeholder="性别" name="rXb" value=""/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >出生日期</label>
                    <div class='input-group date' id="datetimepicker2s">
                        <input type='text' class="form-control" readonly id="datetimepicker2" name="rCsrq" />
                        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                    </div>
                    <%--<input  class="form-control" placeholder="出生日期" name="rCsrq" value=""/>--%>
                </div>
                <div class="form-group col-lg-4">
                    <label >证件类型</label>
                    <input  class="form-control" placeholder="证件类型" name="rZjlx" value=""/>
                </div>
                <div class="form-group col-lg-4">
                    <label >证件号码</label>
                    <input type='text' class="form-control"  placeholder="证件号码" name="rZjhm"/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >与业主的关系</label>
                    <input class="form-control"  placeholder="关系" name="rGx" value="" />
                </div>
                <div class="form-group col-lg-4">
                    <label >学历</label>
                    <input class="form-control"  placeholder="学历" name="rXl" value=""/>
                </div>
                <div class="form-group col-lg-4">
                    <label >工作单位</label>
                    <input class="form-control"  placeholder="工作单位" name="rGzdw" value=""/>
                </div>
                <%--<div class="form-group col-lg-4" style="padding-top: 20px"> </div>--%>
            </div>
            <div class="row">
                <div class="form-group col-lg-6">
                    <label >备注</label>
                    <textarea class="form-control"  placeholder="备注" name="rBz" value="" rows="3" style="width: 530px;height:150px"></textarea>
                </div>
                <div class="form-group col-lg-6"></div>
                <%--<div class="form-group col-lg-6" style="padding-top: 20px">--%>
                <%--<textarea  id="ownerXp" class="form-control" placeholder="照片" name="rXp" value="" style="width: 230px;height: 150px"></textarea>--%>
                <%--<input type="file" id="ownerfile"/>--%>
                <%--</div>--%>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addHomeMembersBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>

