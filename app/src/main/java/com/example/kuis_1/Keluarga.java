package com.example.kuis_1;

import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.ImageView;

public class Keluarga {
    private Drawable Image_kuh;
    private String Nama, Status;

    public Keluarga(Drawable image_kuh, String nama, String status) {
        Image_kuh = image_kuh;
        Nama = nama;
        Status = status;
    }

    public Drawable getImage_kuh() {
        return Image_kuh;
    }

    public void setImage_kuh(Drawable image_kuh) {
        Image_kuh = image_kuh;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
