package com.dh.movieservice.domain.model;



import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String genre;
	private String urlStream;

	public Movie(Integer id, String name, String genre, String urlStream) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.urlStream = urlStream;
	}

	public Movie() {
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getUrlStream() {
		return urlStream;
	}

	public void setUrlStream(String urlStream) {
		this.urlStream = urlStream;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Movie movie = (Movie) o;
		return Objects.equals(id, movie.id) && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(urlStream, movie.urlStream);
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", genre='" + genre + '\'' +
				", urlStream='" + urlStream + '\'' +
				'}';
	}
}

