package com.ai.aisse.core.rest;

import com.ai.aisse.core.vo.UserVo;
/*
 * 获取用户token的接口类
 * monica
 * 
 */

public interface UserTokenApi {

	public  UserVo getTokenByUser(UserVo user);	
}
