package com.finals.sys.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.sys.mapper.GoodsGroupMapper;
import com.finals.sys.model.GoodsGroup;
import com.finals.sys.model.GoodsGroupExample;
import com.finals.sys.service.GoodsGroupService;

/**
 * GoodsGroup Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class GoodsGroupServiceImpl extends BaseServiceImpl<GoodsGroupMapper, GoodsGroup, GoodsGroupExample> implements GoodsGroupService {
	
}