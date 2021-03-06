package com.rkylin.settle.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rkylin.database.BaseDao;
import com.rkylin.settle.dao.StoredProcedureDao;

@Repository("storedProcedureDao")
public class StoredProcedureDaoImpl extends BaseDao implements StoredProcedureDao {
	/***
	 * 获取T-1日账户交易信息的存储过程
	 * @return
	 */
//	@Override
//	public Map<String, String> proSyncActTrans(Map<String, String> example) {
//		super.getSqlSession().selectList("StoredProcedureMap.pro_sync_act_trans", example);
//		return example;
//	}
	/***
	 * 获取T-1日账户(一期)交易信息的存储过程 MyCat版本
	 * @return
	 */
	@Override
	public Map<String, Object> proSyncActTrans(Map<String, Object> example) {
		List<Map<String, Object>> list = super.getSqlSession().selectList("StoredProcedureMap.pro_sync_act_trans_acc1", example);
		return list.get(0);
	}
	/***
	 * 获取T-1日账户(二期)交易信息的存储过程 MyCat版本
	 * @return
	 */
	@Override
	public Map<String, Object> proSyncActTrans2(Map<String, Object> example) {
		List<Map<String, Object>> list = super.getSqlSession().selectList("StoredProcedureMap.pro_sync_act_trans_acc2", example);
		return list.get(0);
	}
}
