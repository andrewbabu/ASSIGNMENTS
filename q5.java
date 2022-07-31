/*Given 2 strings, a and b, return the number of the positions where they contain the 
same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0 */
// Id - 21CE002
import java.util.*;
public class q5 {
    static int stringMatch(String a,String b)
{
    int counter = 0;
    for(int i=0;(i<a.length()-2) && (i<b.length()-2); i++)
    {
        String asub = a.substring(i,i+2);
        String bsub = b.substring(i,i+2);

        if(asub.equals(bsub)){
            counter ++;
        }
    }
    return counter;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String a = sc.next();
        System.out.println("Enter 2nd string:");
        String b = sc.next();
        System.out.println("No of matching substrings"+stringMatch(a, b));
    }
}
