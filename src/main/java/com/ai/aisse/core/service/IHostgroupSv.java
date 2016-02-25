package com.ai.aisse.core.service;

import java.util.List;

import com.ai.aisse.core.po.Hostgrouptype;
import com.ai.aisse.core.vo.HostgroupVo;

public interface IHostgroupSv {

	List<HostgroupVo> getgroupByAuth();
	 Hostgrouptype gettyprBygroupID(int groupid);
	List<HostgroupVo> getgroupByType();
	
}
