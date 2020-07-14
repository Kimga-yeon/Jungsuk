import java.util.Scanner;

public class IsLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하시오 :");
        int year = sc.nextInt();
        
        
        boolean result = isLeap(year);
        
        
        if(result)
            System.out.println("윤년");
        else
            System.out.println("윤년 아님");
    }
    
     static boolean isLeap(int year) {
         if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
             return true;
         }else {
             return false;
         }
         
    }
}
