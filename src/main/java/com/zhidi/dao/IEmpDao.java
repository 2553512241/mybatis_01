package com.zhidi.dao;

import com.zhidi.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
public interface IEmpDao {

    void add(Emp emp);

    void delete(Integer empno);

    void update(Emp emp);

    //多个参数时要加注解
    List<Emp> queryById(@Param("startRow") Integer startRow,@Param("fetchSize") Integer fetchSize);


}
