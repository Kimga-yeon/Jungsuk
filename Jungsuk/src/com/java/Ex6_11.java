package com.java;

class Car2{
    String color;
    String gearType;
    int door;
    
    Car2(){
        this("white","auto",4);
    }
    
    Car2(String color){
        this(color,"auto",4);
    }
    
    // 생성자에서 다른 생성자 호출하기
    // 1. 첫 줄에서만 호출가능 
    // 2. this 를 사용한다
    
    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    
    // this 변수와 this() 생성자는 완전히 다른것이다.
    
    // this = 인스턴스 자신을 가리키는 참조변수, 인스턴스 주소가 저장되어있다
    //        모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재
    
    // this(), this(매개변수) = 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
    

    public Car2(String c, String g) {
        super();
        color = c;
        gearType = g;
    }
    // 생성자의 매개변수로 선언된 변수의 이름이 구분이 간다면
    // this 는 생략 가능하다.
    
}

public class Ex6_11 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        
        System.out.println("c1의 color=" + c1.color + ",gearType="+ c1.gearType
                               +",door=" + c1.door); 
        System.out.println("c2의 color=" + c2.color + ",gearType="+ c2.gearType
                +",door=" + c2.door); 
     }
    

}
