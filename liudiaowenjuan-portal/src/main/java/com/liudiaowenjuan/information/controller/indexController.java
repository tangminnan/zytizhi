package com.liudiaowenjuan.information.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.liudiaowenjuan.common.utils.StringUtils;
import com.liudiaowenjuan.common.utils.WeiScanUtils;
import com.liudiaowenjuan.common.utils.WeiScanUtils2;
import com.liudiaowenjuan.information.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liudiaowenjuan.information.service.ZhongyiDetailsService;
import com.liudiaowenjuan.information.service.ZhongyiListService;
import com.liudiaowenjuan.information.service.ZhongyiRecordDetailsService;
import com.liudiaowenjuan.information.service.ZhongyiRecordListService;
import com.liudiaowenjuan.information.service.ZhongyiTitleChooseService;

@Controller
public class indexController {
	
	@Autowired
	ZhongyiListService zhongyiListService;
	@Autowired
	ZhongyiDetailsService zhongyiDetailsService;
	@Autowired
	ZhongyiTitleChooseService zhongyiTitleChooseService;
	@Autowired
	ZhongyiRecordListService zhongyiRecordListService;
	@Autowired
	ZhongyiRecordDetailsService zhongyiRecordDetailsService;

	@GetMapping("/index")
	String index(Model model){
		Map<String,Object> map = new HashMap<>();
		map.put("status", "1");
		List<ZhongyiListDO> list = zhongyiListService.list(map);
		model.addAttribute("list",list);
		return "information/wenjuan4";
	}

