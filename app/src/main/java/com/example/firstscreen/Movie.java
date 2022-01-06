package com.example.firstscreen;

public class Movie {
    private String title , synopsis ,img;
    private Double released;




    public Movie(String title, String img, String synopsis, Double released){
        this.title=title;
        this.img=img;
        this.synopsis=synopsis;
        this.released=released;
    }

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getImg() {
        return img;
    }

    public Double getReleased() {
        return released;
    }

}
