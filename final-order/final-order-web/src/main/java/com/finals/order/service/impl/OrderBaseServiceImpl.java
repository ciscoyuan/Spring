package com.finals.order.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.order.mapper.OrderBaseMapper;
import com.finals.order.model.OrderBase;
import com.finals.order.model.OrderBaseExample;
import com.finals.order.service.OrderBaseService;

/**
 * OrderBase Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class OrderBaseServiceImpl extends BaseServiceImpl<OrderBaseMapper, OrderBase, OrderBaseExample> implements OrderBaseService {
	
}