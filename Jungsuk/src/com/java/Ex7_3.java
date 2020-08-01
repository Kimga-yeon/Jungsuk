package com.java;

public class Ex7_3 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 {int x = 10; }

class Child2 extends Parent2{
    int x = 20;
    
    void method() {
        System.out.println("x =" +x);
        
         
        
        System.out.println("this.x =" + this.x);
        System.out.println("super.x =" + super.x);
    }
}

// 상속받는 조상클래스와 멤버변수, 지역변수 이름이 같을 떄 
// 상속받은멤버(this) 조상멤버(super)로 구별이 가능하다.
