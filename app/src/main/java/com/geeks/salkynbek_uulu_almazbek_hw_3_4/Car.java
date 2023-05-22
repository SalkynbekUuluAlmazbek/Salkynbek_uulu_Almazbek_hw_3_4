package com.geeks.salkynbek_uulu_almazbek_hw_3_4;

import java.io.Serializable;

public class Car implements Serializable {
    Integer image;
    String name, title, description, color, sum;

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public Car(Integer image, String name, String title, String description, String color, String sum) {
        this.image = image;
        this.name = name;
        this.title = title;
        this.description = description;
        this.color = color;
        this.sum = sum;
    }
}
