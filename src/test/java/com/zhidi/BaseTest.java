package com.zhidi;

import com.zhidi.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

/**
 * Created by lx on 2017/8/14.
 */
public class BaseTest {

    protected SqlSession sqlSession;

    @Before
    public void beforeMethod() {
        sqlSession = MybatisUtil.getSession();
    }

    @After
    public void afterMehod() {
        sqlSession.commit();
        sqlSession.close();
    }
}
