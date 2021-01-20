package rhb.backend.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// To ensure the createdDate/modifiedDate automatically populated whenever an entity is created or updated
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@ComponentScan(basePackages={"rhb.backend.rest.controller.MovieController"})
@EnableJpaRepositories(basePackages="rhb.backend.rest.repository.MovieRepository")
@EntityScan(basePackages={"rhb.backend.rest.model.Movie","rhb.backend.rest.model.Category","rhb.backend.rest.model.Rating"})
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
