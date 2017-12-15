package com.finals.bank.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.bank.mapper.BankCmbcMapper;
import com.finals.bank.model.BankCmbc;
import com.finals.bank.model.BankCmbcExample;
import com.finals.bank.service.BankCmbcService;
import com.finals.common.db.template.BaseServiceImpl;

/**
 * BankCmbc Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class BankCmbcServiceImpl extends BaseServiceImpl<BankCmbcMapper, BankCmbc, BankCmbcExample> implements BankCmbcService {
	
}