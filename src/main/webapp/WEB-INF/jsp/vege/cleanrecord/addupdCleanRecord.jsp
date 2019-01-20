<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/vege/cleanrecord/addupdCleanRecord.js"></script>
<form id="editaddCleanRecordForm"  method="post">
    <div class="modal-content" style="width: 800px" id="addCleanRecordModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myCleanRecordLable">

            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" id="rQbm"  name="rQbm" value="${cleanRecord.rQbm}">
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >清洁名称</label>
                    <select id="cleanName" class="selectpicker show-tick form-control" name="rQid"  data-live-search="true">
                        <option>${cleanRecord.rQid}</option>
                    </select>
                    <%--<input  class="form-control" placeholder="植被名称" name="rQid" value="${cleanRecord.rZbmc}"/>--%>
                </div>
                <div class="form-group col-lg-4">
                    <label >清洁人</label>
                    <input  class="form-control" placeholder="清洁人" name="rQqjr" value="${cleanRecord.rQqjr}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >清洁时间</label>
                        <div class='input-group date' id="datetimepicker2s">
                            <input type='text' class="form-control" readonly id="datetimepicker2" name="rQqjsj"  value="${cleanRecord.rQqjsj}"/>
                            <span class="input-group-addon" >
                             <span class="glyphicon glyphicon-calendar" ></span>
                             </span>
                        </div>
                    </div>
                    <%--<input type='text' class="form-control" placeholder="清洁时间" name="rQqjsj" value="${cleanRecord.rQqjsj}"/>--%>
                <%--<div class="form-group col-lg-4"></div>--%>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >清洁情况</label>
                    <input  class="form-control" placeholder="清洁情况" name="rQqjqk"  style="width: 630px;height:80px" value="${cleanRecord.rQqjqk}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
              <div class="form-group col-lg-9">
                    <label >备注</label>
                    <input class="form-control"  placeholder="备注" name="rQnote" rows="3"style="width: 630px;height:80px" value="${cleanRecord.rQnote}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addCleanRecoredBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>
<script>
    $(function(){
        querySelectClean("cleanName","",'');
    })

</script>
