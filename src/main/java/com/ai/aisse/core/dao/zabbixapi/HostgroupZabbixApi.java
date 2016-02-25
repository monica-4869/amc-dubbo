package com.ai.aisse.core.dao.zabbixapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.ai.aisse.core.constants.BaseinfoConstants;
import com.ai.aisse.core.vo.HostgroupVo;
import com.ai.aisse.utils.ZabbixApiUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

@Repository
public class HostgroupZabbixApi {

	private static final Logger logger = LogManager
			.getLogger(HostgroupZabbixApi.class.getName());

	public JSONArray getgroupByAuth()  {
		String Auth = BaseinfoConstants.AUTH;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("output", "extend");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jsonrpc", "2.0");
		map.put("method", "hostgroup.get");
		map.put("params", params);
		map.put("auth", Auth);
		map.put("id", 0);
		String param = JSON.toJSONString(map);
		JSONArray json = null;
		try {
			String response = ZabbixApiUtil.sendPost(param);
			json = JSON.parseObject(response).getJSONArray("result");
			logger.info("Hostgroup 的  ZabbixApi 返回成功");
			System.out.println("Hostgroup 的  ZabbixApi 返回成功");
		} catch (Exception e) {
			logger.info("Hostgroup 的  ZabbixApi 返回失败");
			System.out.println("Hostgroup 的  ZabbixApi 返回失败");
		}

		return json;
	}
}
