package com.example.spring.notebook.model;

import org.apache.jasper.tagplugins.jstl.core.Url;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;

public class Imag {
    private String title;
    private String about;

    private String img;

    public Imag(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

//    public Image getImg() {
//        return img;
//    }
//
//    public void setImg(String url) throws IOException {
//        Image image = ImageIO.read(new File(url));
//            }

    public static BufferedImage convertToBufferedImage(Image image)
    {
        BufferedImage newImage = new BufferedImage(
                image.getWidth(null), image.getHeight(null),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = newImage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return newImage;
    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
