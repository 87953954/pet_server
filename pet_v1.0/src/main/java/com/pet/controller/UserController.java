package com.pet.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet.mapper.UserMapper;
import com.pet.model.ResultModel;
import com.pet.model.UserModel;
import com.pet.util.IDUtil;
import com.pet.util.ResultTools;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

//	用户登录
	@RequestMapping("/login")
	public ResultModel login(int id, String password) {

		String pwd = userMapper.login(id);

		if (pwd == null || pwd == "") {
			return ResultTools.result(1001, "", null);
		}

		if (pwd != null && !password.equals(pwd)) {
			return ResultTools.result(1002, "", null);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("context", userMapper.queryUser(id));
		return ResultTools.result(0, "", map);
	}

//	用户注册
	@RequestMapping("/regedit")
	public ResultModel regedit(UserModel userModel) {

		
		int id = IDUtil.createID();
//		判断用户ID是否已存在
		userModel.setUserId(userMapper.queryUser(id) == null ? id : IDUtil.createID());
		;
		if (userMapper.register(userModel) > 0) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("context", userModel);
			return ResultTools.result(0, "", map);
		} else {
			return ResultTools.result(404, "注册失败", null);
		}
	}

//	永久注销用户
	@RequestMapping("/delete")
	public ResultModel delete(int id) {
		userMapper.delete(id);
		return ResultTools.result(0, "", null);
	}
//	绑定外部账户

	/**
	 * type  0:QQ号  1： 微信号 2： 微博号  3： 手机号
	 * 更换绑定，绑定都可以调用同一个接口,解除绑定
	 * */
	@RequestMapping("/userinfo/binding")
	public ResultModel binding(int id, int type, String account) {
		
		int flag = 0;
		if (type == 0) {
			flag = userMapper.binding(id, "QQ", account);
		} else if (type == 1) {
			flag = userMapper.binding(id, "wechat", account);
		} else if (type == 2) {
			flag = userMapper.binding(id, "weibo", account);
		} else if (type == 3) {
			flag = userMapper.binding(id, "phone", account);
		}
		return ResultTools.result(flag>0?0:404, "未知错误", null);
	}
}
