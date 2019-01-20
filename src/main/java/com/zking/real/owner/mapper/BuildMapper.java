package com.zking.real.owner.mapper;

import com.zking.real.owner.model.Build;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface BuildMapper {

    List<Build> queryBuild();
}