package com.dh.serieservice.domain.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;


@Document(collection = "Series")
public class Serie {
    @Transient
    public static final String SEQUENCE_NAME = "series_sequence";

    @Id
    private Long id;
    private String name;
    private String genre;
    private List<Season> seasons;

    public Serie(Long id, String name, String genre, List<Season> seasons) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.seasons = seasons;
    }

    public Serie() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(id, serie.id) && Objects.equals(name, serie.name) && Objects.equals(genre, serie.genre) && Objects.equals(seasons, serie.seasons);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", seasons=" + seasons +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
