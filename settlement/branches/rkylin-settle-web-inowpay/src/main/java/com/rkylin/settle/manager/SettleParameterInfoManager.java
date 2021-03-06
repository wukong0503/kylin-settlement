/*
 * Powered By chanjetpay-code-generator
 * Web Site: http://www.chanjetpay.com
 * Since 2014 - 2015
 */

package com.rkylin.settle.manager;

import java.util.List;

import com.rkylin.settle.pojo.SettleParameterInfo;
import com.rkylin.settle.pojo.SettleParameterInfoQuery;

public interface SettleParameterInfoManager {
	int saveSettleParameterInfo(SettleParameterInfo settleParameterInfo);

	int updateSettleParameterInfo(SettleParameterInfo settleParameterInfo);
	
	SettleParameterInfo findSettleParameterInfoById(Long id);
	
	List<SettleParameterInfo> queryList(SettleParameterInfoQuery query);
	
	void deleteSettleParameterInfoById(Long id);
	
	void deleteSettleParameterInfo(SettleParameterInfoQuery query);
	
	List<SettleParameterInfo> queryPage(SettleParameterInfoQuery query);
    
    int countByExample(SettleParameterInfoQuery query);
}
