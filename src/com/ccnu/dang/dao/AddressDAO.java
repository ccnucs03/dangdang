package com.ccnu.dang.dao;

import com.ccnu.dang.pojo.Address;

import java.util.List;

public interface AddressDAO {
	
	public boolean add(Address address);
	
	public List<Address> findByUserId(int userId);	
}
