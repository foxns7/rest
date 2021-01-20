package rhb.backend.rest.repository;

import java.util.List;

import rhb.backend.rest.layer.MainRepository;
import rhb.backend.rest.model.Movie;

public class MovieRepository implements MainRepository<Movie, Long> {
	
	@Override
	public void deleteById(Long id) {
		
	}
	
	@Override
	public Movie getOne(Long id) {
		return null;
	}

	@Override
	public <S extends Movie> S save(S entity) {
		return null;
	}

	@Override
	public List<Movie> findAll() {
		return null;
	}



}
