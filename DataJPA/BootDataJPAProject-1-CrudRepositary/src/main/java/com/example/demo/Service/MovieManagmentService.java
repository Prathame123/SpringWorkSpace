package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Movie;
import com.example.demo.Repositary.IMovieRepositary;

@Service("MovieManagmentService")
public class MovieManagmentService implements IMovieManagmentService {
	@Autowired
	private IMovieRepositary movieRepo;
	
	public String registerMovie(Movie movie) {
		movieRepo.save(movie);
		return "Movie Saved";
	}
}