package com.example.demo5.domain;

public class Image {

    private int imageId;
    private String imageName;
    private String subhead;
    private String group;
    private String url;

    public Image() {
        Image image = new Image();

        this.imageId = imageId;
        this.imageName = imageName;
        this.subhead = subhead;
        this.group = group;
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
