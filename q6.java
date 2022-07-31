/*Given an array of strings, return a new array without the strings that are equal to 
the target string. One approach is to count the occurrences of the target string, make 
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"] */
// Id - 21CE002 Andrew
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        System.out.println("Enter length of string array");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []arr = new String[n];
        
        for(int i = 0 ;i<n ;i++)
        {
            arr[i] = sc.next();  
        }
        System.out.println("Enter string for removal");
        String rm = sc.next();
        int j=0;
        for( int i = 0 ;i<n ;i++)
        {
            if(!arr[i].equals(rm))  
            {
                j++;
            }
        }
        String []arr1 = new String[j];

        for( int i = 0 ;i<j ;i++)
        {
            if(!arr[i].equals(rm))  // cnt use == and != because they are objects and there is no overloading opretaor in java
            {
                arr1[i]=arr[i];//cant save in same array due to immutable nature of strings
            }
        }
        // System.out.println(j);
        for( int i = 0 ;i<j ;i++)
        {
            System.out.println(arr1[i]);
        }

    }
}
