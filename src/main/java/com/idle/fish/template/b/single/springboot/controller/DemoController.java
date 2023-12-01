package com.idle.fish.template.b.single.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author idle fish
 * @since 2023/11/21
 */
@Slf4j
@RequestMapping("/demo")
@RestController
public class DemoController {

    @GetMapping("/test")
    public List<String> test(@RequestBody Map<String,Object> map) {
        System.out.println(map);
        List<String> ret = new ArrayList<>();
        ret.add("hello");
        ret.add("world");
        return ret;
    }


    @GetMapping("/exception")
    public void exception() {
        int i = 1 / 0;
    }
}
