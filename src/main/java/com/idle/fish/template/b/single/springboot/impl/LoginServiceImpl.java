package com.idle.fish.template.b.single.springboot.impl;

import com.idle.fish.tamplate.basic.user.BasicUser;
import com.idle.fish.template.basic.login.LoginService;
import com.idle.fish.template.basic.exception.Asserts;
import org.springframework.stereotype.Service;

/**
 * @author idle fish
 * @since 2023/11/21
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Override
    public BasicUser loginByUsernamePassword(String username, String password) {
        Asserts.equals(username, "admin", "用户名或密码错误");
        Asserts.equals(password, "123456", "用户名或密码错误");
        BasicUser basicUser = new BasicUser();
        basicUser.setUsername("admin");
        basicUser.setId(1L);
        return basicUser;
    }
}
