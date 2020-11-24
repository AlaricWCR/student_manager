package com.alaric.sm.dao;

import com.alaric.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO院系DAO接口
 * @Author Alaric
 * @Date 2020/11/23
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws SQLException 异常
     */
    List<Department> getAll() throws SQLException;
}
