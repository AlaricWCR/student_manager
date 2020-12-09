package com.alaric.sm.service;

import com.alaric.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description DepartmentService
 * @Author Alaric
 * @Date 2020/11/17
 **/
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     */
    List<Department> selectAll();

    /**
     * 新增院系
     *
     * @param  department入参
     * @return int
     */
     int addDepartment(Department department);

     int delDepartment(Department department,Integer id);

}
