package com.java;

public class Ex7_4 {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour(-100);
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
    }
}

class Time{
    private int hour;
    private int minute;
    private int second;
    
    public void setHour(int hour) {
        if(isValidHour(hour)) return;
        
        this.hour = hour;
    }
        // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메소드
        private boolean isValidHour(int hour) {
            return hour < 0 || hour > 23;
        }
        public int getHour () {return hour;};
        
 }

