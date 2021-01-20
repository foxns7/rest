package rhb.backend.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import rhb.backend.rest.exception.ResourceNotFound;
import rhb.backend.rest.layer.Controller;
import rhb.backend.rest.model.Movie;
import rhb.backend.rest.repository.MovieRepository;

@RestController
@RequestMapping("/rest")
public class MovieController implements Controller<Movie> {
	
	@Autowired
    MovieRepository movieRepository;
	
	@Override
	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		
		System.out.println("getAllMovies!");
		
		return movieRepository.findAll();
	}

	@Override
	@PostMapping("/movies")
	public Movie createMovie(@Validated @RequestBody Movie movie) { //bind request body with a param
		
		System.out.println("createMovie!");
		
		if (movie != null) {
			return movieRepository.save(movie);
		}
		
		return null;
		
	}

	@Override
	@GetMapping("/movies/{movieId}")
	public Movie getMovieById(@PathVariable(value = "movieId") Long movieId) {
		
		System.out.println("getMovieById!");
		
		return movieRepository.findById(movieId)
	            .orElseThrow(() -> new ResourceNotFound("Movie", "id", movieId));
		
	}

	@Override
	public Movie updateMovie(@PathVariable(value = "movieId") Long movieId,
            @Validated @RequestBody Movie movieDetails) {
		
		System.out.println("updateMovie!");
		
		Movie movie = movieRepository.findById(movieId)
	            .orElseThrow(() -> new ResourceNotFound("Movie", "id", movieId));

		movie.setTitle(movieDetails.getTitle());

		Movie updatedMovie = movieRepository.save(movie);
	    return updatedMovie;
		
	}

	@Override
	public void deleteMovie(Movie t) {
		
		System.out.println("deleteMovie!");
		
	}

	

}
