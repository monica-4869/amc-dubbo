package com.ai.aisse.core.dao.zabbixapi;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.mybatis.generator.codegen.ibatis2.sqlmap.elements.CountByExampleElementGenerator;
import org.springframework.stereotype.Repository;

import com.ai.aisse.core.constants.BaseinfoConstants;
import com.ai.aisse.core.vo.InterfaceVo;
import com.ai.aisse.utils.ZabbixApiUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mysql.fabric.xmlrpc.base.Array;
@Repository
public class ItemZabbixApi {

	private static final Logger logger = LogManager
			.getLogger(ItemZabbixApi.class.getName());
	
	private String Auth = BaseinfoConstants.AUTH;
	/*
	 * 获取指定主机下的指标项
	 */
	public JSONArray getItemListByHostID(String hostid) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("output", "extend");
		params.put("hostids", hostid);
		params.put("selectApplications", "extend");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jsonrpc", "2.0");
		map.put("method", "item.get");
		map.put("params", params);
		map.put("auth", Auth);
		map.put("id", 0);
		String param = JSON.toJSONString(map);
		JSONArray json = null;

		try {
			String response = ZabbixApiUtil.sendPost(param);
			json = JSON.parseObject(response).getJSONArray("result");
			logger.info("Item 的  ZabbixApi getItemListByHostID 返回成功");
			System.out.println("Host 的  ZabbixApi getItemListByHostID 返回成功");
		} catch (Exception e) {
			logger.info("Item 的  ZabbixApi getItemListByHostID返回失败"+e);
			System.out.println("Host 的  ZabbixApi getItemListByHostID 返回失败");
		}
		return json;

	}

	
}
