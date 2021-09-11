package rycardofarias.animes.springboot.service;

import org.springframework.stereotype.Service;
import rycardofarias.animes.springboot.domain.Anime;

import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(1L,"DBZ"), new Anime(2L,"Naruto"));
    public List<Anime> listAll(){
         return animes;
    }
}
