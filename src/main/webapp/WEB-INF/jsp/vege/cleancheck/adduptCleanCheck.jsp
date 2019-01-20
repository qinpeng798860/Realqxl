<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/vege/cleancheck/addupdCleanCheck.js"></script>
<form id="editaddCleanCheckForm"  method="post">
    <div class="modal-content" style="width: 800px" id="addCleanCheckModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myCleanCheckLabel">
                植被信息
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" id="rQbm"  name="rQbm" value="${cleanCheck.rQbm}">
            <div class="row">
                <div class="form-group col-lg-4">
                        <label >检查日期</label>
                        <div class='input-group date' id="datetimepicker2s">
                            <input type='text' class="form-control" readonly id="datetimepicker2" name="rQjcrq"  value="${cleanCheck.rQjcrq}"/>
                            <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                        </div>
                    <%--<input  class="form-control" placeholder="检查日期" name="rQjcrq" value="${cleanCheck.rQjcrq}"/>--%>
                </div>
                <div class="form-group col-lg-4">
                    <label >检查地段</label>
                    <input  class="form-control" placeholder="检查地段" name="rQjcdd" value="${cleanCheck.rQjcdd}"/>
                </div>
                <div class="form-group col-lg-4"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >检查人</label>
                    <input  class="form-control" placeholder="检查人" name="rQjcr" value="${cleanCheck.rQjcr}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >清洁人</label>
                    <input  class="form-control" placeholder="清洁人" name="rQqjr" value="${cleanCheck.rQqjr}"/>
                </div>
                <div class="form-group col-lg-4"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >清洁情况</label>
                    <input  class="form-control" placeholder="清洁情况" name="rQjcqk"  style="width: 630px;height:80px" value="${cleanCheck.rQjcqk}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >备注</label>
                    <input class="form-control" placeholder="备注" name="rQnote" style="width: 630px;height:80px" value="${cleanCheck.rQnote}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addCleanCheckBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>
