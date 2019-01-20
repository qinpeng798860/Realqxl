package com.zking.real.estate.mapper;

import com.zking.real.estate.model.Residential;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface ResidentialMapper {
    int addHomes(Residential residential);

    List<Residential> queryListResidential(Residential residential);

    int DelResidential(Residential residential);



}

