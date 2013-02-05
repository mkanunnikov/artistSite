package model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mkanunnikov
 * Date: 22.01.13
 * Time: 18:05
 * To change this template use File | Settings | File Templates.
 */
public class Author implements Serializable {

    private static final long serialVersionUID = 6703831015603584416L;
    private Long id;
    private String name;
    private String description;
    private Technique technique;
    private String genre;

    public Author(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Technique getTechnique() {
        return technique;
    }

    public void setTechnique(Technique technique) {
        this.technique = technique;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
