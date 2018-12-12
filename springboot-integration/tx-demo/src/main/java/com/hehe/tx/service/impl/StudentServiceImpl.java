package com.hehe.tx.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.hehe.tx.dao.StudentMapper;
import com.hehe.tx.domain.Student;
import com.hehe.tx.feign.PersonFeign;
import com.hehe.tx.feign.entity.Person;
import com.hehe.tx.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/12/12 14:14
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private PersonFeign personFeign;

    @Override
    @Transactional(rollbackFor = Exception.class)
    @TxTransaction(isStart = true)
    public void insertStudent(Student student) {
        Person person = new Person();
        person.setId(2L);
        person.setName("张三");
        person.setAge(20);
        personFeign.insertPerson(person);
        studentMapper.insertSelective(student);
    }
}
