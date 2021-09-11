package rycardofarias.animes.springboot.repository;

import rycardofarias.animes.springboot.domain.Anime;

import java.util.List;

public interface AnimeRepository {

    List<Anime> listAll();
}
