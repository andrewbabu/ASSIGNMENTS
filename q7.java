/*
Display numbers in a pyramid pattern.
                   1
                 1 2 1
               1 2 4 2 1
             1 2 4 8 4 2 1
          1 2 4 8 16 8 4 2 1
       1 2 4 8 16 32 16 8 4 2 1
    1 2 4 8 16 32 64 32 16 8 4 2 1
 */
// Id - 21CE002 Andrew
import org.w3c.dom.ls.LSInput;
public class q7 {
    public static void main(String[] args) {
        int n =7;
        for(int i=0;i<7;i++)
        {
            for(int j=6-i;j>0;j--)
            {
                
                System.out.print(" ");
            }
            
            for(int k =0;k<=i;k++)
            {
                System.out.print((int)Math.pow(2,k)+" ");
            }
            for(int l =0;l<=i-1;l++)
            {
                System.out.print((int)Math.pow(2,(i-1)-l)+" ");
            }
            System.out.println();
        }
    }
}
