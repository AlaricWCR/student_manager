package com.alaric.sm.factory;

import com.alaric.sm.service.*;
import com.alaric.sm.service.impl.*;


/**
 * @ClassName ServiceFactory
 * @Description Service工厂类
 * @Author Alaric
 * @Date 2020/11/14
 **/

public class ServiceFactory {
    public static com.alaric.sm.service.AdminService getAdminServiceInstance() {

        return new com.alaric.sm.service.impl.AdminServiceImpl();
    }

    public static com.alaric.sm.service.DepartmentService getDepartmentServiceInstance() {
        return new com.alaric.sm.service.impl.DepartmentServiceImpl();
    }


    public static com.alaric.sm.service.ClazzService getClazzServiceInstance() {
        return new com.alaric.sm.service.impl.ClazzServiceImpl();
    }

    public static com.alaric.sm.service.StudentService getStudentServiceInstance(){return new com.alaric.sm.service.impl.StudentServiceImpl() ;}

    public static com.alaric.sm.service.RewardService getRewardServiceInstance(){return new com.alaric.sm.service.impl.RewardServiceImpl();
    }
}

