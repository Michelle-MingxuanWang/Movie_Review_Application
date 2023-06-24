package dev.michellemw.movies;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor // constructor for final arguments
public class MovieService {
    private final MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}