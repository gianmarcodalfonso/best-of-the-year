package org.lessons.java.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best_of_the_year.model.Movie;
import org.lessons.java.best_of_the_year.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Gianluca");
		return "index";
	}

	@GetMapping("/movies")
	public String movies(Model model) {
		model.addAttribute("movies", getBestMovies());
		return "movies";
	}

	@GetMapping("/songs")
	public String songs(Model model) {
		model.addAttribute("songs", getBestSongs());
		return "songs";
	}

	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "The Shawshank Redemption"));
		movies.add(new Movie(2, "The Godfather"));
		movies.add(new Movie(3, "The Dark Knight"));
		movies.add(new Movie(4, "Pulp Fiction"));
		movies.add(new Movie(5, "Forrest Gump"));
		return movies;
	}

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(1, "Bohemian Rhapsody"));
		songs.add(new Song(2, "Imagine"));
		songs.add(new Song(3, "Like a Rolling Stone"));
		songs.add(new Song(4, "What's Going On"));
		songs.add(new Song(5, "Stairway to Heaven"));
		return songs;
	}

}
