package com.gateway.service;

import com.gateway.entity.User;

/**
 * @author z
 */
public interface UserService {
    /**
     * 用户登录函数
     * @param username
     * @param password
     * @return
     */
    String logIn(String username,String password);

    /**
     * 仅仅允许管理员增加用户并且设置修改用户密码
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 仅仅允许管理员增加用户并且设置修改用户密码
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户仅仅允许管理员操作
     * @param id
     * @return
     */
    int deleteUser(int id);


    //设置用户权限
    int setUserAuthority();
}
