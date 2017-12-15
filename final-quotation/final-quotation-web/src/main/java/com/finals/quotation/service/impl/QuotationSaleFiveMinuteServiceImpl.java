package com.finals.quotation.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.quotation.mapper.QuotationSaleFiveMinuteMapper;
import com.finals.quotation.model.QuotationSaleFiveMinute;
import com.finals.quotation.model.QuotationSaleFiveMinuteExample;
import com.finals.quotation.service.QuotationSaleFiveMinuteService;

/**
 * QuotationSaleFiveMinute Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class QuotationSaleFiveMinuteServiceImpl extends BaseServiceImpl<QuotationSaleFiveMinuteMapper, QuotationSaleFiveMinute, QuotationSaleFiveMinuteExample> implements QuotationSaleFiveMinuteService {
	
}