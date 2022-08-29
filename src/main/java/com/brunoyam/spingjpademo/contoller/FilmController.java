package com.brunoyam.spingjpademo.contoller;

import com.brunoyam.spingjpademo.model.Film;
import com.brunoyam.spingjpademo.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/films")
@RestController
@RequiredArgsConstructor
public class FilmController {

    private final FilmService filmService;

    @GetMapping
    public List<Film> getAllFilms(){
       return filmService.getAllFilms();
    }

    @GetMapping("/{id}")
    public Film getFilm(@PathVariable(name = "id") Long id){
        return filmService.getFilm(id);
    }

    public void getRating(Long id){
        filmService.getRating();
    }

    public void getTitle(Long id){
        filmService.getTitle();
    }
}
