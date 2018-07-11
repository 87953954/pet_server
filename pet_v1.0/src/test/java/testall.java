import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pet.controller.UserController;
import com.pet.model.UserModel;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class testall {
	@Autowired
	private UserController controller;
	@Test
	public void loginTest() {
//		UserController controller = new UserController();
//		controller.login(1, "1");
//		System.out.println(Math.random());
		

		
		UserModel userModel = new UserModel();
		userModel.setAge(10);
		userModel.setBirthday("20170707");
		userModel.setHeadimg("test");
		userModel.setPetName("三胖");
		userModel.setPhone("13269317286");
		userModel.setPwd("www.baidu.com");
		userModel.setQQ("87953954");
		userModel.setSex('0');
		userModel.setUserName("张三");
		userModel.setVocationId(0);
		userModel.setWechat("13161983725");
		
		controller.regedit(userModel);
	}
}
