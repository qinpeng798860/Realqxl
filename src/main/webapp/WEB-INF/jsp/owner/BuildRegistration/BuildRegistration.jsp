<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/owner/BuildRegistration/BuildRegis.js"></script>
<input type="hidden" value="${rId}" id="rYzid" name="rYzid"/>
<div id="addBuildModal">
    <div class="modal-content" style="width: 800px">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                &times;
            </button>
            <h4 class="modal-title" id="myBuildModalLabel">
                查看房产
            </h4>
        </div>
        <table id="BuildListTable">
            <div id="btn-Buildbar">
                <button type="button" class="btn btn-default" onclick="addBuildTable()">新增</button>
            </div>
        </table>
    </div>
</div>


