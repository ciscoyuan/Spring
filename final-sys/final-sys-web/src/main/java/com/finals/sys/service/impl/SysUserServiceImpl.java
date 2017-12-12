package com.finals.sys.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.sys.mapper.SysUserMapper;
import com.finals.sys.model.SysUser;
import com.finals.sys.model.SysUserExample;
import com.finals.sys.service.SysUserService;

/**
 * SysUser Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, SysUser, SysUserExample> implements SysUserService {
	
}