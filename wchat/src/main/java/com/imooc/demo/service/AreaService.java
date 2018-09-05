package com.imooc.demo.service;

import com.imooc.demo.entity.Area;

import java.util.List;

/**
 * Created by yrui on 2018/9/3.
 */
public interface AreaService {
    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int areaId);
}
