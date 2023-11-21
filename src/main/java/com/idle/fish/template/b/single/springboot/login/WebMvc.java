package com.idle.fish.template.b.single.springboot.login;

import com.idle.fish.template.basic.login.UserAuthInterceptor;
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
    private UserAuthInterceptor userAuthInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 权限拦截器
        registry.addInterceptor(userAuthInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/**/uploadFile")
                .excludePathPatterns("/doc/**")
                .excludePathPatterns("/login/**")
        ;
    }
}
