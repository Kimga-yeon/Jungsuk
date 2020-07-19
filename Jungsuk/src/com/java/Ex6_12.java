package com.java;

public class Ex6_12 {
    // 클래스 초기화 블럭
    static {
        System.out.println("static { }");
    }
    // 인스턴스 초기화 블럭
    {
        System.out.println("{ }");
    }
    
    public Ex6_12() {
        System.out.println("생성자");
    }
    
    public static void main(String[] args) {
        System.out.println("Ex6_12 bt = new Ex6_12(); ");
        Ex6_12 bt = new Ex6_12();
        
        System.out.println("Ex6_12 bt = new Ex6_12(); ");
        Ex6_12 bt2 = new Ex6_12();
    }

}
