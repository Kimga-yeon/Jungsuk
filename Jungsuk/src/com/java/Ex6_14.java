package com.java;

public class Ex6_14 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        
        String str = s.info();
        System.out.println(str);
    }
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        super();
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    
    public String info(){
        int sum = (kor + eng + math);
        double a = sum /3.0*10;
        double avg = Math.round(a)/10.0;
        
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+ "," + sum + "," + avg; 
        
    }
    
    
}
