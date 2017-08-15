package com.zhidi.dao;

import com.zhidi.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
public interface IDeptDao {

    List<Dept> query();

    void delete();
}
