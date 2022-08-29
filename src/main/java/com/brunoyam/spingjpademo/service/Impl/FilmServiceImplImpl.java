package com.brunoyam.spingjpademo.service.Impl;

import com.brunoyam.spingjpademo.model.Film;
import com.brunoyam.spingjpademo.repository.FilmRepository;
import com.brunoyam.spingjpademo.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmServiceImplImpl implements FilmService {

    private final FilmRepository filmRepository;


    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Film getFilm(Long id) {
        Optional<Film> optionalFilm = filmRepository.findById(id);
        if(optionalFilm.isPresent()){
            return optionalFilm.get();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Фильм с индификтором " + id + " не найден");
        }
    }


    @Override
    public List<Film> getRating() {
        return filmRepository.findAllFilmByRating();
    }

    @Override
    public List<Film> getTitle() {
        return filmRepository.findAllFilmByTitle();
    }
}
