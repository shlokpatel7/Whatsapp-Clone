package com.example.shlokpatel.mywhatsapp;

public class Contact {
    String name,message,time;
    int imageSrc;

    public Contact(String name, String message, String time, int imageSrc) {
        this.name = name;
        this.message = message;
        this.time = time;
        this.imageSrc = imageSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }
}
