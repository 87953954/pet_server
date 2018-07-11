package com.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pet.mapper.SellerMapper;
import com.pet.mapper.UserMapper;
import com.pet.model.ResultModel;
import com.pet.model.SellerModel;
import com.pet.util.ResultTools;
@Controller
public class SellerController {

	@Autowired
	private SellerMapper sellerMapper;
	@Autowired
	private UserMapper userMapper;
	
	
//	注册成为商户
	@RequestMapping(value = "/seller/regedit",method = RequestMethod.POST)
	public ResultModel regeditSeller(@RequestBody SellerModel sellerModel) {
		
		if(null == userMapper.queryUser(sellerModel.getUserId()) ) {
			return ResultTools.result(1005, "", null);
		}
		return ResultTools.result(sellerMapper.regeditSeller(sellerModel)>0?0:404, "", null);
		
	}
	
	
	
	
}
