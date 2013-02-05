package model;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mkanunnikov
 * Date: 22.01.13
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
public class Picture implements Serializable{

    private static final long serialVersionUID = 2646778380197799667L;
    private Long id;
    private Author author;
    private String name;
    private PhysicalParams physicalParams;
    private int year;
    private String description;
    private List<String> fotos;
    private Technique technique;
    private String genre;
    private int price;

    public Picture() {
    }

    public Picture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhysicalParams getPhysicalParams() {
        return physicalParams;
    }

    public void setPhysicalParams(PhysicalParams physicalParams) {
        this.physicalParams = physicalParams;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
