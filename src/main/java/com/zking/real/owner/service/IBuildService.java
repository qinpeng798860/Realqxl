package com.zking.real.owner.service;

import com.zking.real.owner.model.Build;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IBuildService {

    List<Build> queryBuild();
}