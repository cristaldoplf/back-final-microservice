package com.dh.serieservice.domain.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;


public class Season {
    private Integer id;
    private Integer seasonNumber;
    private List<Chapter> chapters;

    public Season(Integer id, Integer seasonNumber, List<Chapter> chapters) {
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.chapters = chapters;
    }

    public Season() {
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Season season = (Season) o;
        return Objects.equals(id, season.id) && Objects.equals(seasonNumber, season.seasonNumber) && Objects.equals(chapters, season.chapters);
    }

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", seasonNumber=" + seasonNumber +
                ", chapters=" + chapters +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
