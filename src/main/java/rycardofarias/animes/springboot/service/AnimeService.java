package rycardofarias.animes.springboot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rycardofarias.animes.springboot.domain.Anime;
import rycardofarias.animes.springboot.exception.BadRequestException;
import rycardofarias.animes.springboot.mapper.AnimeMapper;
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

    public List<Anime> findByName(String name){
        return animeRepository.findByName(name);
    }

    public Anime findByIdOrTrowBadRequestException(long id){
        return animeRepository.findById(id)
            .orElseThrow(() -> new BadRequestException( "Anime not Found"));
    }

    public Anime save(AnimePostRequestBody animePostRequestBody) {

        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrTrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime animeSaved = findByIdOrTrowBadRequestException(animePutRequestBody.getId());
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(animeSaved.getId());

        animeRepository.save(anime);

    }
}
