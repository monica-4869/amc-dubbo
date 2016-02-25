package com.ai.aisse.core.service;

import java.util.List;

import com.ai.aisse.core.vo.HistoryVo;


public interface IHistorySv {
     
	List<HistoryVo> getItemsByItemID(String itemid,String value_type);
}
