package com.txw.mapper.order;

import com.txw.model.order.OrderVo;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderVo record);

    int insertSelective(OrderVo record);

    OrderVo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderVo record);

    int updateByPrimaryKey(OrderVo record);
}