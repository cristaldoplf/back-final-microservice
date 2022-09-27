package com.dh.serieservice.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


public class Chapter {
    private Integer id;
    private String name;
    private Integer number;
    private String urlStream;

    public Chapter(Integer id, String name, Integer number, String urlStream) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.urlStream = urlStream;
    }

    public Chapter() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(id, chapter.id) && Objects.equals(name, chapter.name) && Objects.equals(number, chapter.number) && Objects.equals(urlStream, chapter.urlStream);
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", urlStream='" + urlStream + '\'' +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUrlStream() {
        return urlStream;
    }

    public void setUrlStream(String urlStream) {
        this.urlStream = urlStream;
    }
}
