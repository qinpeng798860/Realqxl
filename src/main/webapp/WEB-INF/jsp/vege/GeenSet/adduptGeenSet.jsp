<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/vege/GeenSet/addupdGeenSet.js"></script>
<form id="editaddGeenSetForm"  method="post">
    <div class="modal-content" style="width: 800px" id="addGeenSetModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myGeenSetLabel">
                植被信息
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" id="rGbm"  name="rGbm" value="${geenSet.rGbm}">
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >设置名称</label>
                    <input  class="form-control" placeholder="设置名称" name="rGszmc" value="${geenSet.rGszmc}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >面积</label>
                    <input  class="form-control" placeholder="面积" name="rGmj" value="${geenSet.rGmj}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >地点</label>
                    <input  class="form-control" placeholder="地点" name="rGdd" value="${geenSet.rGdd}"/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >责任人</label>
                    <input  class="form-control" placeholder="责任人" name="rGzrr" value="${geenSet.rGzrr}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >绿化时间</label>
                    <div class='input-group date' id="datetimepicker2s">
                        <input type='text' class="form-control"  value="${geenSet.rGlhsj}" readonly id="datetimepicker2" name="rGlhsj"  />
                        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                         </span>
                    </div>
                    <%--<input type='text' class="form-control" placeholder="绿化时间" name="rGlhsj" value="${geenSet.rGlhsj}"/>--%>
                </div>
                <div class="form-group col-lg-4"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >主要植被</label>
                    <input  class="form-control" placeholder="主要植被" name="rGzyzb"  style="width: 630px;height:80px" value="${geenSet.rGzyzb}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >备注</label>
                    <input class="form-control" placeholder="备注" name="rGnote" style="width: 630px;height:80px" value="${geenSet.rGnote}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addGeenSetBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>

