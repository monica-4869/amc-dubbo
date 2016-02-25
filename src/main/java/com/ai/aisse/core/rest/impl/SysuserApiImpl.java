package com.ai.aisse.core.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.aisse.core.po.Sysuser;
import com.ai.aisse.core.rest.SysuserApi;
import com.ai.aisse.core.service.ISysuserSv;
import com.alibaba.dubbo.config.annotation.Service;
@Service
public class SysuserApiImpl implements SysuserApi {

	@Autowired
	private ISysuserSv sysSv;
	
	@Override
	public Sysuser selectByPrimaryKey(Integer id) {
		Sysuser sysuser = new Sysuser();
		sysuser =sysSv.selectByPrimaryKey(id);
		
		return sysuser;
	}

}
