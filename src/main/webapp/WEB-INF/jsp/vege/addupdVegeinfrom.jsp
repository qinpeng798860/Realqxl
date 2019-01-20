<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/vege/addVegeinfromation.js"></script>
<form id="editaddVegeTypeForm"  method="post">
    <div class="modal-content" style="width: 800px">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myVegeModalLabel">
                植被信息
            </h4>
        </div>
        <div class="modal-body"><%--主体--%>
            <input type="hidden" id="rZbbm"  name="rZbbm" value="${vegeinfrom.rZbbm}">
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >植被名称</label>
                    <input  class="form-control" placeholder="植被名称" name="rZbmc" value="${vegeinfrom.rZbmc}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >植被种类</label>
                    <input  class="form-control" placeholder="植被种类" name="rZbzl" value="${vegeinfrom.rZbzl}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >植被数量</label>
                    <input  class="form-control" placeholder="植被数量" name="rZbsl" value="${vegeinfrom.rZbsl}"/>
                </div>
            </div>
            <div class="row">
                <div class="form-group col-lg-4">
                    <label >植被树龄</label>
                    <input  class="form-control" placeholder="树龄" name="rSl" value="${vegeinfrom.rSl}"/>
                </div>
                <div class="form-group col-lg-4">
                    <label >植被单位</label>
                    <input type='text' class="form-control" placeholder="单位" name="rZbdw" value="${vegeinfrom.rZbdw}"/>
                </div>
                <div class="form-group col-lg-4"></div>
            </div>
            <div class="row">
                <div class="form-group col-lg-9">
                    <label >植被习性</label>
                    <input  class="form-control" placeholder="习性" name="rZbxx"  style="width: 630px;height:80px" value="${vegeinfrom.rZbxx}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
            <div class="row">
              <div class="form-group col-lg-9">
                    <label >植被特点</label>
                    <input class="form-control"  placeholder="特点" name="rZbtd" rows="3"style="width: 630px;height:80px" value="${vegeinfrom.rZbtd}"/>
                </div>
                <div class="form-group col-lg-3"></div>
            </div>
           <div class="row">
             <div class="form-group col-lg-9">
                    <label >备注</label>
                    <input class="form-control" placeholder="备注" name="rZbnote" style="width: 630px;height:80px" value="${vegeinfrom.rZbnote}"/>
                </div>
               <div class="form-group col-lg-3"></div>
             </div>
        </div>
        <%--按钮组--%>
        <div class="modal-footer">
            <a  class="btn btn-primary" id="addVegeBtn_submit">
                保存
            </a>
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
        </div>
    </div><!-- /.modal-content -->
</form>

