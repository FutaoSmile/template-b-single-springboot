package com.idle.fish.template.b.single.springboot.login;

import com.idle.fish.template.basic.login.interceptor.LoginAuthInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/21
 */
@Component
public class WebMvc implements WebMvcConfigurer {
    @Resource
    private LoginAuthInterceptor loginAuthInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 权限拦截器
        registry.addInterceptor(loginAuthInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/**/uploadFile")
                .excludePathPatterns("/doc/**")
                .excludePathPatterns("/login/**")
        ;
    }
}
