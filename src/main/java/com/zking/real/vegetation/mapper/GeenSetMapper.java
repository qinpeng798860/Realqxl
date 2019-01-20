package com.zking.real.vegetation.mapper;

import com.zking.real.vegetation.model.GeenSet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GeenSetMapper {
    int insert(GeenSet record);

    int updateGeenSet(GeenSet record);

    int deleteSingGeenSet(String rGbm);

    List<Map<String,Object>> queryGeenSetPager(GeenSet geenSet);
}