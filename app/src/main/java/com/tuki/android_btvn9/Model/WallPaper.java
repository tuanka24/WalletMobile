package com.tuki.android_btvn9.Model;

public class WallPaper {


    private int avt;
    private String tvMonth;

    public WallPaper() {
    }

    public WallPaper(int avt, String tvMonth) {
        this.avt = avt;
        this.tvMonth = tvMonth;
    }

    public int getAvt() {
        return avt;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }

    public String getTvMonth() {
        return tvMonth;
    }

    public void setTvMonth(String tvMonth) {
        this.tvMonth = tvMonth;
    }
}
