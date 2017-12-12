package com.finals.acc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.acc.mapper.AccFeeMapper;
import com.finals.acc.model.AccFee;
import com.finals.acc.model.AccFeeExample;
import com.finals.acc.service.AccFeeService;
import com.finals.common.db.template.BaseServiceImpl;

/**
 * AccFee Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class AccFeeServiceImpl extends BaseServiceImpl<AccFeeMapper, AccFee, AccFeeExample> implements AccFeeService {
	
}