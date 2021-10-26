package rycardofarias.animes.springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import rycardofarias.animes.springboot.domain.Anime;
import rycardofarias.animes.springboot.request.AnimePostRequestBody;
import rycardofarias.animes.springboot.request.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
