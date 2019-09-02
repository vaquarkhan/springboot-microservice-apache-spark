/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khan.vaquar.repository;


import org.springframework.stereotype.Component;

import com.khan.vaquar.domain.User;

@Component
public class UserRepo {

	public Iterable<User> findAll(){return null;}

	public User findOne(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
