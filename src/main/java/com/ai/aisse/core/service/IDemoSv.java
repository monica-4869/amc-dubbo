package com.ai.aisse.core.service;

import com.ai.aisse.core.po.DemoTable;

/**
 * 实例
 * 
 * @author archer
 * 
 */
public interface IDemoSv {
	public int insertdemo(DemoTable param);

	public int selectone(int sid);

}
