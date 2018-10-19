package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2018/10/18 11:56
 * @Version V1.0
 */
public interface UserService {

    List<User> findAll();

    User findOne(Integer id);

    void update(User user);
}
