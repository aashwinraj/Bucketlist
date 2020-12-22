package com.example.bucketlist;
import androidx.annotation.DrawableRes;
public class BucketListEntry {
    String heading;
    String Description;
    int image;
    float rating;

    public BucketListEntry(String heading, String description, @DrawableRes int image, float rating) {
        this.heading = heading;
        Description = description;
        this.image = image;
        this.rating = rating;
    }
}

