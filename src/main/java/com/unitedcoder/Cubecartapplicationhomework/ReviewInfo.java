package com.unitedcoder.Cubecartapplicationhomework;

public class ReviewInfo {
    private String product;
    private String name;
    private  String email;
    private  String tile;
    private  String content;

    public ReviewInfo() {
    }

    public ReviewInfo(String product, String name, String email, String tile, String content) {
        this.product = product;
        this.name = name;
        this.email = email;
        this.tile = tile;
        this.content = content;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ReviewInfo{" +
                "product='" + product + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tile='" + tile + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
