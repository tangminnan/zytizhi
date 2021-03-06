package com.liudiaowenjuan.information.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 学生表
 * 
 * @author wjl
 * @email bushuo@163.com
 * @date 2019-08-14 17:21:00
 */
public class StudentDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//id
	private Integer id;
	//学生姓名
	private String studentName;
	//性别 1：男2：女0：未知
	private Integer studentSex;
	//民族
	private String nation;
	//出生年月
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date birthday;
	//身份证号
	private String identityCard;
	//学校
	private String school;
	//年级
	private String grade;
	//班级
	private String studentClass;
	private Integer schoolId;
	//模板类型  XUE_XIAO=学校
	private String  modelType;
//	private String fatherAge;//父亲年龄
//	private String motherAge;//母亲年龄
//	private String fatherXueli;//父亲最高学历
//	private String motherXuli;//母亲最高学历
//	private String fatherEye;//父亲视力情况
//	private String motherEye;//母亲视力情况
//	private String shifouTangwo;//是否经常躺卧看书
//	private String zuizhongTizhi;//最终体质
//	private String gzrSm;//工作日平均每天失眠时间
//	private String zmSm;//周末每天睡眠时间
//	private String zmSwhd;//周末每天室外活动时间
//	private String zmMtgz;//周末每天工作时间
//	private String gzrSwhd;//工作日每天室外活动
	

//	public String getFatherAge() {
//		return fatherAge;
//	}
//
//	public void setFatherAge(String fatherAge) {
//		this.fatherAge = fatherAge;
//	}
//
//	public String getMotherAge() {
//		return motherAge;
//	}
//
//	public void setMotherAge(String motherAge) {
//		this.motherAge = motherAge;
//	}
//
//	public String getFatherXueli() {
//		return fatherXueli;
//	}
//
//	public void setFatherXueli(String fatherXueli) {
//		this.fatherXueli = fatherXueli;
//	}
//
//	public String getMotherXuli() {
//		return motherXuli;
//	}
//
//	public void setMotherXuli(String motherXuli) {
//		this.motherXuli = motherXuli;
//	}
//
//	public String getFatherEye() {
//		return fatherEye;
//	}
//
//	public void setFatherEye(String fatherEye) {
//		this.fatherEye = fatherEye;
//	}
//
//	public String getMotherEye() {
//		return motherEye;
//	}
//
//	public void setMotherEye(String motherEye) {
//		this.motherEye = motherEye;
//	}
//
//	public String getShifouTangwo() {
//		return shifouTangwo;
//	}
//
//	public void setShifouTangwo(String shifouTangwo) {
//		this.shifouTangwo = shifouTangwo;
//	}
//
//	public String getZuizhongTizhi() {
//		return zuizhongTizhi;
//	}
//
//	public void setZuizhongTizhi(String zuizhongTizhi) {
//		this.zuizhongTizhi = zuizhongTizhi;
//	}
//
//	public String getGzrSm() {
//		return gzrSm;
//	}
//
//	public void setGzrSm(String gzrSm) {
//		this.gzrSm = gzrSm;
//	}
//
//	public String getZmSm() {
//		return zmSm;
//	}
//
//	public void setZmSm(String zmSm) {
//		this.zmSm = zmSm;
//	}
//
//	public String getZmSwhd() {
//		return zmSwhd;
//	}
//
//	public void setZmSwhd(String zmSwhd) {
//		this.zmSwhd = zmSwhd;
//	}
//
//	public String getZmMtgz() {
//		return zmMtgz;
//	}
//
//	public void setZmMtgz(String zmMtgz) {
//		this.zmMtgz = zmMtgz;
//	}
//
//	public String getGzrSwhd() {
//		return gzrSwhd;
//	}
//
//	public void setGzrSwhd(String gzrSwhd) {
//		this.gzrSwhd = gzrSwhd;
//	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	private String dstr;

	public String getDstr() {
		return dstr;
	}

	public void setDstr(String dstr) {
		this.dstr = dstr;
	}
	//联系电话
	private String phone;
	//联系地址
	private String address;
	//身高
	private Double height;
	//体重
	private Double weight;
	//添加时间
	private Date addTime;
	//状态0：正常1：禁止
	private Integer status;
	//二维码url
	private String QRCode;
	//更新时间
	private Date lastCheckTime;




	public Date getLastCheckTime() {
		return lastCheckTime;
	}
	public void setLastCheckTime(Date lastCheckTime) {
		this.lastCheckTime = lastCheckTime;
	}
	public String getQRCode() {
		return QRCode;
	}
	public void setQRCode(String qRCode) {
		QRCode = qRCode;
	}
	/**
	 * 设置：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * 设置：性别 1：男2：女0：未知
	 */
	public void setStudentSex(Integer studentSex) {
		this.studentSex = studentSex;
	}
	/**
	 * 获取：性别 1：男2：女0：未知
	 */
	public Integer getStudentSex() {
		return studentSex;
	}
	/**
	 * 设置：民族
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	/**
	 * 获取：民族
	 */
	public String getNation() {
		return nation;
	}
	/**
	 * 设置：出生年月
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：出生年月
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdentityCard() {
		return identityCard;
	}
	/**
	 * 设置：学校
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * 获取：学校
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * 设置：年级
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * 获取：年级
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * 设置：班级
	 */
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	/**
	 * 获取：班级
	 */
	public String getStudentClass() {
		return studentClass;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：联系地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：联系地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：身高
	 */
	public void setHeight(Double height) {
		this.height = height;
	}
	/**
	 * 获取：身高
	 */
	public Double getHeight() {
		return height;
	}
	/**
	 * 设置：体重
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	/**
	 * 获取：体重
	 */
	public Double getWeight() {
		return weight;
	}
	/**
	 * 设置：添加时间
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * 设置：状态0：正常1：禁止
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态0：正常1：禁止
	 */
	public Integer getStatus() {
		return status;
	}

	//学部
	private String xueBu;
	private Long sysId;
	//学校编码
	private String schoolCode;
	//证件类型 SHEN_FENZHENG=身份证
	private String  ideentityType;

	public String getSchoolCode() {
		return schoolCode;
	}

	public String getXueBu() {
		return xueBu;
	}

	public void setXueBu(String xueBu) {
		this.xueBu = xueBu;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getIdeentityType() {
		return ideentityType;
	}

	public void setIdeentityType(String ideentityType) {
		this.ideentityType = ideentityType;
	}





	public Long getSysId() {
		return sysId;
	}

	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}
}
