<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/owner/addowner.js"></script>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--$('a').click(function () {--%>
            <%--$('textarea')[0].value = "";--%>
        <%--})--%>
    <%--})--%>
<%--</script>--%>
<form id="editaddOwnerTypeForm"  method="post">
    <div class="modal-content" style="width: 800px" id="addownerModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myownerModalLabel">
                新增业主
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" name="rId" id="rId" value="${owner.rId}">
            <%--<input type="hidden" name="rStatus" id="editServerTypeid" value="${serverType.rStatus}">--%>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >住宅名称</label>
                    <select class="form-control"  name="rEid" id="rEid" value="${owner.rEid}">
                    </select>
                </div>
                    <div class="form-group col-lg-4">
                        <label >业主类型</label>
                        <select class="form-control"  name="rYzlx" id="ryzlxOwner" value="${owner.rYzlx}">
                        </select>
                    </div>
                    <%--<div class="form-group col-lg-4">--%>
                        <%--<label >业主编码</label>--%>
                        <%--<input  class="form-control" placeholder="业主编码" name="rYzbm" value=""/>--%>
                    <%--</div>--%>
                <div class="form-group col-lg-4">
                    <label >业主姓名</label>
                    <input  class="form-control" placeholder="业主姓名" name="rYzxm" value="${owner.rYzxm}"/>
                </div>

            </div>
            <div class="row">

                <div class="form-group col-lg-4">
                    <label >性别</label>
                    <input  class="form-control" placeholder="性别" name="rXb" value="${owner.rXb}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >出生日期</label>
                    <div class='input-group date' id="datetimepicker2s">
                        <input type='text' class="form-control" readonly id="datetimepicker2" name="rCsrq"  value="${owner.rCsrq}"/>
                        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                    </div>
                    <%--<input type='text' class="form-control"  placeholder="出生日期"  name="rCsrq" id="datepicker" value="${owner.rCsrq}"/>--%>
                </div>
                <div class="form-group col-lg-4">
                    <label >民族</label>
                    <input  class="form-control" placeholder="民族" name="rMz" value="${owner.rMz}"/>
                </div>
            </div>
            <div class="row">

                <div class="form-group col-lg-4">
                    <label >学历</label>
                    <input  class="form-control" placeholder="学历" name="rXl" value="${owner.rXl}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >国籍</label>
                    <input  class="form-control" placeholder="国籍" name="rGj" value="${owner.rGj}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >籍贯</label>
                    <input  class="form-control" placeholder="籍贯" name="rJg" value="${owner.rJg}"/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >证件类型</label>
                    <input  class="form-control" placeholder="证件类型" name="rZjlx" value="${owner.rZjlx}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >证件号码</label>
                    <input  class="form-control" placeholder="证件号码" name="rZjhm" value="${owner.rZjhm}"/>
                </div>

                <div class="form-group col-lg-4">
                    <label >工作单位</label>
                    <input  class="form-control" placeholder="工作单位" name="rGzdw" value="${owner.rGzdw}"/>
                </div>
            </div>
            <div class="row">

                <div class="form-group col-lg-4">
                    <label >邮编</label>
                    <input  class="form-control" placeholder="邮编" name="rYb" value="${owner.rYb}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >职务</label>
                    <input  class="form-control" placeholder="职务" name="rZw" value="${owner.rZw}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >手机号码</label>
                    <input  class="form-control" placeholder="手机号码" name="rSjhm" value="${owner.rSjhm}"/>
                </div>
            </div>
            <div class="row">

                <div class="form-group col-lg-4">
                    <label >联系地址</label>
                    <input  class="form-control" placeholder="联系地址" name="rLxdz" value="${owner.rLxdz}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >紧急联系人</label>
                    <input  class="form-control" placeholder="紧急联系人" name="rJjlxr" value="${owner.rJjlxr}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >紧急联系电话</label>
                    <input  class="form-control" placeholder="紧急联系电话" name="rJjlxdh" value="${owner.rJjlxdh}"/>
                </div>
            </div>
            <div class="row">

                <div class="form-group col-lg-4">
                    <label >紧急联系地址</label>
                    <input  class="form-control" placeholder="紧急联系地址" name="rJjlxdz" value="${owner.rJjlxdz}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >开户行</label>
                    <input  class="form-control" placeholder="开户行" name="rKhx" value="${owner.rKhx}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >银行账号</label>
                    <input  class="form-control" placeholder="银行账号" name="rYhzh" value="${owner.rYhzh}"/>
                </div>
            </div>
            <div class="row">

                <div class="form-group col-lg-6">
                    <label >所在派出所</label>
                    <input  class="form-control" placeholder="所在派出所" name="rSzpcs" value="${owner.rSzpcs}"/>
                </div>
                <div class="form-group col-lg-6">
                    <label >状态</label>
                    <select class="form-control"  name="rZt" id="ztOwner" value="${owner.rZt}">
                        <option>请选择</option>
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-6">
                    <label >备注</label>
                    <textarea class="form-control"  placeholder="备注" name="rNote" value="${owner.rNote}" rows="3" style="width: 530px;height:150px"></textarea>
                </div>
                <div class="form-group col-lg-6"></div>
                <%--<div class="form-group col-lg-6" style="padding-top: 20px">--%>
                    <%--<textarea  id="ownerXp" class="form-control" placeholder="照片" name="rXp" value="${owner.rCsrq}" style="width: 230px;height: 150px"></textarea>--%>
                    <%--<input type="file" id="ownerfile"/>--%>
                    <%--&lt;%&ndash;<button type="button" class="btn btn-default"  style="pointer-events: auto">删除</button>&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<a class="glyphicon glyphicon-remove btn form-control-feedback"style="pointer-events: auto"></a>&ndash;%&gt;--%>
                <%--</div>--%>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addownerBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>
</div>
<script>
    $(function(){
        querySelectDict("ryzlxOwner","业主类型",'');
        querySelectDict("ztOwner","业主状态",'');
        querySelectResidental("rEid","",'');
    })
</script>

