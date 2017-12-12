package com.finals.acc.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finals.acc.model.AccLog;
import com.finals.acc.model.AccLogExample;
import com.finals.acc.service.AccLogService;
import com.finals.common.util.BaseResult;

/**
 * AccLog Controller
 * @author auto generate v1.0
 * @version 1.0, 2017/12/10
 */
@Controller
@RequestMapping("/acc/log")
public class AccLogController {

	@Autowired
    private AccLogService accLogService;
    
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
        AccLogExample example = new AccLogExample();
        example.setOffset(offset);
        example.setLimit(limit);
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        //其他条件
        
        return accLogService.listPageByExample(example);
    }
    
    /**
     * 获取详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object get(@PathVariable("id") Integer id) {
        
        return accLogService.selectByPrimaryKey(id);
    }
    
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Object create(AccLog accLog) {
		
		return BaseResult.success();
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Object update(AccLog accLog) {
        
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