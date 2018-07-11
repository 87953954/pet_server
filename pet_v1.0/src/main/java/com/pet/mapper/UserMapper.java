package com.pet.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pet.model.UserModel;

public interface UserMapper {

//	用户登录
	@Select("select pwd from tb_user where userId = #{id}")
	public String login(int id);
	
//	查询用户信息
	@Select("SELECT\r\n" + 
			"userId,\r\n" + 
			"userName,\r\n" + 
			"pwd,\r\n" + 
			"QQ,\r\n" + 
			"phone,\r\n" + 
			"wechat,\r\n" + 
			"headimg,\r\n" + 
			"age,\r\n" + 
			"sex,\r\n" + 
			"birthday,\r\n" + 
			"vocationId,\r\n" + 
			"petName\r\n" + 
			"FROM\r\n" + 
			"tb_user where userId = #{id}")
	public UserModel queryUser(int id);
	
//	注销 删除用户注册信息
	@Delete("delete from tb_user where userId = #{id}")
	public int delete(int id);

//	绑定外部账户
	@Update("update tb_user set ${type} = #{account} where userId = #{id}")
	public int binding(int id, String type,  String account);

//	用户注册
	@Insert("insert into tb_user(userId,userName,pwd,QQ,phone,wechat,Headimg,age,sex,birthday,vocationId,petName) values (#{userId},#{userName},#{pwd},#{QQ},#{phone},#{wechat},#{Headimg},#{age},#{sex},#{birthday},#{vocationId},#{petName})")
	public int register(UserModel userModel);
	
}
