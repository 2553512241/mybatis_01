package com.zhidi.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by lx on 2017/8/14.
 */
public class MybatisUtil {

    private static SqlSessionFactory sessionFactory;

    static {
        InputStream in = MybatisUtil.class.getResourceAsStream("/mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    public static SqlSessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }
}
