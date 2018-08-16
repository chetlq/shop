package com.guidoapps.firestorerecycleradaptersample;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
class Users {
    private String last;
    private String image;


    public Users() {
    }

    public Users(String last, String image) {
        this.last = last;
        this.image = image;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
