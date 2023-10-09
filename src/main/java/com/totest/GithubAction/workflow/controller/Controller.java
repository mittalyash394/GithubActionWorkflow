package com.totest.GithubAction.workflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("root")
    public String root(){
        return "This is home page";
    }

}
