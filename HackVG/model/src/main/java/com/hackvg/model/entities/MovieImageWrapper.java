package com.hackvg.model.entities;


public class MovieImageWrapper {

    private String file_path;
    private int width;
    private int height;
    private String iso_639_1;
    private float aspect_ratio;
    private float vote_average;
    private int vote_count;

    public String getFile_path() {

        return file_path;
    }

    public int getWidth() {

        return width;
    }

    public int getHeight() {

        return height;
    }

    public String getIso_639_1() {

        return iso_639_1;
    }

    public float getAspect_ratio() {

        return aspect_ratio;
    }

    public float getVote_average() {

        return vote_average;
    }

    public int getVote_count() {

        return vote_count;
    }
}
