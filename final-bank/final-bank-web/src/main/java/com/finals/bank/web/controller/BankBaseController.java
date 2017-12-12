package com.finals.bank.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finals.bank.model.BankBase;
import com.finals.bank.model.BankBaseExample;
import com.finals.bank.service.BankBaseService;
import com.finals.common.util.BaseResult;

/**
 * BankBase Controller
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Controller
@RequestMapping("/bank/base")
public class BankBaseController {

	@Autowired
    private BankBaseService bankBaseService;
    
    /**
     * 获取详情
     * @param id
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public Object list(@RequestParam(required = false, value = "offset", defaultValue = "0") int offset,
                       @RequestParam(required = false, value = "limit", defaultValue = "30") int limit,
                       @RequestParam(required = false, value = "sort") String sort,
                       @RequestParam(required = false, value = "order") String order) {
        BankBaseExample example = new BankBaseExample();
        example.setOffset(offset);
        example.setLimit(limit);
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        //其他条件
        
        return bankBaseService.listPageByExample(example);
    }
    
    /**
     * 获取详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object get(@PathVariable("id") Integer id) {
        
        return bankBaseService.selectByPrimaryKey(id);
    }
    
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Object create(BankBase bankBase) {
		
		return BaseResult.success();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Object update(BankBase bankBase) {
        
        return BaseResult.success();
    }
	
	/**
	 * 删除
	 * @param user
	 * @return
	 */
	@RequestMapping("/delete/{id}")
    @ResponseBody
    public Object delete(@PathVariable("id") Integer id) {
        
        return BaseResult.success();
    }
}