package com.finals.acc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.acc.mapper.AccBaseMapper;
import com.finals.acc.model.AccBase;
import com.finals.acc.model.AccBaseExample;
import com.finals.acc.service.AccBaseService;
import com.finals.common.db.template.BaseServiceImpl;

/**
 * AccBase Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class AccBaseServiceImpl extends BaseServiceImpl<AccBaseMapper, AccBase, AccBaseExample> implements AccBaseService {
	
}