package com.ai.aisse.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ai.aisse.core.dao.zabbixapi.HistoryZabbixApi;
import com.ai.aisse.core.service.IHistorySv;
import com.ai.aisse.core.vo.HistoryVo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
@Repository
@Transactional
public class HistorySvImpl implements IHistorySv {
	@Autowired
	private HistoryZabbixApi historyZabbixApi;
	@Override
	public List<HistoryVo> getItemsByItemID(String itemid,String value_type) {
		
		JSONArray history = historyZabbixApi.getHistoyByItemID(itemid,value_type);
		List<HistoryVo> historylist = JSON.parseArray(history.toString(), HistoryVo.class);
		return historylist;
	}

}
