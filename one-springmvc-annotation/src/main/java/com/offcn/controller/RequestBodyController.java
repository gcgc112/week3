package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestBodyController {

    @RequestMapping("requestbody.do")
    @ResponseBody
    public Map<String, String> requestbody(@RequestBody Person person) {
        System.out.println("person = " + person);

        Map<String, String> map = new HashMap<>();
        map.put("key", "200");
        return map;
    }

}
