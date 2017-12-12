package com.finals.quotation.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finals.common.db.template.BaseServiceImpl;
import com.finals.quotation.mapper.QuotationMapper;
import com.finals.quotation.model.Quotation;
import com.finals.quotation.model.QuotationExample;
import com.finals.quotation.service.QuotationService;

/**
 * Quotation Service实现
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Service
@Transactional
public class QuotationServiceImpl extends BaseServiceImpl<QuotationMapper, Quotation, QuotationExample> implements QuotationService {
	
}