package com.devops.study.devopsdemo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.study.devopsdemo.domain.UserRequestDTO;
import com.devops.study.devopsdemo.domain.UserResponseDTO;
import com.devops.study.devopsdemo.service.DockerService;

@RestController
@RequestMapping("/api/v1/devops")
public class DevOpsCtrl {
    @Autowired
    private DockerService dockerService;
    
    @GetMapping("/greeting")
    public String test(){
        System.out.println("debug >>> devopsctrl");
        return "hi";
    }

    @PostMapping("/login")
    public UserResponseDTO login(@RequestBody UserRequestDTO params) {
        System.out.println("debug >> endpoint : /api/v1/devops/login");
        return dockerService.login(params);
    }

    @PostMapping("/join")
    public String join(@RequestBody UserRequestDTO params) {
        System.out.println("debug >> endpoint : /api/v1/devops/join");
        dockerService.join(params);
        return "join success";
    }
}
