package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2018/10/18 11:58
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    // 查询所有
    @RequestMapping(value = "/findAll")
    public List<User> findAll(){
        List<User> list = userService.findAll();
        return list;
    }

    // 主键查询
    @RequestMapping(value = "/findOne/{id}")
    public User findOne(@PathVariable("id") Integer id){
        User user = userService.findOne(id);
        return user;
    }

    // 更新
    @RequestMapping(value = "/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

}
