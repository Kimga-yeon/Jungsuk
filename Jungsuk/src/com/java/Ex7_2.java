package com.java;

class Parent {
    void parentMethod() {}
}

class Child extends Parent{
    void parentMethod() {}        // 오버라이딩 
    void parentMethod(int i) {}   // 오버로딩
    
    void childMethod() {}   
    void childMethod(int i) {} // 오버로딩
//    void childMethod() {}    // 중복 에러    
}

// 오버로딩 - 메소드이름 동일, 매개변수의 갯수나 타입 달라야함
// 오버라이딩 - 선언부동일(반환타입, 메소드이름, 매개변수 목록)