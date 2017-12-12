package com.finals.order.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.order.mapper.OrderDetailMapper;
import com.finals.order.model.OrderDetail;
import com.finals.order.model.OrderDetailExample;
import com.finals.order.service.OrderDetailService;

/**
 * OrderDetail Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetailMapper, OrderDetail, OrderDetailExample> implements OrderDetailService {
	
}