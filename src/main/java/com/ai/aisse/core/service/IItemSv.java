package com.ai.aisse.core.service;

import java.util.List;

import com.ai.aisse.core.vo.HostVo;
import com.ai.aisse.core.vo.ItemVo;
import com.alibaba.fastjson.JSONArray;

public interface IItemSv {
     

	JSONArray getItemListByHostID(String hostid);
	List<ItemVo> getItemsByHostID(String hostid);
}
