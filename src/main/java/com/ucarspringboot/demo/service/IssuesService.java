package com.ucarspringboot.demo.service;

import com.ucarspringboot.demo.mapper.IssuesDao;
import com.ucarspringboot.demo.model.Issues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuesService {
    @Autowired
    private IssuesDao issuesDao;
    public List<Issues> getIssues(String id){
        return issuesDao.findById(id);
    }

}
