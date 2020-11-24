package com.alaric.sm.service.impl;

import com.alaric.sm.dao.DepartmentDao;
import com.alaric.sm.entity.Department;
import com.alaric.sm.factory.DaoFactory;
import com.alaric.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/24
 **/
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao =  DaoFactory.getDepartmentDAOInstance();

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getAll();
        } catch (SQLException e) {
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;
    }
}
