package com.finals.sys.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.sys.mapper.UserBankMapper;
import com.finals.sys.model.UserBank;
import com.finals.sys.model.UserBankExample;
import com.finals.sys.service.UserBankService;

/**
 * UserBank Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class UserBankServiceImpl extends BaseServiceImpl<UserBankMapper, UserBank, UserBankExample> implements UserBankService {
	
}