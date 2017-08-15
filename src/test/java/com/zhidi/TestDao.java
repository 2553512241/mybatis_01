package com.zhidi;

import com.zhidi.dao.IEmpDao;
import com.zhidi.entity.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/14.
 */
public class TestDao extends BaseTest {

    @Test
    public void testAdd() {
        IEmpDao empDao = sqlSession.getMapper(IEmpDao.class);
        Emp emp = new Emp();
        emp.setEname("风");
        emp.setSal(new BigDecimal(1000));
        emp.setJob("助人");
        emp.setHiredate(new Date());
        emp.setDeptno(15);
        empDao.add(emp);

    }
}
