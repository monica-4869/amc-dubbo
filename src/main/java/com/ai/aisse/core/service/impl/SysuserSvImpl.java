package com.ai.aisse.core.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ai.aisse.core.dao.mapper.SysuserMapper;
import com.ai.aisse.core.po.Sysuser;
import com.ai.aisse.core.service.ISysuserSv;
@Repository
@Transactional
public class SysuserSvImpl implements ISysuserSv {

	@Autowired
	private SysuserMapper sysuserMapper;
	
	@Override
	public Sysuser selectByPrimaryKey(Integer id) {
		Sysuser sysuser =new Sysuser();
		sysuser = sysuserMapper.selectByPrimaryKey(id);
		return sysuser;
	}

}
