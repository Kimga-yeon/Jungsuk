import java.util.*;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자1 숫자2 입력 : ");
        String[] str = sc.nextLine().split(" ");
        
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
    
        Dice.dice(a, b);
    }
    
    public static void dice(int a, int b) {
        
       for(int i=1; i<=a; i++) {
           for(int j=1; j<=b; j++) {
               System.out.println(i+"  "+j);
           }
       }
        
    }
}
