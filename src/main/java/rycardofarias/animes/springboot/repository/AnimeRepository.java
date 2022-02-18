package rycardofarias.animes.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rycardofarias.animes.springboot.domain.Anime;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

    List<Anime> findByName(String name);
}
