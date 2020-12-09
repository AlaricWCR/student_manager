package com.alaric.sm.factory;

import com.alaric.sm.dao.*;
import com.alaric.sm.dao.impl.*;

/**
 * @ClassName DaoFactory
 * @Description 工厂类
 * @Author Alaric
 * @Date 2020/11/14
 **/

public class DaoFactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance(){

        return new AdminDaoImpl();
    }

    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }

    /**
     * 获得ClazzDao实例
     *
     * @return ClazzDao实例
     */
    public static ClazzDao getClazzDaoInstance(){
        return new ClazzDaoImpl();
    }

    /**
     * 获得StudentDao实例
     * @return StudentDao实例
     */
    public static StudentDao getStudentDaoInstance(){return new StudentDaoImpl();
    }

    /**
     * 获得RewardDao实例
     * @return RewardDao
     */
    public static RewardDao getRewardDaoInstance(){
        return new RewardDaoImpl();
    }
}



