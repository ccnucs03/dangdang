package com.ccnu.dang.test;

import org.junit.Test;

import com.ccnu.dang.dao.AddressDAO;
import com.ccnu.dang.dao.AddressDAOImpl;
import com.ccnu.dang.dao.UserDAO;
import com.ccnu.dang.dao.UserDAOImpl;
import com.ccnu.dang.pojo.Address;
import com.ccnu.dang.pojo.User;

public class AddressDAOTest {
	
	private UserDAO userDao = new UserDAOImpl();
	private AddressDAO addressDao = new AddressDAOImpl();
	@Test
	public void add() {
		User user = new User();		
		user = userDao.findById(1);
		Address address = new Address();	
		address.setFullAddress("¶«16");
		address.setMobile("15623236300");
		address.setReceiveName("ÑîÓîº½");
		address.setUser(user);		
		addressDao.add(address);
	}

}
