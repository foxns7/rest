package rhb.backend.rest.layer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@NoRepositoryBean
@Repository
public interface MainRepository<T, Long> extends JpaRepository<T, Long> {

	public void deleteById(Long arg0);

	@Override
	public T getOne(Long arg0);

	@Override
	public default Page<T> findAll(Pageable arg0) {
		return null;
	}

	@Override
	public default long count() {
		return 0;
	}

	@Override
	public default void delete(T arg0) {}

	@Override
	public default void deleteAll() {}

	@Override
	public default boolean existsById(Long arg0) {
		return false;
	}

	@Override
	public default Optional<T> findById(Long arg0) {
		return null;
	}

	@Override
	public default <S extends T> long count(Example<S> arg0) {
		return 0;
	}

	@Override
	public default <S extends T> boolean exists(Example<S> arg0) {
		return false;
	}

	@Override
	public default <S extends T> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		return null;
	}

	@Override
	public default <S extends T> Optional<S> findOne(Example<S> arg0) {
		return null;
	}

	@Override
	public default void deleteAllInBatch() {}
	
	@Override
	public default void deleteAll(Iterable<? extends T> arg0) {
		
	}

	@Override
	public default void deleteInBatch(Iterable<T> arg0) {}

	@Override
	public default List<T> findAll(Sort arg0) {
		return null;
	}

	@Override
	public default <S extends T> List<S> findAll(Example<S> arg0) {
		return null;
	}

	@Override
	public default <S extends T> List<S> findAll(Example<S> arg0, Sort arg1) {
		return null;
	}

	@Override
	public default List<T> findAllById(Iterable<Long> arg0) {
		return null;
	}

	@Override
	public default void flush() {}

	@Override
	public default <S extends T> List<S> saveAll(Iterable<S> arg0) {
		return null;
	}

	@Override
	public default <S extends T> S saveAndFlush(S arg0) {
		return null;
	}
	
	public <S extends T> S save(S arg0);


}

