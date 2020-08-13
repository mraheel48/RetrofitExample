package com.example.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class PostDataModel {

    private String Title;

    @SerializedName("body")
    private String Body;

    private int UserId;

    private int Id;

    public String getTitle() {
        return Title;
    }

    public String getBody() {
        return Body;
    }

    public int getUserId() {
        return UserId;
    }

    public int getId() {
        return Id;
    }
}
