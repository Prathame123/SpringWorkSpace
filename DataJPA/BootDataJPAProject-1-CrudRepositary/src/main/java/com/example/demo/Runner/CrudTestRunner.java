package com.example.demo.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Movie;
import com.example.demo.Service.IMovieManagmentService;

@Component
public class CrudTestRunner implements CommandLineRunner {
	
	@Autowired
	private IMovieManagmentService movieMgService;
	
	@Override
	public void run(String... args) throws Exception {
		 Movie m1 = new Movie();
		 m1.setName("RRR Part 1");	
		 m1.setYear("2019");
		 m1.setRating(9.5f);
		 movieMgService.registerMovie(m1);
	}
}