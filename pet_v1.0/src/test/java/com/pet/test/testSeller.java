package com.pet.test;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pet.controller.SellerController;
import com.pet.model.ResultModel;
import com.pet.model.SellerModel;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class testSeller {

	@Autowired
	private SellerController sellerController;
	
	@Test
	public void testResgdit() {
		ResultModel model = new ResultModel();
		SellerModel sellerModel = new SellerModel();
		sellerModel.setUserId(20790749);
		sellerModel.setSellerId(65432);
		sellerModel.setDeposit(new BigDecimal(100.1));
		model = sellerController.regeditSeller(sellerModel);
		System.out.println("错误码 ： " + model.getErrcode() + "错误信息 ： " + model.getErrmsg());
	}
}
