package com.finals.acc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.acc.mapper.AccLogMapper;
import com.finals.acc.model.AccLog;
import com.finals.acc.model.AccLogExample;
import com.finals.acc.service.AccLogService;
import com.finals.common.db.template.BaseServiceImpl;

/**
 * AccLog Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class AccLogServiceImpl extends BaseServiceImpl<AccLogMapper, AccLog, AccLogExample> implements AccLogService {
	
}