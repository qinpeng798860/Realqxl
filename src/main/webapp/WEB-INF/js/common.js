var rootPath = $("#absout").val();

//字典查询 id是 type是类型
function querySelectDict(id,type,dictValue){
    $.ajax({
        url:rootPath+'book/selectDict',
        data:{'type':type},
        dataType:'json',
        type:'post',
        async:false,
        success:function(data){
            var dict=$("#"+dictValue).val();
            $("#"+id).append("<option value='' selected>--请选择类型--</option>")
            $.each(data,function(idx,ele){
                if (ele.did==dict)
                    $("#"+id).append("<option value='"+ele.did+"' selected>"+ele.dname+"</option>");
                else
                    $("#"+id).append("<option value='"+ele.did+"'>"+ele.dname+"</option>");
            })
        }
    });
}