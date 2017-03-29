package com.txw.controller;


import com.txw.mapper.order.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangxiewen on 2017/3/3.
 */
@RestController
public class ComputeController {

    @Autowired
    OrderMapper orderMapper;

    @RequestMapping(value="/getOrders")
    public Object getOrders(){
      return orderMapper.selectByPrimaryKey(4000001L);
    }
}
