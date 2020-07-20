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

    
   /* <멤버변수의 초기화>
    클래스 안의 static{} 초기화블럭이 가장 먼저 수행됨.
    그다음 main메서드가 수행되고
    인스턴스 초기화블럭 수행->생성자 수행

    --초기화 순서--
    클래스 변수(cv) -> 인스턴스 변수(iv)
    자동(0) -> 명시적(간단) -> 초기화블럭, 생성자(복잡) 

    클래스 변수 = 클래스가 처음 로딩될 때 단 한번 수행됨.
    인스턴스 변수 = 인스턴스가 생성 될 때마다 수행됨.*/
}
