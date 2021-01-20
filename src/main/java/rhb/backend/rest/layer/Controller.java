package rhb.backend.rest.layer;

import java.util.List;

public interface Controller<T> {
	
	List<T> getAllMovies();
	
	T createMovie(T t);
	
	T getMovieById(Long id);
	
	T updateMovie(Long id, T det);
	
	void deleteMovie(T t);

}
