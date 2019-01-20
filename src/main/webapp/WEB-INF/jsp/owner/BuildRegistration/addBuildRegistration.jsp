<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/owner/BuildRegistration/addBuildRegis.js"></script>
<form id="editBuildForm"  method="post">
    <input type="hidden" value="${rYzid}" id="rYzid" name="rYzid" />
    <div class="modal-content" style="width: 800px" id="BuildModal">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
                业主房产登记
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <%--<input type="hidden" name="rId" id="rId" value="${rId}">--%>
            <%--<input type="hidden" name="rStatus" id="editServerTypeid" value="${serverType.rStatus}">--%>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >楼宇名称</label>
                    <%--<input  class="form-control" placeholder="楼宇" name="rly" value=""/>--%>
                    <select class="form-control" id="lybm" name="rLy">
                    </select>
                </div>
                <div class="form-group col-lg-4">
                    <label >单元楼层</label>
                    <%--<input  class="form-control" placeholder="单元楼层" name="rlc" value=""/>--%>
                    <select class="form-control" id="dybm" name="rLc">
                    </select>
                </div>
                <div class="form-group col-lg-4">
                    <label >房间名称</label>
                    <%--<input  class="form-control" placeholder="房间名称" name="rYzbm" value=""/>--%>
                    <select class="form-control" id="fjbm" name="rFjmc">
                    </select>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >房产证号</label>
                    <input  class="form-control" placeholder="房产证号" name="rFczh" value=""/>
                </div>
                <div class="form-group col-lg-4">
                    <label >认购证号</label>
                    <input  class="form-control" placeholder="认购证号" name="rRgzh" value=""/>
                </div>
                <div class="form-group col-lg-4"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-8">
                    <label >备注</label>
                    <textarea class="form-control"  placeholder="备注" name="rNote" value="" rows="3" style="width: 530px;height:150px"></textarea>
                </div>
                <div class="form-group col-lg-4" style="padding-top: 20px"> </div>
            </div>
        </div>

        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addBuildBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>
<script>
    $(function(){
        showsmsselect();
    })
</script>