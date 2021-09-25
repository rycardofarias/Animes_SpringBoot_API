package rycardofarias.animes.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rycardofarias.animes.springboot.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
