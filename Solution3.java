package Loops;
//Program to equal operator and not equal operators
import java.util.Scanner;
public class Solution3 {
    public static void main(String[] args) 
    {
        try(Scanner obj=new Scanner(System.in))
        {
            System.out.println("Enter the given two number");
            int a=obj.nextInt();
            int b=obj.nextInt();
            if(a==b)
            {
                System.out.println("Program is equal");
            }
            if (!(a==b))
            {
                System.out.println("Program is not equal");
            }


        }
        
    }
    
}
