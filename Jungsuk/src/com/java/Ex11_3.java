package com.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex11_3 {
    public static void main(String[] args) {
        Collection c = new TreeSet(); // Set은 Collection의 자손 
//      Collection c = new HashSet();
        
        // 참조변수를 Collection 으로 하면 클래스가 바뀌어도 
        // 아래 있는 코드들을 검토할 필요가 없다. 
        // 어차피 리모콘이 Collection이기 때문에 Collection에 있는 메소드들만 있기때문 
        
        
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        
       Iterator it = c.iterator();
       
       while(it.hasNext()) {
           Object obj = it.next();
           System.out.println(obj);
       }
       
       // Iterator은 1회용이라 다쓰고나면 다시 얻어와야 한다.
       it = c.iterator(); // 새로운 iterator객체를 얻는다
       
       while(it.hasNext()) {
           Object obj = it.next();
           System.out.println(obj);
       }
       
       
       
//       for(int i=0; i<c.size(); i++) {
//           Object obj = c.get(i);
//           System.out.println(obj);
//       }
       // ArrayList를 HashSet으로 바꿨을 때 
       // HashSet에는 get이 없기 때문에 동작하지 않음.
       // list랑 set은 iterator 동작하기 때문에 동작가능. 
       
       
       
        
        
        
    }
}
