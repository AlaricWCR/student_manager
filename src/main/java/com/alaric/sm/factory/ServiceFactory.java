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
    public static com.wl.sm.service.AdminService getAdminServiceInstance() {

        return new com.wl.sm.service.impl.AdminServiceImpl();
    }

    public static com.wl.sm.service.DepartmentService getDepartmentServiceInstance() {
        return new com.wl.sm.service.impl.DepartmentServiceImpl();
    }


    public static com.wl.sm.service.ClazzService getClazzServiceInstance() {
        return new com.wl.sm.service.impl.ClazzServiceImpl();
    }

    public static com.wl.sm.service.StudentService getStudentServiceInstance(){return new com.wl.sm.service.impl.StudentServiceImpl() ;}

    public static com.wl.sm.service.RewardService getRewardServiceInstance(){return new com.wl.sm.service.impl.RewardServiceImpl();
    }
}

