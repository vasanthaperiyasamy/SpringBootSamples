package com.spring.security.dao;

import java.util.List;

import com.spring.security.entity.User;

public interface UserDao {
	 
    User findById(int id);
     
    User findBySSO(String sso);
     
    void save(User user);
     
    void deleteBySSO(String sso);
     
    List<User> findAllUsers();
 
}