package com.zking.real.system.mapper;

import com.zking.real.system.model.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DictMapper {

    List<Dict> queryDict(Dict dict);


}