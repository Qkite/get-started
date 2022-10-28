package com.springboot.getstarted.controller;

import com.springboot.getstarted.domain.MemberDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping(value = "/member1")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder stringBuilder = new StringBuilder();

        postData.entrySet().forEach(map -> {
            stringBuilder.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return stringBuilder.toString();
    }

    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
}
