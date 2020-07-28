package com.java;

public class Ex7_5 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();
        FireEngine fe3 = null;
        fe.drive();
        fe.water();
        
        // 자손->조상 (형변환 생략가능)
        car = fe;
        car.drive();
//        car.water();
        
        // 조상->자손 (형변환 생략불가)
        fe2 = (FireEngine)car;                                  
        fe2.drive();
        fe2.water();
        
    }
}

class Car{
    String color;
    int door;
    
    void drive() {
        System.out.println("drive,brrr~~~");
    }
    
    void stop() {
        System.out.println("stop!!!");
    }
    
}

class FireEngine extends Car{
    void water() {
        System.out.println("water!!!");
    }
}
