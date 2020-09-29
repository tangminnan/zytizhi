package com.liudiaowenjuan.information.service;

import java.util.List;
import java.util.Map;

import com.liudiaowenjuan.information.domain.ZhongyiRecordListDO;

/**
 * 
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-06-17 18:16:53
 */
public interface ZhongyiRecordListService {
	
	ZhongyiRecordListDO get(Integer id);
	
	List<ZhongyiRecordListDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZhongyiRecordListDO chanpinRecordList);
	
	int update(ZhongyiRecordListDO chanpinRecordList);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
