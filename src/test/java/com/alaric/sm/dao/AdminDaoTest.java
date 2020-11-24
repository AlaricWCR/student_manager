package com.alaric.sm.dao;

import com.alaric.sm.entity.Admin;
import com.alaric.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Test
    public void findAdminByAccount() {
        Admin admin;
        try {
            admin = adminDao.findAdminByAccount("1872164629@qq.com");
            assertEquals("王成瑞", admin.getAdminName());
            System.out.println(admin);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}