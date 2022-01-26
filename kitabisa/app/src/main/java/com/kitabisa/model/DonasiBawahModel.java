package com.kitabisa.model;

import android.graphics.drawable.Drawable;

public class DonasiBawahModel {
    public Drawable imgurl;
    public String juduldonasi;
    public String user;
    public String totaldonasi;
    public String sisahari;

    public Drawable getImgurl() {
        return imgurl;
    }

    public void setImgurl(Drawable imgurl) {
        this.imgurl = imgurl;
    }

    public String getJuduldonasi() {
        return juduldonasi;
    }

    public void setJuduldonasi(String juduldonasi) {
        this.juduldonasi = juduldonasi;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTotaldonasi() {
        return totaldonasi;
    }

    public void setTotaldonasi(String totaldonasi) {
        this.totaldonasi = totaldonasi;
    }

    public String getSisahari() {
        return sisahari;
    }

    public void setSisahari(String sisahari) {
        this.sisahari = sisahari;
    }
}
