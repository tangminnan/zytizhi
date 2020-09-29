package com.liudiaowenjuan.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudiaowenjuan.information.dao.ZhongyiRecordDetailsDao;
import com.liudiaowenjuan.information.domain.ZhongyiRecordDetailsDO;
import com.liudiaowenjuan.information.service.ZhongyiRecordDetailsService;

import java.util.List;
import java.util.Map;



@Service
public class ZhongyiRecordDetailsServiceImpl implements ZhongyiRecordDetailsService {
	@Autowired
	private ZhongyiRecordDetailsDao chanpinRecordDetailsDao;
	
	@Override
	public ZhongyiRecordDetailsDO get(Integer id){
		return chanpinRecordDetailsDao.get(id);
	}
	
	@Override
	public List<ZhongyiRecordDetailsDO> list(Map<String, Object> map){
		return chanpinRecordDetailsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chanpinRecordDetailsDao.count(map);
	}
	
	@Override
	public int save(ZhongyiRecordDetailsDO chanpinRecordDetails){
		return chanpinRecordDetailsDao.save(chanpinRecordDetails);
	}
	
	@Override
	public int update(ZhongyiRecordDetailsDO chanpinRecordDetails){
		return chanpinRecordDetailsDao.update(chanpinRecordDetails);
	}
	
	@Override
	public int remove(Integer id){
		return chanpinRecordDetailsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chanpinRecordDetailsDao.batchRemove(ids);
	}
	
}
