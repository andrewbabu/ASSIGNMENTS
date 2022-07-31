/*Given two non-negative int values, return true if they have the same last digit, such 
as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true */
//Id - 21CE002 Andrew
import java.util.*;
public class q3 {
    static boolean lastDigit(int a,int b){
        if(a%10 == 0 && b% 10 == 0)
        {
            return true;
        }
        else if(b % 10 ==a || a % 10 == b || a ==b ){
            return true;
        }
        else 
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no");
        int b = sc.nextInt();
        System.out.println(lastDigit(a,b));
    }
}
