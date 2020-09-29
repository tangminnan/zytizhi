package com.liudiaowenjuan.information.service;

import java.util.List;
import java.util.Map;

import com.liudiaowenjuan.information.domain.ZhongyiDetailsDO;

/**
 * 
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-06-17 18:16:52
 */
public interface ZhongyiDetailsService {
	
	ZhongyiDetailsDO get(Integer id);
	
	List<ZhongyiDetailsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZhongyiDetailsDO chanpinDetails);
	
	int update(ZhongyiDetailsDO chanpinDetails);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
