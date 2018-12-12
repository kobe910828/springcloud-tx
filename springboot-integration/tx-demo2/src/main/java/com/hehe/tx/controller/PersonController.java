package com.hehe.tx.controller;

import com.hehe.tx.domain.Person;
import com.hehe.tx.service.PersonService;
import com.hehe.tx.vo.BaseResultVo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/12/12 14:34
 */
@RestController
@RequestMapping("/demo2/")
public class PersonController {
    @Resource
    private PersonService personService;

    @PostMapping("insert")
    public BaseResultVo insertPerson(@RequestBody Person person){
        personService.insertPerson(person);
        return new BaseResultVo();
    }
}
