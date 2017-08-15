package com.zhidi;

import com.zhidi.entity.Dept;
import org.junit.Test;

import java.util.List;

/**
 * Created by lx on 2017/8/14.
 */
public class TestMybatisApi extends BaseTest {

    @Test
    public void testDelete() {
    /**
      * 数据库操作的第一个参数是：映射文件的namespace.sql标签的id，
     */
        int rows = sqlSession.delete("com.zhidi.entity.Dept.delete", 32);
        if (rows > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void testUpdate() {
        Dept dept = new Dept();
        dept.setDeptno(13);
        dept.setDname("执念师");
        dept.setLoc("联盟");
        int rows = sqlSession.update("com.zhidi.entity.Dept.edit", dept);
        if (rows > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void testQuery() {
        List<Dept> list = sqlSession.selectList("com.zhidi.entity.Dept.query");
        System.out.println(list.size());
    }
}
