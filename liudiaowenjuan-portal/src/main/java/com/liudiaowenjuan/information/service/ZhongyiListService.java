package com.liudiaowenjuan.information.service;

import java.util.List;
import java.util.Map;

import com.liudiaowenjuan.information.domain.ZhongyiListDO;

/**
 * 
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-06-17 18:16:53
 */
public interface ZhongyiListService {
	
	ZhongyiListDO get(Integer id);
	
	List<ZhongyiListDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZhongyiListDO chanpinList);
	
	int update(ZhongyiListDO chanpinList);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
