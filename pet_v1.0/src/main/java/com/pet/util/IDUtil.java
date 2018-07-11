package com.pet.util;

import java.util.Random;

public class IDUtil {

//	生成八位随机数为用户id

	public static int createID() {

		Random ru = new Random(System.currentTimeMillis()); // 日期为种子

		String str = "" + Math.abs(ru.nextInt());
		if (str.length() < 8) {
			str = "" + Math.abs(ru.nextInt());
		}

		str = str.substring(0, 8);
		return Integer.valueOf(str);
	}

}
