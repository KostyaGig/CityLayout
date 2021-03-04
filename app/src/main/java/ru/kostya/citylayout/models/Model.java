package ru.kostya.citylayout.models;

public class Model {

    private int image;
    private String text,data,time;

    public Model() {
    }

    public Model(int image, String text, String data, String time) {
        this.image = image;
        this.text = text;
        this.data = data;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
