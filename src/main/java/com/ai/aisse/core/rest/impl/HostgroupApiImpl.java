package com.ai.aisse.core.rest.impl;









import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.aisse.core.constants.BaseinfoConstants;
import com.ai.aisse.core.dao.zabbixapi.HostgroupZabbixApi;
import com.ai.aisse.core.po.Hostgrouptype;
import com.ai.aisse.core.rest.IHostgroupApi;
import com.ai.aisse.core.service.IHostgroupSv;
import com.ai.aisse.core.vo.HostgroupVo;
import com.ai.aisse.core.vo.UserVo;
import com.ai.aisse.utils.ZabbixApiUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Service
public class HostgroupApiImpl implements IHostgroupApi {

	@Autowired
	private IHostgroupSv iHostgroupSv;
	@Override
	public List<HostgroupVo> getgroupByAuth() throws Exception {
		
        
        return iHostgroupSv.getgroupByAuth();
	}
	@Override
	public Hostgrouptype gettyprBygroupID(int groupid) {
		 
		return iHostgroupSv.gettyprBygroupID(groupid);
	}
	@Override
	public List<HostgroupVo> getgroupByType() {
		System.out.println("---------------HostgroupApiImpl啦啦啦啦啦");
		return iHostgroupSv.getgroupByType();
	}

}
