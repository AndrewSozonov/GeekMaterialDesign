package ru.andreysozonov.geekmaterialdesign.model;

public class MountainCardModel {

    private int imageId;
    private String name;
    private String location;

    public MountainCardModel(int imageId, String name, String location) {
        this.imageId = imageId;
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
