package com.alaric.sm.factory;

import com.alaric.sm.entity.Admin;
import com.alaric.sm.entity.Department;
import com.alaric.sm.service.AdminService;
import com.alaric.sm.service.DepartmentService;
import com.alaric.sm.service.impl.AdminServiceImpl;
import com.alaric.sm.service.impl.DepartmentServiceImpl;

import java.util.List;

/**
 * @ClassName ServiceFactory
 * @Description TODO 工厂类
 * @Author Alaric
 * @Date 2020/11/23
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImpl();
    }

    public static DepartmentService getDepartmentServiceInstance() {
        return new DepartmentServiceImpl();
    }
}
