package com.ai.aisse.core.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.aisse.core.rest.IItemApi;
import com.ai.aisse.core.service.IItemSv;
import com.ai.aisse.core.vo.ItemVo;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
@Service
public class ItemApiImpl implements IItemApi {

	@Autowired
	private IItemSv iItemSv;
	
	@Override
	public JSONArray getItemListByHostID(String hostid) {
		
		return iItemSv.getItemListByHostID(hostid);
	}

	@Override
	public List<ItemVo> getItemsByHostID(String hostid) {
		return iItemSv.getItemsByHostID(hostid);
	}

}
