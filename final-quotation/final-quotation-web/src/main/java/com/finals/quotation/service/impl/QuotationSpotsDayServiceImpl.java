package com.finals.quotation.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.quotation.mapper.QuotationSpotsDayMapper;
import com.finals.quotation.model.QuotationSpotsDay;
import com.finals.quotation.model.QuotationSpotsDayExample;
import com.finals.quotation.service.QuotationSpotsDayService;

/**
 * QuotationSpotsDay Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class QuotationSpotsDayServiceImpl extends BaseServiceImpl<QuotationSpotsDayMapper, QuotationSpotsDay, QuotationSpotsDayExample> implements QuotationSpotsDayService {
	
}