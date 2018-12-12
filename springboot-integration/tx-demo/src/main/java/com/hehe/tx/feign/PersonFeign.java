package com.hehe.tx.feign;

import com.hehe.tx.feign.entity.Person;
import com.hehe.tx.vo.BaseResultVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangdawei
 * @version v1.0
 * @date 2018年04月17日 10:08:16
 */
@FeignClient("tx-demo2")
@RequestMapping("/demo2/")
public interface PersonFeign {

  @PostMapping("insert")
  BaseResultVo insertPerson(@RequestBody Person person);
}
