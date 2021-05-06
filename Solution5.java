//import java.util.Scanner;
public class Solution5 {
    public static void main(String[] args) 
    {
        int a=34,b=64,c=57;
        //int i=0;
        Greatest(a, b, c);

    }

    private static void Greatest(int a, int b, int c) 
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }
}
