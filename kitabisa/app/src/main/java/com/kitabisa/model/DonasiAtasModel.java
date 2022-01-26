package com.kitabisa.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class DonasiAtasModel {
    public Drawable imgurl;
    public String juduldonasi;
    public String danaterkumpul;
    public String targetdonasi;
    public String totaldonasi;
    public String totalhari;

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

    public String getDanaterkumpul() {
        return danaterkumpul;
    }

    public void setDanaterkumpul(String danaterkumpul) {
        this.danaterkumpul = danaterkumpul;
    }

    public String getTargetdonasi() {
        return targetdonasi;
    }

    public void setTargetdonasi(String targetdonasi) {
        this.targetdonasi = targetdonasi;
    }

    public String getTotaldonasi() {
        return totaldonasi;
    }

    public void setTotaldonasi(String totaldonasi) {
        this.totaldonasi = totaldonasi;
    }

    public String getTotalhari() {
        return totalhari;
    }

    public void setTotalhari(String totalhari) {
        this.totalhari = totalhari;
    }
}
