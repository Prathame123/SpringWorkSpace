package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Data_Movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MovieId")
	private Integer id;
	@Column(name = "MovieName")
	private String name;
	@Column(name = "MovieYear")
	private String year;
	@Column(name = "MovieRating")
	private Float rating;
}
