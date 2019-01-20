<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <script src="js/vege/check/addupdGeenCheck.js"></script>
<form id="editaddGeenCheckForm"  method="post">
    <div class="modal-content" style="width: 800px" id="addGeenCheckModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myGeenCheckLabel">

            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" id="rCbm"  name="rCbm" value="${geenCheck.rCbm}"/>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >绿化名称</label>
                    <select id="GeenName" class="selectpicker show-tick form-control" name="rClvmc"  data-live-search="true">
                        <option>${geenCheck.rClvmc}</option>
                    </select>
                    <%--<input  class="form-control" placeholder="绿化名称" id="GeenName" name="rGszmc" value="${geenSet.rGszmc}"/>--%>
                </div>
                <div class="form-group col-lg-4">
                    <label >检查时间</label>
                    <div class='input-group date' id="datetimepicker2s">
                        <input type='text' class="form-control" readonly id="datetimepicker2" name="rClvsj"  value="${geenCheck.rClvsj}"/>
                        <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                    </div>
                    <%--<input  class="form-control" placeholder="检查时间" name="rClvsj" value="${geenCheck.rClvsj}"/>--%>
                </div>
                <div class="form-group col-lg-4">
                    <label >检查人</label>
                    <input  class="form-control" placeholder="检查人" name="rCjcr" value="${geenCheck.rCjcr}"/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >检查情况</label>
                    <input  class="form-control" placeholder="检查情况" style="width: 630px;height:80px"  name="rCjcqk" value="${geenCheck.rCjcqk}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >处理情况</label>
                    <input type='text' class="form-control" placeholder="处理情况" name="rCclqk" style="width: 630px;height:80px"  value="${geenCheck.rCclqk}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >备注</label>
                    <input  class="form-control" placeholder="备注" name="rCnote"  style="width: 630px;height:80px" value="${geenCheck.rCnote}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addGeenCheckBtn_submit">
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

