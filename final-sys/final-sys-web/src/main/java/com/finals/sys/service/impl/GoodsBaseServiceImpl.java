package com.finals.sys.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.sys.mapper.GoodsBaseMapper;
import com.finals.sys.model.GoodsBase;
import com.finals.sys.model.GoodsBaseExample;
import com.finals.sys.service.GoodsBaseService;

/**
 * GoodsBase Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class GoodsBaseServiceImpl extends BaseServiceImpl<GoodsBaseMapper, GoodsBase, GoodsBaseExample> implements GoodsBaseService {
	
}