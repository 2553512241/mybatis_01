package com.zhidi.test;

import com.zhidi.entity.Dept;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by lx on 2017/8/14.
 */
public class TestMybatis {

    public static void main(String[] args) {
        //读取核心配置
        InputStream in = TestMybatis.class.getResourceAsStream("/mybatis-config.xml");
        //创建SessionFactory的构建器
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //通过SessionFactory的构建器创建SessionFactory
        SqlSessionFactory factory = builder.build(in);

        //获取session
        SqlSession session = factory.openSession();

        Dept dept = new Dept();
        dept.setDname("嘿嘿");
        dept.setLoc("aa");

        int rows = session.insert("com.zhidi.entity.Dept.add", dept);
        if (rows>0) {
            System.out.println("保存成功");
        } else {
            System.out.println("保存失败");
        }
        //提交事务
        session.commit();
        //关闭session
        session.close();
    }
}
