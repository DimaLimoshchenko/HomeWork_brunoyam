package com.brunoyam.spingjpademo.service;

import com.brunoyam.spingjpademo.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> getAllFilms();

    Film getFilm(Long id);

    List<Film> getRating();
    List<Film> getTitle();

}
