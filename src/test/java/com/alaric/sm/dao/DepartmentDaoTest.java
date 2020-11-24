package com.alaric.sm.dao;

import com.alaric.sm.entity.Department;
import com.alaric.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class DepartmentDaoTest {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDAOInstance();

    @Test
    public void getAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(departmentList.size());
        assert departmentList != null;
        departmentList.forEach(System.out :: println);
    }
}