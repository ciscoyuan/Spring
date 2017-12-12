package com.finals.sys.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.sys.mapper.GoodBaseMapper;
import com.finals.sys.model.GoodBase;
import com.finals.sys.model.GoodBaseExample;
import com.finals.sys.service.GoodBaseService;

@Service
@Transactional
public class GoodBaseServiceImpl extends BaseServiceImpl<GoodBaseMapper, GoodBase, GoodBaseExample> implements GoodBaseService {
	
	
}