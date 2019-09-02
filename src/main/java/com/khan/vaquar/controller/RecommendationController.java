
package com.khan.vaquar.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.khan.vaquar.domain.Movie;
import com.khan.vaquar.domain.RecommendationData;
import com.khan.vaquar.domain.User;
import com.khan.vaquar.repository.MovieRepo;
import com.khan.vaquar.repository.UserRepo;


@RestController
@RequestMapping("/recommendation")
public class RecommendationController {
    
    
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private MovieRepo movieRepo;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        List<User> users = new ArrayList<>();
      
        return users;
    }
    
    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public Collection<Movie> getAllMovies(){
        List<Movie> movies = new ArrayList<>();
      
        return movies;
    }
    
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable(name = "userId") Long userId){
        return this.userRepo.findOne(userId);
    }
    
    @RequestMapping(value = "/recommend/user/{userId}", method = RequestMethod.GET)
    public Collection<RecommendationData> getRecommendationForUser(@PathVariable(name = "userId") Long userId){
        Collection<RecommendationData> data = this.movieRepo.getRecommendationForUser(userId);
        
        // If there is no recommended movies, return top 5
        if(data == null || data.isEmpty()){
            data = this.movieRepo.getTopFiveMovies();
        }
        return data;
    }
    
    @RequestMapping(value = "/movie/{movieId}", method = RequestMethod.GET)
    public Movie getMovie(@PathVariable(name = "movieId") Long movieId){
        return this.movieRepo.findOne(movieId);
    }
    
   }
