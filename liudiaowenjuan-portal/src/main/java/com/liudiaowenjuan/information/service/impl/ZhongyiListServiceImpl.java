package com.liudiaowenjuan.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudiaowenjuan.information.dao.ZhongyiListDao;
import com.liudiaowenjuan.information.domain.ZhongyiListDO;
import com.liudiaowenjuan.information.service.ZhongyiListService;

import java.util.List;
import java.util.Map;



@Service
public class ZhongyiListServiceImpl implements ZhongyiListService {
	@Autowired
	private ZhongyiListDao chanpinListDao;
	
	@Override
	public ZhongyiListDO get(Integer id){
		return chanpinListDao.get(id);
	}
	
	@Override
	public List<ZhongyiListDO> list(Map<String, Object> map){
		return chanpinListDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chanpinListDao.count(map);
	}
	
	@Override
	public int save(ZhongyiListDO chanpinList){
		return chanpinListDao.save(chanpinList);
	}
	
	@Override
	public int update(ZhongyiListDO chanpinList){
		return chanpinListDao.update(chanpinList);
	}
	
	@Override
	public int remove(Integer id){
		return chanpinListDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chanpinListDao.batchRemove(ids);
	}
	
}
