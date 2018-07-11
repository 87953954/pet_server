package com.pet.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pet.controller.UserController;
import com.pet.model.ResultModel;
import com.pet.model.UserModel;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class testall {
	@Autowired
	private UserController controller;

	@Test
	public void loginTest() {

		UserModel userModel = new UserModel();
		userModel.setAge(10);
		userModel.setBirthday("20170707");
		userModel.setHeadimg("test");
		userModel.setPetName("七月");
		userModel.setPhone("13269317286");
		userModel.setPwd("www.baidu.com");
		userModel.setQQ("87953954");
		userModel.setSex('0');
		userModel.setUserName("张三");
		userModel.setVocationId(0);
		userModel.setWechat("13161983725");
		ResultModel resultModel = controller.regedit(userModel);
		userModel = (UserModel) resultModel.getData().get("context");
		System.out.println("userid = " + userModel.getUserId());
		System.out.println("username = " + userModel.getUserName());
	}
	
	@Test
	public void bindingTest() {
		controller.binding(16920219, 1, "1508842419");
	}
}
