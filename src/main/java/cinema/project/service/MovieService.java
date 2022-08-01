package cinema.project.service;

import java.util.List;
import cinema.project.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
