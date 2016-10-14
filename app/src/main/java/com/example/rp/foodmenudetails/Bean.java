package com.example.rp.foodmenudetails;

/**
 * Created by apple on 15/03/16.
 *
 * //********LISTVIEW************
 */
public class Bean {

    private int image;
    private String title;
    private String rupee;
    private String ratings;
    private String timetext;

    public Bean(int image, String ratings, String rupee, String title,String timetext) {
        this.image = image;
        this.ratings = ratings;
        this.rupee = rupee;
        this.title = title;
        this.timetext = timetext;
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

    public String getRupee() {
        return rupee;
    }

    public void setRupee(String rupee) {
        this.rupee = rupee;
    }

    public String getTimetext() {
        return timetext;
    }

    public void setTimetext(String timetext) {
        this.timetext = timetext;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
