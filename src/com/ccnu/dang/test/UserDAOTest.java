package com.ccnu.dang.test;



import org.hibernate.Session;
import org.junit.Test;

import com.ccnu.dang.dao.UserDAO;
import com.ccnu.dang.dao.UserDAOImpl;
import com.ccnu.dang.hibernate.HibernateSessionFactory;
import com.ccnu.dang.pojo.Address;
import com.ccnu.dang.pojo.User;

public class UserDAOTest {
	
	private UserDAO userDao = new UserDAOImpl();	
	
	@Test
	public void add(){
		User user = new User();	
		user.setEmail("yyh@mails.ccnu.edu.cn");
		user.setNickname("yhyang");
		user.setPassword("123");		
		userDao.add(user);		
	}
	

}
