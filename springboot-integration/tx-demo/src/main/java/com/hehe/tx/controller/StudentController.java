package com.hehe.tx.controller;

import com.hehe.tx.domain.Student;
import com.hehe.tx.service.StudentService;
import com.hehe.tx.vo.BaseResultVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/12/12 13:59
 */
@RestController
@RequestMapping("/demo/")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping("insert")
    public BaseResultVo insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
        return new BaseResultVo();
    }
}
