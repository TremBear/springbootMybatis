package com.ucarspringboot.demo.controller;

import com.ucarspringboot.demo.model.Issues;
import com.ucarspringboot.demo.service.IssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueController {
    @Autowired
    IssuesService issuesService;
    @RequestMapping("/api/user")
    @ResponseBody
    public String s(@RequestParam String id){
        List<Issues> list= issuesService.getIssues(id);
        if (list!=null){
            return list.get(0).getKee();
        }
        return "can't find";
    }
}
