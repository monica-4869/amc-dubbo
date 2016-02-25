package com.ai.aisse.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ai.aisse.core.dao.zabbixapi.ItemZabbixApi;
import com.ai.aisse.core.service.IItemSv;
import com.ai.aisse.core.vo.ItemVo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
@Repository
@Transactional
public class ItemSvImpl implements IItemSv {

	@Autowired
	private ItemZabbixApi itemZabbixApi;
	
	
	@Override
	public JSONArray getItemListByHostID(String hostid) {
		
		return itemZabbixApi.getItemListByHostID(hostid);
	}


	@Override
	public List<ItemVo> getItemsByHostID(String hostid) {
		List<ItemVo> items =null;
		items = JSON.parseArray(itemZabbixApi.getItemListByHostID(hostid).toString(), ItemVo.class);
		return items;
	}

}
