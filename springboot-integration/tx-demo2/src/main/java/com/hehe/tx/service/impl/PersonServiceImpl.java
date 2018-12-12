package com.hehe.tx.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.hehe.tx.dao.PersonMapper;
import com.hehe.tx.domain.Person;
import com.hehe.tx.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/12/12 14:38
 */
@Service
public class PersonServiceImpl implements PersonService{
    @Resource
    private PersonMapper personMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    @TxTransaction
    public void insertPerson(Person person) {
        personMapper.insertSelective(person);
    }
}
