package rycardofarias.animes.springboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import rycardofarias.animes.springboot.domain.Anime;
import rycardofarias.animes.springboot.repository.AnimeRepository;
import rycardofarias.animes.springboot.request.AnimePostRequestBody;
import rycardofarias.animes.springboot.request.AnimePutRequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
         return animeRepository.findAll();
    }

    public Anime findByIdOrTrowBadRequestException(long id){
        return animeRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    public Anime save(AnimePostRequestBody animePostRequestBody) {
        Anime anime = Anime.builder().name(animePostRequestBody.getName()).build();
        return animeRepository.save(anime);
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrTrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime animeSaved = findByIdOrTrowBadRequestException(animePutRequestBody.getId());
        Anime anime = Anime.builder()
                .id(animeSaved.getId())
                .name(animePutRequestBody.getName())
                .build();

        animeRepository.save(anime);

    }
}
