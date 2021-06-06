package com.example.ebook.Model;

public class Book {
    String auther,description,img,linkDown,titleBook;

    public Book(String auther, String description, String img, String linkDown, String titleBook) {
        this.auther = auther;
        this.description = description;
        this.img = img;
        this.linkDown = linkDown;
        this.titleBook = titleBook;
    }

    public Book() {
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setLinkDown(String linkDown) {
        this.linkDown = linkDown;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getAuther() {
        return auther;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return img;
    }

    public String getLinkDown() {
        return linkDown;
    }

    public String getTitleBook() {
        return titleBook;
    }
}
