package com.example.mvpdemo.Model;

public class Item {
    private String Name;
    private String Image;

    public String getName() {
        return Name+" la toi";
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Item(String name, String image) {
        Name = name;
        Image = image;
    }

    public Item() {
    }
}
