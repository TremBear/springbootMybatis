package com.ucarspringboot.demo.mapper;

import com.ucarspringboot.demo.model.Issues;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IssuesDao {
   List<Issues> findById(@Param("id") String id);
}
