$(function (){
    initReportHigcharts();
})

console.log($("#id").val());
function initReportHigcharts(){
    // $.ajax({
    //     url:'conAction_service.action?date='+$("#date").val(),
    //     data:{},
    //     type:'post',
    //     dataType:'json',
    //     async:false,
    //     success:function(infoData){
    //         var name=[];
    //         var data=[];
    //         $.each(infoData,function(ind,ele){
    //             name.push(ele.NAME);
    //             data.push(ele.DATA);
    //         })
    //         var chart =
    Highcharts.chart('container',{

                chart: {
                    type: 'column'
                },
                title: {
                    text: '标题'
                },
                subtitle: {
                    text: ''
                },
                xAxis: {
                    type: 'category'
                },
                yAxis: {
                    title: {
                        text: 'Total percent market share'
                    }

                },
                legend: {
                    enabled: false
                },
                plotOptions: {
                    series: {
                        borderWidth: 0,
                        dataLabels: {
                            enabled: true,
                            format: '{point.y:.1f}%'
                        }
                    }
                },

                tooltip: {
                    headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
                    pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
                },
                "series": [
                    {
                        "name": "Browsers",
                        "colorByPoint": true,
                        "data": [
                            {
                                "name": "Chrome",
                                "y": 62.74,
                                "drilldown": "Chrome"
                            },
                        ]
                    },
                 ]
        });
}