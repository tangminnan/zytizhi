package com.liudiaowenjuan.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudiaowenjuan.information.dao.ZhongyiRecordListDao;
import com.liudiaowenjuan.information.domain.ZhongyiRecordListDO;
import com.liudiaowenjuan.information.service.ZhongyiRecordListService;

import java.util.List;
import java.util.Map;



@Service
public class ZhongyiRecordListServiceImpl implements ZhongyiRecordListService {
	@Autowired
	private ZhongyiRecordListDao chanpinRecordListDao;
	
	@Override
	public ZhongyiRecordListDO get(Integer id){
		return chanpinRecordListDao.get(id);
	}
	
	@Override
	public List<ZhongyiRecordListDO> list(Map<String, Object> map){
		return chanpinRecordListDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chanpinRecordListDao.count(map);
	}
	
	@Override
	public int save(ZhongyiRecordListDO chanpinRecordList){
		return chanpinRecordListDao.save(chanpinRecordList);
	}
	
	@Override
	public int update(ZhongyiRecordListDO chanpinRecordList){
		return chanpinRecordListDao.update(chanpinRecordList);
	}
	
	@Override
	public int remove(Integer id){
		return chanpinRecordListDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chanpinRecordListDao.batchRemove(ids);
	}
	
}
