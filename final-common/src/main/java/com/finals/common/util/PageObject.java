package com.finals.common.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageObject {

	private Long total;
	
	private List<?> rows;
	
	private Map<String, Object> map=new HashMap<>();

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "PageObject [total=" + total + ", rows=" + rows + ", map=" + map + "]";
	}
	
}
