package com.guidoapps.firestorerecycleradaptersample;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
class Users {
    private String last;


    public Users() {
    }

    public Users(String last) {
        this.last = last;

    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }


}
