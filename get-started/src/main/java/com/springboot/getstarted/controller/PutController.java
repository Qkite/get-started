package com.springboot.getstarted.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, Object> putData){
        StringBuilder stringBuilder = new StringBuilder();

        putData.entrySet().forEach(map -> {
            stringBuilder.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return stringBuilder.toString();
    }
}
