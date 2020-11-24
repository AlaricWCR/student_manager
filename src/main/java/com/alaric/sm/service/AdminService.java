package com.alaric.sm.service;

import com.alaric.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description TODO Admin业务逻辑接口
 * @Author Alaric
 * @Date 2020/11/23
 **/
public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account  :账号
     * @param password :密码
     * @return ResultEntity：返回结果
     */
    ResultEntity adminLogin(String account, String password);
}
