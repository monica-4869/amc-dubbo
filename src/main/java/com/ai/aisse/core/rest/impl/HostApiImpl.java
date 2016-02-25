package com.ai.aisse.core.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.aisse.core.dao.zabbixapi.HostZabbixApi;
import com.ai.aisse.core.rest.IHostApi;
import com.ai.aisse.core.service.IHostSv;
import com.ai.aisse.core.vo.HostVo;
import com.ai.aisse.core.vo.InterfaceVo;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
@Service
public class HostApiImpl implements IHostApi {

	@Autowired
	private IHostSv iHostSv;
	@Override
	public List<HostVo> getHostListByAuth() {
		
		return iHostSv.getHostListByAuth();
	}
	@Override
	public List<HostVo> getHostListByGroupID(String groupid) {
	
		return iHostSv.getHostListByGroupID(groupid);
	}
	@Override
	public JSONArray getHostAll() {
		
		return iHostSv.getHostAll();
	}

}
