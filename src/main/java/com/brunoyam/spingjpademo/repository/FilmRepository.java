package com.brunoyam.spingjpademo.repository;

import com.brunoyam.spingjpademo.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository <Film,Long> {
    List<Film> findAll();
    List<Film> findAllFilmByRating();
    List<Film> findAllFilmByTitle();
}
