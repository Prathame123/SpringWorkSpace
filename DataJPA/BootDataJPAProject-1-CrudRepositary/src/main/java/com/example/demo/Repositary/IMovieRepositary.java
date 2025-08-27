package com.example.demo.Repositary;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Movie;

public interface IMovieRepositary extends CrudRepository<Movie, Integer> {

}
