package com.zhidi.dao.impl;

import com.zhidi.dao.IDeptDao;
import com.zhidi.entity.Dept;
import com.zhidi.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/8/14.
 */
public class DeptDaoImpl implements IDeptDao {
    public List<Dept> query() {
        return MybatisUtil.getSession().selectList("com.zhidi.entity.Dept.query");
    }

    public void delete() {
        SqlSession session = MybatisUtil.getSession();
        session.delete("com.zhidi.entity.Dept.delete",13);
        session.commit();
        session.close();
    }
}
