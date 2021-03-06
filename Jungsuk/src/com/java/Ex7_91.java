package com.java;

abstract class Unit2{
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
 }

interface Fightable{
    void move(int x, int y); // public abstract 생략됨
    void attact(Fightable f); // public abstract 생략됨
}

class Fighter extends Unit2 implements Fightable{
    // 오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "]로 이동");
    }
    
    public void attact(Fightable f) {
        System.out.println(f + "를 공격");
    }

    
    // 싸울 수 있는 상대를 불러온다.
    Fightable getFightble() {
        Fighter f  = new Fighter(); // Fighter를 생성해서 반환
        return f; // (Fightable)f
    }
}


public class Ex7_91 {

    public static void main(String[] args) {
      Fighter f = new Fighter();
      Fightable f2 = f.getFightble();
    
    }
}
