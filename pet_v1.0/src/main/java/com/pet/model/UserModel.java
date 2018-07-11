package com.pet.model;

public class UserModel {

	private int userId;
	private String userName;
	private String pwd;
	private String QQ;
	private String phone;
	private String wechat;
	private String Headimg;
	private int age;
	private char sex;
	private String birthday;
	private int vocationId;
	private String petName;
	private int followCount;
	private int starCount;
	private int msgCont;
	private char level;

	
	
	public int getFollowCount() {
		return followCount;
	}
	public void setFollowCount(int followCount) {
		this.followCount = followCount;
	}
	public int getStarCount() {
		return starCount;
	}
	public void setStarCount(int starCount) {
		this.starCount = starCount;
	}
	public int getMsgCont() {
		return msgCont;
	}
	public void setMsgCont(int msgCont) {
		this.msgCont = msgCont;
	}
	public char getLevel() {
		return level;
	}
	public void setLevel(char level) {
		this.level = level;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getHeadimg() {
		return Headimg;
	}
	public void setHeadimg(String headimg) {
		Headimg = headimg;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getVocationId() {
		return vocationId;
	}
	public void setVocationId(int vocationId) {
		this.vocationId = vocationId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
