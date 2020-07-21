package com.java;

public class Ex6_16 {
    public static boolean isNumber(String str) {
        // 모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false
        // 주어진 문자열이 null이거나 빈문자열 이면 false반환 하시오
        
        if(str==null || str.equals("")) {
            return false;
        }
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch<'0' || ch>'9') {
                return false;
            }
        }
        return true;
    }
    
    
    
    
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
        
        str = "1234o";
        System.out.println(str + "는 숫자입니까?"+ isNumber(str));
    }
}
