package com.finals.bank.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.bank.mapper.BankIcbcMapper;
import com.finals.bank.model.BankIcbc;
import com.finals.bank.model.BankIcbcExample;
import com.finals.bank.service.BankIcbcService;
import com.finals.common.db.template.BaseServiceImpl;

/**
 * BankIcbc Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class BankIcbcServiceImpl extends BaseServiceImpl<BankIcbcMapper, BankIcbc, BankIcbcExample> implements BankIcbcService {
	
}