package com.java;

class Tv{
    boolean power;
    int channel;
    
    void power()    {power = !power;}
    void channelUp()    { ++channel;}
    void channelDown()    {--channel;}
}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaptoin(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaptoin("Hello world");
        ctv.caption = true;
        ctv.displayCaptoin("Hello world");
        
        
        
    }
}
