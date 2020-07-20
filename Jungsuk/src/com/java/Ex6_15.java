package com.java;

public class Ex6_15 {
    public static void change(String str) {
//       String sum = 
               str += "456";
//       System.out.println(sum);
    }
    
    // 
    
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change : " + str);
        
    }
}
