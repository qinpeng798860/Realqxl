<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <script src="js/vege/arrangement/addupdArrangement.js"></script>
<form id="editaddArrangementForm"  method="post">
    <div class="modal-content" style="width: 800px" id="addCleanArrangementModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myArrangementLabel">
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" id="rAbm"  name="rAbm" value="${cleanArrangement.rAbm}"/>
            <div class="row">
                <div class="form-group col-lg-5">
                    <label >清洁名称</label>
                    <input  class="form-control" placeholder="清洁名称" name="rAmc" value="${cleanArrangement.rAmc}"/>
                </div>
                <div class="form-group col-lg-5">
                    <label >清洁地段</label>
                    <input  class="form-control" placeholder="清洁地段" name="rAqjdd" value="${cleanArrangement.rAqjdd}"/>
                </div>
                <div class="form-group col-lg-2"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-5">
                    <label >清洁时间</label>
                    <div class='input-group date' id="datetimepicker2s">
                        <input type='text' class="form-control" readonly id="datetimepicker2" name="rAqjsj"  value="${cleanArrangement.rAqjsj}"/>
                        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                    </div>
                    <%--<input  class="form-control" placeholder="清洁时间"  name="rAqjsj" value="${cleanArrangement.rAqjsj}"/>--%>
                </div>
                <div class="form-group col-lg-5">
                    <label >责任人</label>
                    <input type='text' class="form-control" placeholder="责任人" name="rAfzr" value="${cleanArrangement.rAfzr}"/>
                </div>
                <div class="form-group col-lg-2"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >清洁内容</label>
                    <input  class="form-control" placeholder="清洁内容" name="rAqjnr"  style="width: 630px;height:80px" value="${cleanArrangement.rAqjnr}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >备注</label>
                    <input  class="form-control" placeholder="备注" name="rAnote"  style="width: 630px;height:80px" value="${cleanArrangement.rAnote}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addArrangementBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>
<script>
    $(function(){
        querySelectGeen("GeenName","",'');
    })

</script>
