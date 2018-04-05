package com.example.umar.roomdbase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by umar on 18/12/2017.
 */

@Entity
public class User {
    private int image;
    private String name, phone;

    public User(int image, String name, String phone) {
        this.image = image;
        this.name = name;
        this.phone = phone;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}