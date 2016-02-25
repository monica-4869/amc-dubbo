package com.ai.aisse.core.rest;


import com.ai.aisse.core.po.DemoTable;
import com.ai.aisse.core.vo.DemoTableVo;

/**
 * DemoApi 示例Api接口定义
 * @author archer
 *  *
 */

public interface IDemoApi {	
	
	
	public int  insertDemo(DemoTable param);	
	public DemoTable  selectone(int sid);	
	

}
