package com.zking.real.vegetation.controller;

import com.zking.real.util.AppliUtils;
import com.zking.real.vegetation.mapper.CleanRecordMapper;
import com.zking.real.vegetation.model.CleanArrangement;
import com.zking.real.vegetation.model.CleanRecord;
import com.zking.real.vegetation.service.ICleanRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RequestMapping("/record")
@Controller
public class CleanRecordController extends AppliUtils {

    @Autowired
    private ICleanRecordService iCleanRecordService;

    //查询
    @RequestMapping("/queryCleanRecordPager")
    @ResponseBody
    public Map<String,Object> queryCleanRecordPager(CleanRecord cleanRecord, HttpServletRequest request){
        this.bean.setRequest(request);
        List<Map<String, Object>> record =iCleanRecordService.queryCleanRecordPager(cleanRecord,this.bean);
        this.mapUtils.put("rows", record);
        this.mapUtils.put("total", bean.getTotal());
        return mapUtils;
    }

    //查询
    @RequestMapping("gotoListCleanRecord.shtml")
    public String gotoListCleanRecord(){
        return "vege/cleanrecord/ListCleanRecord";
    }


    //删除
    @RequestMapping("/delSingCleanRecord")
    @ResponseBody
    public Map<String, Object> delSingArrangement(CleanRecord cleanRecord) {
        int i = iCleanRecordService.deleteSingCleanRecord(cleanRecord.getrQbm());
        this.mapUtils.put("code",i);
        this.mapUtils.put("message","删除成功");
        return mapUtils;
    }

    //新增清洁安排
    @RequestMapping("/insertCleanRecord")
    @ResponseBody
    public Map<String,Object> insertCleanRecord(CleanRecord cleanRecord){
        cleanRecord.setrQbm(uuidRandom());
        int insert =iCleanRecordService.insert(cleanRecord);
        this.mapUtils.put("code",insert);
        this.mapUtils.put("message","新增安排记录成功");
        return mapUtils;
    }

    //修改
    @RequestMapping("/updateCleanRecord")
    @ResponseBody
    public Map<String,Object> updateCleanRecord(CleanRecord cleanRecord){
//        System.out.println("sout");
//        System.out.println(cleanArrangement+"==========");
        int uptRecord = iCleanRecordService.updateCleanRecord(cleanRecord);
        this.mapUtils.put("code",uptRecord);
        this.mapUtils.put("message","修改安排记录成功");
        return mapUtils;
    }

    //添加页面、修改
    @RequestMapping("gotoCleanRecordAdd.shtml")
    public String gotoCleanRecordAdd(CleanRecord cleanRecord){
        return "vege/cleanrecord/addupdCleanRecord";
    }
}
