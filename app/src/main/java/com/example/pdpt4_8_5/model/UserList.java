package com.example.pdpt4_8_5.model;

public class UserList {
    private String userName;
    private int image;

    public UserList(String userName, int image) {
        this.userName = userName;
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
