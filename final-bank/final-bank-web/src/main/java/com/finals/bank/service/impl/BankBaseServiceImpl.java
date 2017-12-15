package com.finals.bank.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.bank.mapper.BankBaseMapper;
import com.finals.bank.model.BankBase;
import com.finals.bank.model.BankBaseExample;
import com.finals.bank.service.BankBaseService;
import com.finals.common.db.template.BaseServiceImpl;

/**
 * BankBase Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class BankBaseServiceImpl extends BaseServiceImpl<BankBaseMapper, BankBase, BankBaseExample> implements BankBaseService {
	
}