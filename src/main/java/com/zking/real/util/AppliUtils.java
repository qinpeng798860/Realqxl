package com.zking.real.util;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AppliUtils {


    /**
     * 分页Pagebean
     */
    protected PageBean bean = new PageBean();

    /**
     * 处理结果码
     */
    protected Map<String, Object> mapUtils = new HashMap<String, Object>();

    /**
     * 生成32位的id
     * @return
     */
    public static String uuidRandom(){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    /**
     * 将字符串转换为时间类型
     * @param createDate
     * @return
     * @throws ParseException
     */
    public  Date DateFormat(String createDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date=sdf.parse(createDate);
        return date;
    }

    /**
     * 获取当前系统时间 精确到年月日
     * @param
     * @return
     * @throws ParseException
     */
    public  Date SystemnewDate() throws ParseException {
        long l = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = new Date(l);
        String format = sdf.format(date);
        Date date1 = DateFormat(format);
        return date1;
    }


    /**
     * 获取当前系统时间精确到时分秒
     * @param
     * @return
     * @throws ParseException
     */
    public  Date sysetmDatetime() throws ParseException {
        long l = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        Date date = new Date(l);
        String format = sdf.format(date);
        Date date1 = sdf.parse(format);
        return date1;
    }

}
