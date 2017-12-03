package com.finals.api.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.finals.api.service.UsersService;
import com.finals.common.db.template.BaseServiceImpl;
import com.finals.sys.mapper.UsersMapper;
import com.finals.sys.model.Users;
import com.finals.sys.model.UsersExample;
@Service
public class UsersServiceImpl extends BaseServiceImpl<UsersMapper, Users, UsersExample> implements UsersService {
	
	@Override
	public Users testApi(int key) {
		return selectByPrimaryKey(key);
	}
	
}