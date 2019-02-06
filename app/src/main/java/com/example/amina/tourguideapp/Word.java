package com.example.amina.tourguideapp;

public class Word {

    private String place;
    private String description;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String thePlace, String theDescription){
        place= thePlace;
        description= theDescription; }


    String getPlace(){ return  place;}
    String getDescription(){ return  description;}

    public Word(String thePlace, String theDescription, int imageResourceId) {
        place= thePlace;
        description= theDescription;
        mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }







}
