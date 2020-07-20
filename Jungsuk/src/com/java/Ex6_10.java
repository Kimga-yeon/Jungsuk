package com.java;

public class Ex6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3)결과 : " + mm.add(3,3));
        // int reult = mm.add(3,3);
        // System.out.println("mm.add(3,3) 결과 : " + result);
        // add메서드가 print 메서드보다 먼저 호출되는 이유
        // 위 두 문장을 합친거라고 생각하면 이해가 쉽다. 

        System.out.println("mm.add(3L, 3)결과 : " + mm.add(3L,3));
        System.out.println("mm.add(3, 3L)결과 : " + mm.add(3,3L));
        System.out.println("mm.add(3L, 3L)결과 : " + mm.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과 : " + mm.add(a));

    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.println("int add(int a, int b) - ");
        return a+b;
    }
    long add(int a, long b) {
        System.out.println("int add(int a, long b) - ");
        return a+b;
    }
    long add(long a, int b) {
        System.out.println("int add(long a, int b) - ");
        return a+b;
    }
    long add(long a, long b) {
        System.out.println("int add(long a, long b) - ");
        return a+b;
    }
    int add(int[] a) {
        System.out.println("int add(int a, int b) - ");
        int result = 0;
        for(int i=0; i<a.length; i++) {
            result += a[i];
        }
        return result;
    }
}