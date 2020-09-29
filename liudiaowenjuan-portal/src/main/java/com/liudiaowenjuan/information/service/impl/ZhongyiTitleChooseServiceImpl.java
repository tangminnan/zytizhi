package com.liudiaowenjuan.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liudiaowenjuan.information.dao.ZhongyiTitleChooseDao;
import com.liudiaowenjuan.information.domain.ZhongyiTitleChooseDO;
import com.liudiaowenjuan.information.service.ZhongyiTitleChooseService;

import java.util.List;
import java.util.Map;



@Service
public class ZhongyiTitleChooseServiceImpl implements ZhongyiTitleChooseService {
	@Autowired
	private ZhongyiTitleChooseDao chanpinTitleChooseDao;
	
	@Override
	public ZhongyiTitleChooseDO get(Integer id){
		return chanpinTitleChooseDao.get(id);
	}
	
	@Override
	public List<ZhongyiTitleChooseDO> list(Map<String, Object> map){
		return chanpinTitleChooseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return chanpinTitleChooseDao.count(map);
	}
	
	@Override
	public int save(ZhongyiTitleChooseDO chanpinTitleChoose){
		return chanpinTitleChooseDao.save(chanpinTitleChoose);
	}
	
	@Override
	public int update(ZhongyiTitleChooseDO chanpinTitleChoose){
		return chanpinTitleChooseDao.update(chanpinTitleChoose);
	}
	
	@Override
	public int remove(Integer id){
		return chanpinTitleChooseDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return chanpinTitleChooseDao.batchRemove(ids);
	}
	
}
