package rycardofarias.animes.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Anime {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