	@GetMapping("/wenjuan/shouye")
	String shouye(Model model,Integer id) throws IOException {
		Map<String,Object> map = WeiScanUtils2.sign("http://zywenjuan.dddmaker.com/wenjuan/shouye?id="+id);
		model.addAttribute("timestamp",map.get("timestam"));
		model.addAttribute("nonceStr",map.get("nonceSt"));
		model.addAttribute("signature",map.get("signatur"));

		model.addAttribute("id",id);
		model.addAttribute("startTime",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));//记录开始答题时间
		return "information/shouye";
	}
	@GetMapping("/wenjian/kaishidati")
	String kaishidati(Model model,Integer id,String uname, String identityCard,
					  String phone,String jiguan,
					  String birthAddress,String homeAddress,String homeYear,
					  String height,String weight,String yaowei,
					  String startTime ,//记录答题的开始时间
					  String school,
					  String  grade,
					  String  lass,
					String 	  sex,
					String 	  blood
						){
		model.addAttribute("id",id);
		model.addAttribute("uname",uname);
		model.addAttribute("identityCard",identityCard);
		model.addAttribute("phone",phone);
		model.addAttribute("jiguan",jiguan);
		model.addAttribute("birthAddress",birthAddress);
		model.addAttribute("homeAddress",homeAddress);
		model.addAttribute("homeYear",homeYear);
		model.addAttribute("height",height);
		model.addAttribute("weight",weight);
		model.addAttribute("yaowei",yaowei);
		model.addAttribute("startTime",startTime);

		model.addAttribute("school",school);
		model.addAttribute("grade",grade);
		model.addAttribute("lass",lass);
		model.addAttribute("sex",sex);
		model.addAttribute("blood",blood);
		Map<String,Object> map = new HashMap<>();
		map.put("chanpinId", id);
		int list = zhongyiDetailsService.count(map);
		model.addAttribute("cpchang",list);

			return "information/wenjuan5";


	}



	@GetMapping("/wenjian/timuxiangq")
	@ResponseBody
	List<Map<String,Object>> timuxiangq(Integer id){
		List<Map<String,Object>> bb = new ArrayList<Map<String,Object>>();
		Map<String,Object> map1 = new HashMap<>();
		map1.put("chanpinId",id);
		List<ZhongyiDetailsDO> list1 = zhongyiDetailsService.list(map1);
		for (ZhongyiDetailsDO ard : list1 ) {
			Map<String,Object> map3 = new HashMap<>();
			List<Object> ll = new ArrayList<>();
			Map<String,Object> map2 = new HashMap<>();
			map2.put("timuId",ard.getId());
			ll.add(zhongyiTitleChooseService.list(map2));
			map3.put("chanpin",ard);
			map3.put("details",ll);
			bb.add(map3);
		}
		return bb;
	}
	
	@GetMapping("/querywenjuan/chanpinDetails")
	@ResponseBody
	List<ZhongyiDetailsDO> chanpinDetails(Integer id){
		Map<String,Object> map = new HashMap<>();
		map.put("chanpinId", id);
		List<ZhongyiDetailsDO> list = zhongyiDetailsService.list(map);
		return list;
		
	}
	
	@GetMapping("/querywenjuan/titleDetails")
	@ResponseBody
	List<ZhongyiTitleChooseDO> titleDetails(Integer id){
		Map<String,Object> map = new HashMap<>();
		map.put("timuId", id);
		List<ZhongyiTitleChooseDO> titleChooseDO = zhongyiTitleChooseService.list(map);
		return titleChooseDO;
		
	}

	public Date getDate(String str){
		if(StringUtils.isBlank(str))
			str="1970-12-12 00:00:00";
		try {
			Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
			return  parse;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/save/datishuju")
	@ResponseBody
	Map<String,Object> datishuju(@RequestBody ZhongyiRecordListDO chanpin){
		System.out.println("================================================================");
		List<ZhongyiRecordDetailsDO> titlelist1 = chanpin.getTitlelist();
		for(ZhongyiRecordDetailsDO x : titlelist1){
			System.out.println(x);
		}
		System.out.println("================================================================");
		System.out.println("=================================================================");
		List<ZhongyiRecordDetailsDO> titlexinxi2 = chanpin.getTitlexinxi();
				titlexinxi2.forEach(System.out::print);
		System.out.println("================================================================");
		Map<String,Object> map = new HashMap<>();
		ZhongyiRecordListDO crl = new ZhongyiRecordListDO();
		List<ZhongyiRecordDetailsDO> titlexinxi1 = chanpin.getTitlexinxi();
		for (ZhongyiRecordDetailsDO xinxi : titlexinxi1) {
			if(xinxi.getTitleName().equals("身份证号")){
				crl.setIdentityCard(xinxi.getRemarks());
			}
			if(xinxi.getTitleName().equals("答题开始时间")){
				crl.setStartTime(getDate(xinxi.getRemarks()));
			}
		}
		crl.setChanpinId(chanpin.getChanpinId());
		crl.setChanpinName(zhongyiListService.get(chanpin.getChanpinId()).getChanpinName());
		crl.setAddTime(new Date());//答题结束时间
		if(zhongyiRecordListService.save(crl)>0){
			List<ZhongyiRecordDetailsDO> titlexinxi = chanpin.getTitlexinxi();
			for (ZhongyiRecordDetailsDO xinxi : titlexinxi) {
				ZhongyiRecordDetailsDO crd = new ZhongyiRecordDetailsDO();
				crd.setRecordId(crl.getId());
				crd.setTitleId(0);
				crd.setTitleName(xinxi.getTitleName());
				crd.setTitleType(1);
				crd.setRemarks(xinxi.getRemarks());
				crd.setAddTime(new Date());
				crd.setChooseIds("0");
				crd.setChooseSort(xinxi.getRemarks());
				zhongyiRecordDetailsService.save(crd);
			}
			List<ZhongyiRecordDetailsDO> titlelist = chanpin.getTitlelist();
			for (ZhongyiRecordDetailsDO chanpinRecordDetailsDO : titlelist) {
				if(chanpinRecordDetailsDO.getTitleType()==null) continue;
				if(chanpinRecordDetailsDO.getTitleType() != 4){
					ZhongyiRecordDetailsDO crd2 = new ZhongyiRecordDetailsDO();
					crd2.setRecordId(crl.getId());
					crd2.setTitleId(chanpinRecordDetailsDO.getTitleId());
					crd2.setTitleName(chanpinRecordDetailsDO.getTitleName());
					crd2.setTitleType(chanpinRecordDetailsDO.getTitleType());
					crd2.setRemarks(chanpinRecordDetailsDO.getRemarks());
					crd2.setAddTime(new Date());
					crd2.setChooseIds(chanpinRecordDetailsDO.getChooseIds());
					crd2.setChooseSort(chanpinRecordDetailsDO.getChooseSort());
					zhongyiRecordDetailsService.save(crd2);
				}
			}
			
			
		}
		
		map.put("code", "0");
		map.put("msg", "操作成功");
		return map;
		
	}
	
	@GetMapping("/shaichawenjuan/jiazai")
	String jiazai(){
		return "information/jiazaiye";
	}
	
	@GetMapping("/shaichawenjuan/tijiaochenggong")
	String chenggong(){
		return "information/chenggong";
	}

	/**
	 * 获取生日
	 * @param identityCard
	 * @return
	 */
	private Date getBirthday(String identityCard) {
		Date date = null;
		if(identityCard!=null){
			try {
				String dateStr = identityCard.substring(6,14);
				date=new SimpleDateFormat("yyyyMMdd").parse(dateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}

	/**
	 * 获取年龄
	 * @return
	 */
	public int getAge(Date date){
		int age =0;
		if(date!=null){
			Calendar calendar=  Calendar.getInstance();
			int nowY = calendar.get(Calendar.YEAR);
			calendar.setTime(date);
			int birthdayY=calendar.get(Calendar.YEAR);
			return (nowY-birthdayY);
		}
		return age;
	}

	@GetMapping("/wenjuan/shouye/getInfo")
	@ResponseBody
	public StudentDO getInfo(String id){
		id=id.split("JOIN")[0];
		System.out.println("==================================");
		System.out.println(id);
		System.out.println(id);
		System.out.println(id);
		System.out.println(id);
		System.out.println(id);
		System.out.println(id);
		System.out.println("===================================");
		StudentDO studentDO  =  zhongyiListService.getInfo(id);
		if(studentDO.getPhone()!=null){
			studentDO.setPhone(studentDO.getPhone().substring(0,11));
		}
		return studentDO;
	}
}
