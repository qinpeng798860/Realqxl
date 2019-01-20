package com.zking.real.estate.service;

import com.zking.real.estate.model.Residential;
import com.zking.real.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IResidentialService {
    int addHomes(Residential residential);
    List<Residential> queryListResidential(Residential residential, PageBean pageBean);
    int DelResidential(Residential residential);

}

