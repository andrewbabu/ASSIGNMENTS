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
