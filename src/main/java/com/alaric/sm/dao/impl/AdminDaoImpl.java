package com.alaric.sm.dao.impl;

import com.alaric.sm.dao.AdminDao;
import com.alaric.sm.entity.Admin;
import com.alaric.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AdminDaoImpl
 * @Description 接口的实现类
 * @Author Alaric
 * @Date 2020/11/14
 **/

public class AdminDaoImpl implements com.alaric.sm.dao.AdminDao {
    @Override
    public Admin findAdminByAccount(String account) throws SQLException{
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT * FROM t_admin WHERE account = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,account);
        ResultSet rs = pstmt.executeQuery();
        Admin admin = null;
        while(rs.next()){
            int id = rs.getInt("id");
            String adminAccount = rs.getString("account");
            String password = rs.getString("password");
            String adminName = rs.getString("admin_name");
            admin = new Admin();
            admin.setId(id);
            admin.setAccount(adminAccount);
            admin.setPassword(password);
            admin.setAdminName(adminName);

        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnect();
        return admin;
    }
}
