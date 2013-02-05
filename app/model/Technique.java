package model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mkanunnikov
 * Date: 22.01.13
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
public class Technique implements Serializable {

    private static final long serialVersionUID = 9136602367480098549L;
    private Long id;
    private String name;
    private String description;

    public Technique(String name) {
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
}
