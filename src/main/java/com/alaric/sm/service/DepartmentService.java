package com.alaric.sm.service;

import com.alaric.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author Alaric
 * @Date 2020/11/24
 **/
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     */
    List<Department>  selectAll();
}

