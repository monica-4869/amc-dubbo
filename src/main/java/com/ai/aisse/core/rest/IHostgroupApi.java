package com.ai.aisse.core.rest;

import java.util.List;

import com.ai.aisse.core.po.Hostgrouptype;
import com.ai.aisse.core.vo.HostgroupVo;
import com.ai.aisse.core.vo.UserVo;

public interface IHostgroupApi {
	
	
	
       List<HostgroupVo> getgroupByAuth( ) throws Exception;
       Hostgrouptype gettyprBygroupID(int groupid);
       List<HostgroupVo> getgroupByType();
       
}
