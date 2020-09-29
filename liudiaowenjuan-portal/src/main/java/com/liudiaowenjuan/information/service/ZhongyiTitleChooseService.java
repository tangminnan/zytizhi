package com.liudiaowenjuan.information.service;

import java.util.List;
import java.util.Map;

import com.liudiaowenjuan.information.domain.ZhongyiTitleChooseDO;

/**
 * 
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-06-17 18:16:53
 */
public interface ZhongyiTitleChooseService {
	
	ZhongyiTitleChooseDO get(Integer id);
	
	List<ZhongyiTitleChooseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZhongyiTitleChooseDO chanpinTitleChoose);
	
	int update(ZhongyiTitleChooseDO chanpinTitleChoose);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
