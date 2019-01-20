package com.zking.real.system.mapper;

import com.zking.real.system.model.Compay;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CompayMapper {
    int deleteByPrimaryKey(String rComid);

    int insert(Compay record);

    int insertSelective(Compay record);

    Compay selectByPrimaryKey(String rComid);

    int updateByPrimaryKeySelective(Compay record);

    int updateByPrimaryKey(Compay record);

    List<Compay> queryCompay(Compay compay);

    List<Map<String,Object>> queryCompayFwlx(String rFwId);
}