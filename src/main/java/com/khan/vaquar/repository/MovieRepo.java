/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khan.vaquar.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.khan.vaquar.domain.Movie;
import com.khan.vaquar.domain.RecommendationData;
import com.khan.vaquar.domain.User;

@Component
public class MovieRepo {

   
    public List<RecommendationData> getRecommendationForUser(Long followerID){return null;}
    public List<RecommendationData> getTopFiveMovies(){return null;}
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public Movie findOne(Long movieId) {
		// TODO Auto-generated method stub
		return null;
	}
} 
