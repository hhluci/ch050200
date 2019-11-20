package nuc.edu.cn.mybatis.controller;

import nuc.edu.cn.mybatis.mapper.UserMapper;
import nuc.edu.cn.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;
 /*   @InitBinder
    public void webDataBinder(WebDataBinder dataBinder){
        dataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }*/
    @GetMapping("finduser/{id}")
    public User findUserById(@PathVariable Integer id){
        return userMapper.findUserById(id);
    }
    @GetMapping("insertUser")
    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;

    }
}
