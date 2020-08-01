package com.java;

    abstract class Player{ // 추상 클래스 (미완성 클래스)
        abstract void play(int pos); //추상메서드 (몸통{}이 없는 미완성 메서드)
        abstract void stop();  // 추상 메서드
    }
    
    class AudioPlayer extends Player{
        void play(int pos) {System.out.println(pos+"위치부터 play합니다.");} // 추상메서드를 구현 (몸통을 여기서 구현)
        void stop() {System.out.println("재생을 멈춥니다.");} // 추상메서드를 구현 
    
    }
    
    public class Ex7_7 {
    public static void main(String[] args) {
//        Player p = new Player(); // 에러 추상클래스의 인스턴스 생성 불가
        
//        AudioPlayer ap = new AudioPlayer();  
        Player ap = new AudioPlayer();   //다형성 
        ap.play(100);
        ap.stop();
    }
}

