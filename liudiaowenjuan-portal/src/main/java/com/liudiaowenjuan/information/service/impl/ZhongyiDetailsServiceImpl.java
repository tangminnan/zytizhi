package com.liudiaowenjuan.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudiaowenjuan.information.dao.ZhongyiDetailsDao;
import com.liudiaowenjuan.information.domain.ZhongyiDetailsDO;
import com.liudiaowenjuan.information.service.ZhongyiDetailsService;

import java.util.List;
import java.util.Map;



@Service
public class ZhongyiDetailsServiceImpl implements ZhongyiDetailsService {
	@Autowired
	private ZhongyiDetailsDao chanpinDetailsDao;
	
	@Override
	public ZhongyiDetailsDO get(Integer id){
		return chanpinDetailsDao.get(id);
	}
	
	@Override
	public List<ZhongyiDetailsDO> list(Map<String, Object> map){
		return chanpinDetailsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chanpinDetailsDao.count(map);
	}
	
	@Override
	public int save(ZhongyiDetailsDO chanpinDetails){
		return chanpinDetailsDao.save(chanpinDetails);
	}
	
	@Override
	public int update(ZhongyiDetailsDO chanpinDetails){
		return chanpinDetailsDao.update(chanpinDetails);
	}
	
	@Override
	public int remove(Integer id){
		return chanpinDetailsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chanpinDetailsDao.batchRemove(ids);
	}
	
}
