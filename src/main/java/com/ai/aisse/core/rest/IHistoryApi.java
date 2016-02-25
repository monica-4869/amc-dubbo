package com.ai.aisse.core.rest;

import java.util.List;

import com.ai.aisse.core.vo.HistoryVo;

public interface IHistoryApi {
	List<HistoryVo> getItemsByItemID(String itemid,String value_type);
}
