package com.example.rp.foodmenudetails;

/**
 * Created by apple on 15/03/16.
 *
 * //********LISTVIEW************
 */
public class Beandetail {

    private int image;
    private String title;
    private String description;
    private String ratings;


    public Beandetail(int image, String title, String description,String ratings) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.ratings =ratings;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}
