package com.ai.aisse.core.dao.mapper;

import com.ai.aisse.core.po.DemoTable;

/**
 * 实例
 * @author archer
 *
 */

public interface IDemoTableDao {
	
	public int insertdemo(DemoTable user);
	public DemoTable selectone(int sid);
	
}
