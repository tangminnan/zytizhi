package com.liudiaowenjuan.information.service;

import java.util.List;
import java.util.Map;

import com.liudiaowenjuan.information.domain.ZhongyiRecordDetailsDO;

/**
 * 
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2020-06-17 18:16:53
 */
public interface ZhongyiRecordDetailsService {
	
	ZhongyiRecordDetailsDO get(Integer id);
	
	List<ZhongyiRecordDetailsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ZhongyiRecordDetailsDO chanpinRecordDetails);
	
	int update(ZhongyiRecordDetailsDO chanpinRecordDetails);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
