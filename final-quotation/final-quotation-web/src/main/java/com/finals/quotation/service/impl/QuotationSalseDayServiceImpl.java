package com.finals.quotation.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.quotation.mapper.QuotationSalseDayMapper;
import com.finals.quotation.model.QuotationSalseDay;
import com.finals.quotation.model.QuotationSalseDayExample;
import com.finals.quotation.service.QuotationSalseDayService;

/**
 * QuotationSalseDay Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class QuotationSalseDayServiceImpl extends BaseServiceImpl<QuotationSalseDayMapper, QuotationSalseDay, QuotationSalseDayExample> implements QuotationSalseDayService {
	
}