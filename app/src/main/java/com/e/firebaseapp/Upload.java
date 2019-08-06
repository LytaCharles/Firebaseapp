package com.e.firebaseapp;

import android.widget.ImageView;

public class Upload {

    private String imageProfile;
    private String enterName;
    private int phoneNumber;
    private String enterEmail;


    public Upload() {

        //Empty constructor needed
    }

    public Upload(String imageProfile, String enterName, int phoneNumber, String enterEmail) {
        this.imageProfile = imageProfile;
        this.enterName = enterName;
        this.phoneNumber = phoneNumber;
        this.enterEmail = enterEmail;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public String getEnterName() {
        return enterName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEnterEmail() {
        return enterEmail;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public void setEnterName(String enterName) {
        this.enterName = enterName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEnterEmail(String enterEmail) {
        this.enterEmail = enterEmail;
    }

}
