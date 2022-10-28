package com.springboot.getstarted.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @RequestMapping(value = "/hello", method= RequestMethod.GET) // get method를 받도록 함
    public String hello(){
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "Yeonji";
    }

    // Path variable 이용

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String name){
        return name;
    }

    // Query parameter 이용

    @GetMapping(value = "/request1")
    public String getRequestParam1(@RequestParam String name, @RequestParam String email){
        return "name: " + name + ", email: " + email;
    }


    // Map 객체를 이용해서 받아들이기

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder stringBuilder = new StringBuilder();
        param.entrySet().forEach(map -> {
            stringBuilder.append(map.getKey() + " : " + map.getValue() + "]n");
        });

        return stringBuilder.toString();
    }

}
