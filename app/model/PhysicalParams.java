package model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mkanunnikov
 * Date: 22.01.13
 * Time: 17:06
 * To change this template use File | Settings | File Templates.
 */
public class PhysicalParams implements Serializable {

    private static final long serialVersionUID = -5174068351108319440L;
    private Long id;
    private int width;
    private int height;
    private int depth;
    private int weight;

    public PhysicalParams(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public int getVolume(){
        return width*height*depth;
    }

    public int getWidth() {
        return width;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
