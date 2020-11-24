package com.alaric.sm.factory;

import com.alaric.sm.dao.AdminDao;
import com.alaric.sm.dao.DepartmentDao;
import com.alaric.sm.dao.impl.AdminDaoImpl;
import com.alaric.sm.dao.impl.DepartmentDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description TODO 工厂类
 * @Author Alaric
 * @Date 2020/11/23
 **/
public class DaoFactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImpl();
    }
    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentDAOInstance() {
        return new DepartmentDaoImpl();
    }
}
