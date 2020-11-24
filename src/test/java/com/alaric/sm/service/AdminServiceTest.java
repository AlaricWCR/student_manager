package com.alaric.sm.service;

import com.alaric.sm.factory.ServiceFactory;
import com.alaric.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService = ServiceFactory.getAdminServiceInstance();

    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("1872164629@qq.com","1234");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}