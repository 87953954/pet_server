package com.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.pet.model.SellerModel;

public interface SellerMapper {

//	注册成为商家
	@Insert("insert into tb_seller "
			+ "(userId,sellerId,sellerName,scopeOfBusiness,starLevel,deposit,"
			+ "recordDate,headImgLocation,sellerSite,fansCount,sumMonth,total,"
			+ "statement,talkID,commoditySum,newCommodity,hotCommodity,status) "
			+ "values"
			+ "(#{sellerModel.userId},#{sellerModel.sellerId},#{sellerModel.sellerName},"
			+ "#{sellerModel.scopeOfBusiness},#{sellerModel.starLevel},"
			+ "#{sellerModel.deposit},#{sellerModel.recordDate},"
			+ "#{sellerModel.headImgLocation},#{sellerModel.sellerSite},"
			+ "#{sellerModel.fansCount},#{sellerModel.sumMonth},#{sellerModel.total},"
			+ "#{sellerModel.statement},#{sellerModel.talkID},#{sellerModel.commoditySum},"
			+ "#{sellerModel.newCommodity},#{sellerModel.hotCommodity},#{sellerModel.status})")
	public int regeditSeller(@Param("sellerModel") SellerModel sellerModel);

}
