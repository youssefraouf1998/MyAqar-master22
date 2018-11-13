package com.example.ahmed.myaqar;

/**
 * Created by Ahmed on 11/11/2018.
 */

public class List_Item {
    String Title;
    String Description;
    int Image;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public List_Item(String title, String description, int image) {
        Title = title;
        Description = description;

        Image = image;
    }
}
